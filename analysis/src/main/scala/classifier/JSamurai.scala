package classifier

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

object JSamurai {

  private val prefixes = Source.fromFile("prefixes.txt").getLines.toSet
  private val suffixes = Source.fromFile("suffixes.txt").getLines.toSet

  var freqMap = mutable.Map.empty[String, Long]
  Source.fromFile("dict.txt").
    getLines.foreach { l =>
    val split1 = l.split(";")
    freqMap += split1(0).toLowerCase -> (freqMap.getOrElse(split1(0).toLowerCase, 0L) + split1(1).toLong)
  }
  val originalMap: Map[String, Long] = freqMap.toMap
  var freqCount: Long = freqMap.values.sum

  def split(s: String): List[String] = splitMixedCase(s)

  def splitDigitToUpperCase(toSplit: String): List[String] = {
    val split = ListBuffer.empty[String]
    var line = ListBuffer.empty[Char]
    var isPreviousLower = false
    for (c <- toSplit.toCharArray) {
      if (Character.isLetter(c)) {
        if (Character.isUpperCase(c) && isPreviousLower) {
          if (line.nonEmpty) split += line.mkString
          isPreviousLower = false
          line = ListBuffer(c)
        } else {
          isPreviousLower = Character.isLowerCase(c)
          line += c
        }
      } else {
        isPreviousLower = false
        if (line.nonEmpty) {
          split += line.mkString
        }
        split += c.toString
        line = ListBuffer.empty[Char]
      }
    }
    if (line.nonEmpty) split += line.mkString
    split.toList
  }

  def splitMixedCase(token: String): List[String] = {
    var subToken = ListBuffer.empty[String]
    for (s <- splitDigitToUpperCase(token)) {
      var s2 = s
      var i = 0
      while (i < s2.length - 1) {
        if (Character.isUpperCase(s2.charAt(i)) && Character.isLowerCase(s2.charAt(i + 1))) {
          val n = s2.length
          var camelScore = 0.0D
          if (i > 0) camelScore = score(s2.substring(i, n))
          else camelScore = score(s2)
          val altScore = score(s2.substring(i + 1, n))
          if (camelScore > Math.sqrt(altScore)) {
            if (i > 0) {
              subToken += s2.substring(0, i).trim
              s2 = s2.substring(i, n).trim
            }
          }
          else if (i > 0) {
            subToken += s2.substring(0, i + 1).trim
            s2 = s2.substring(i + 1, n).trim
          }
        }
        i += 1
      }
      subToken += s2
    }
    /*val token2 = subToken.toList
    subToken = ListBuffer.empty[String]
    for (s <- token2) {
      if ((s.length > 6 && !s.toLowerCase.matches("[0-9a-f]+") && s.length - eliminateSequences(s).length < 4) || s.length <= 6) {
        subToken ++= splitSameCase(s, score(s), mutable.Map.empty[String, List[String]])
      } else subToken += s
    }*/
    subToken.toList
  }

  def eliminateSequences(string: String): String = {
    val str = string.toCharArray
    val ret = new StringBuffer()
    var i = 3
    while (i < str.length) {
      if (str(i) != str(i - 1) || str(i) != str(i - 2) || str(i) != str(i - 3))
        ret.append(str(i - 3))
      i += 1
    }
    i -= 1
    if (str(i) != str(i - 1))
      ret.append(str(i - 1))
    if (str(i) != str(i - 2))
      ret.append(str(i - 2))
    if (str(i) != str(i - 3))
      ret.append(str(i - 3))
    ret.toString
  }

  def splitSameCase(s: String, scoreNs: Double, map: mutable.Map[String, List[String]]): List[String] = {
    assert(suffixes.nonEmpty && prefixes.nonEmpty, "Suffixes and prefixes should not be empty")
    var splitS = List(s)
    var maxScore = -1.0
    var i = 0
    while (i <= s.length - 1) {
      val left = s.substring(0, i + 1)
      val right = s.substring(i + 1, s.length)
      val scoreLeft = score(left)
      val scoreRight = score(right)
      val prefix = prefixes.contains(left.toLowerCase) || suffixes.contains(right.toLowerCase)
      val toSplitLeft = Math.sqrt(scoreLeft) > Math.max(score(s), scoreNs)
      val toSplitRight = Math.sqrt(scoreRight) > Math.max(score(s), scoreNs)
      if (!prefix && toSplitLeft && toSplitRight) {
        if (scoreLeft + scoreRight > maxScore) {
          maxScore = scoreLeft + scoreRight
          splitS = List(left, right)
          map += s -> List(left, right)
        }
      }
      else if (!prefix && toSplitLeft) {
        val temp = map.getOrElse(right, {
          val t = splitSameCase(right, scoreNs, map)
          map += right -> t
          t
        })
        if (temp.size > 1) {
          splitS = List(left) ++ temp
        }
      }
      i += 1
    }

    splitS
  }

  def score(s: String): Double = {
    assert(freqCount > 0, "Frequency cannot be zero!")
    val upper: Double = originalMap.getOrElse(s.toLowerCase, 0L).toDouble
    freqMap.getOrElse(s.toLowerCase, 0L).toDouble + (upper / Math.log10(freqCount.toDouble))
  }

}
