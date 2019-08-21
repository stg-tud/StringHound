package classifier

import java.io.{ByteArrayOutputStream, StringReader}
import java.util.zip.GZIPOutputStream

import org.apache.lucene.analysis.icu.segmentation.ICUTokenizer
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute
import org.opalj.br.Method
import text.TextParser

import scala.collection.immutable.HashSet
import scala.collection.mutable.ListBuffer
import scala.io.Source

object StringClassifier {

  val parser: TextParser = new TextParser()

  val dict: HashSet[Int] = Source.fromFile("hashDict.txt", enc = "UTF-8").getLines().map(l => l.toInt).to[HashSet]


  def classify(str: String): Boolean = {
    val obj: Array[AnyRef] = calculateStatistics(str, 0.0).map(i => i.asInstanceOf[AnyRef])
    WekaStringREPTree.classify(obj) >= 0.9
  }

  def classify(str: String, method: Method): Boolean = {
    val obj: Array[AnyRef] = calculateStatistics(str, if (method.classFile.fqn.startsWith("org/bouncycastle/")
      || method.classFile.fqn.startsWith("signgate/core/crypto/")
      || method.classFile.fqn.startsWith("org/spongycastle/")) 1.0 else 0.0).map(i => i.asInstanceOf[AnyRef])

    WekaStringREPTree.classify(obj) >= 0.9
  }

  def getStatistics(str: String, method: Method): Array[Double] = {
    calculateStatistics(str, if (method.classFile.fqn.startsWith("org/bouncycastle/")
      || method.classFile.fqn.startsWith("signgate/core/crypto/")
      || method.classFile.fqn.startsWith("org/spongycastle/")) 1.0 else 0.0)
  }

  def getStatistics(str: String): Array[Double] = {
    calculateStatistics(str, 0.0)
  }

  private def calculateStatistics(str: String, methodVal: Double): Array[Double] = {
    var tags1 = Set[String]()
    try {
      tags1 = parser.getKeys(str).toArray.map(a => a.asInstanceOf[String]).toSet[String]
    } catch {
      case _: Throwable =>
    }
    val arr = Array.fill(22)(0.0)
    if (tags1 != null && tags1.nonEmpty) tags1.foreach(t => if (tags2.contains(t)) arr(tags2(t)) = 1) //contains known format
    val knownWords = split(str).flatMap(s => JSamurai.split(s)).filter(w => dict.contains(w.toLowerCase().hashCode))

    val obj: Array[Double] = (arr.toList ++ List(if (str.startsWith("30820")) 1.0 else 0.0,
      if (str.startsWith("MII")) 1.0 else 0.0,
      if (str.startsWith("iVBORw0KGgoAA")) 1.0 else 0.0,
      if (new String(str.getBytes("ASCII"), "ASCII").contains("California") || new String(str.getBytes("ASCII"), "ASCII").contains("Google Inc")) 1.0 else 0.0
      , if (new String(str.getBytes("ASCII"), "ASCII").contains("Android Debug")) 1.0 else 0.0,
      methodVal) ++
      statistics(str, knownWords)).toArray
    obj
  }


  def split(str: String): List[String] = {
    var list = ListBuffer.empty[String]
    val tokenizer = new ICUTokenizer()
    tokenizer.setReader(new StringReader(str))
    tokenizer.reset()
    try {
      while (tokenizer.incrementToken) list += tokenizer.getAttribute(classOf[CharTermAttribute]).toString
    } catch {
      case _: Throwable =>
    } finally {
      tokenizer.close()
    }
    list.toList
  }

  def statistics(str: String, knownWords: List[String]) = Array(
    str.length.toDouble,
    {
      val set = str.toCharArray.toSet
      set.map(c => str.toCharArray.count(c1 => c1 == c).toDouble).sum / (if (set.nonEmpty) set.size else 1.0)
    },
    maxSingleCharOccurrence(str).toDouble / (if (str.length > 0) str.length else 1),
    str.count(!_.isLetter).toDouble / (if (str.length > 0) str.length else 1),
    str.count(_.isDigit).toDouble / (if (str.length > 0) str.length else 1),
    str.toLowerCase.count(c ⇒ "aeiou".indexOf(c.toInt) >= 0).toDouble / (if (str.length > 0) str.length else 1),
    str.toLowerCase.count(c ⇒ "aeiou".indexOf(c.toInt) < 0 && c.isLetter && !c.isDigit).toDouble / (if (str.length > 0) str.length else 1),
    maxSameCharInRow(str.toLowerCase).toDouble,
    JSamurai.splitDigitToUpperCase(str).length.toDouble,
    wordSize(str),
    numEquals(str),
    numDashes(str),
    numSlashes(str),
    numPluses(str),
    sumRepChars(str),
    if (str.nonEmpty && str.replaceAll("[\\p{Punct}\\p{Space}\\p{Sc}]", "").length > 0) knownWords.map(k => k.length).sum.toDouble / str.replaceAll("[\\p{Punct}\\p{Space}\\p{Sc}]", "").length else 0.0,
    knownWords.size,
    knownWords.toSet.size,
    if (knownWords.nonEmpty) knownWords.map(k => k.length).min else 0,
    if (knownWords.nonEmpty) knownWords.map(k => k.length).max else 0,
    {
      val largest = if (str.isEmpty) 0.0 else str.toCharArray.toSet.map((c: Char) => str.toCharArray.count((c1: Char) => c1 == c).toDouble).max
      val avg = str.length.toDouble / 256
      largest.toDouble / (avg + 5 * math.log10(avg))
    }, {
      val uniqChars = str.toCharArray.toSet.size
      chiSquare(Array.fill(uniqChars)(str.length / uniqChars), str.toCharArray.toSet.map((c: Char) => str.toCharArray.count((c1: Char) => c1 == c)).toArray)
    },
    entropyNormalized(str),
    compress(str)
  )

  def chiSquare(expected: Array[Int], observed: Array[Int]): Double = {
    if (expected.length < 2) return 0d
    if (expected.length != observed.length) return 0d
    val sumExpected = expected.sum
    val sumObserved = observed.sum
    var ratio = 1.0d
    var rescale = false
    if (math.abs(sumExpected - sumObserved) > 10E-6) {
      ratio = sumObserved / sumExpected
      rescale = true
    }
    var sumSq = 0.0d
    var i = 0
    while (i < observed.length) {
      if (rescale) {
        val dev = observed(i) - ratio * expected(i)
        sumSq += dev * dev / (ratio * expected(i))
      } else {
        val dev = observed(i) - expected(i)
        sumSq += dev * dev / expected(i)
      }

      i += 1
    }
    sumSq
  }

  def maxSingleCharOccurrence(name: String): Int = if (name.isEmpty) 0 else name.toCharArray.
    foldLeft(Map.empty[Char, Int])((map, value) ⇒ map + (value → (map.getOrElse(value, 0) + 1))).values.max

  def maxSameCharInRow(name: String): Int = {
    var max = 0
    if (name.length > 0) {
      max = 1
      var lastChar = name.charAt(0)
      var count = 1
      for (i ← 1 until name.length) {
        if (name(i) == lastChar) {
          count += 1
          if (count > max) max = count
        } else {
          count = 1
          lastChar = name(i)
        }
      }
    }
    max
  }

  def entropyNormalized(v: String): Double = {
    v
      .groupBy(a => a)
      .values
      .map(i => i.length.toDouble / v.length)
      .map(p => -p * math.log10(p) / math.log10(2))
      .sum
  }


  def compress(str: String): Double = {
    if ((str == null) || (str.length == 0)) return 0.0
    val obj = new ByteArrayOutputStream()
    val gzip = new GZIPOutputStream(obj)
    gzip.write(str.getBytes("UTF-8"))
    gzip.flush()
    gzip.close()
    val gzipVal = obj.toByteArray.length.toDouble
    val max = math.max(str.length.toDouble, gzipVal)
    if (max != str.length) {
      1.0 - (str.length.toDouble / (if (gzipVal == 0) 1.0 else gzipVal))
    } else gzipVal / str.length
  }

  def wordSize(s: String): Double = s.split("[^a-zA-Z_\\-0-9]").length

  def length(s: String): Double = s.length

  def numEquals(s: String): Double = s.count(c => c == '=')

  def numDashes(s: String): Double = s.count(c => c == '-')

  def numSlashes(s: String): Double = s.count(c => c == '/')

  def numPluses(s: String): Double = s.count(c => c == '+')

  def sumRepChars(s: String): Double = s.toSet.count(c => s.count(i => i == c) > 1)

  def entropy(s: String): Double = {
    val en = -s.toCharArray.toSet.map((c: Char) => s.count(i => i == c).toDouble / s.length.toDouble).map(p => p * math.log(p)).sum
    if (en.isNaN) 0 else en
  }

  def avgEntropy(set: Set[String]): Double =
    set.map((s: String) => entropy(s)).sum / set.size //Avg_Entropy

  def avgWordSize(set: Set[String]): Double =
    set.map(s => wordSize(s)).sum / set.size //Avg_Wordsize

  def avgLength(set: Set[String]): Double =
    set.map(s => s.length).sum.toDouble / set.size //Avg_Length

  def avgNumEquals(set: Set[String]): Double =
    set.map(s => numEquals(s)).sum / set.size //Avg_Num_Equals

  def avgNumDashes(set: Set[String]): Double =
    set.map(s => numDashes(s)).sum / set.size //Avg_Num_Dashes

  def avgNumSlashes(set: Set[String]): Double =
    set.map(s => numSlashes(s)).sum / set.size //Avg_Num_Slashes

  def avgNumPluses(set: Set[String]): Double =
    set.map(s => numPluses(s)).sum / set.size //Avg_Num_Pluses

  def avgSumRepChars(set: Set[String]): Double =
    set.map(s => sumRepChars(s)).sum / set.size //Avg_Sum_RepChars

  val tags2: Map[String, Int] = Map[String, Int]("xsd" -> 0, "xpath" -> 0, "user agent" -> 1, "url" -> 2, "uri" -> 2, "regex" -> 3,
    "network protocols" -> 4, "ip protocols" -> 4, "bluetooth protocol" -> 4,
    "android command" -> 5, "windows command" -> 5, "mac command" -> 5, "linux command" -> 5, "json" -> 6, "encoding" -> 7,
    "e-mail" -> 8, "dtd" -> 9, "html color" -> 10, "color" -> 10, "classpath" -> 11, "sql select" -> 12, "sql update" -> 12,
    "sql insert" -> 12, "sql delete" -> 12, "sql replace" -> 12, "sql create table" -> 12, "sql drop" -> 12,
    "sql truncate" -> 12, "ruby program" -> 13, "python program" -> 13, "prolog program" -> 13, "js program" -> 13,
    "java program" -> 13, "cpp program" -> 13, "c program" -> 13,
    "country" -> 14, "xml" -> 0, "html" -> 0,
    "ip" -> 15, "http state" -> 16, "date" -> 17, "integer" -> 18, "double" -> 18, "boolean" -> 18, "crypto" -> 19,
    "brand" -> 20, "html special" -> 21)


}
