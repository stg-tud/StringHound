package analyses

import java.io.{File, FileWriter}

import classifier.StringClassifier
import main.StringDecryption

import scala.io.Source

class StringClassifierAnalysis(stringsFile: File, val parameters: Seq[String]) {


  def doAnalyze(t0: Long): Unit = {

    val resultStream = new FileWriter(new File(StringDecryption.outputDir + "/results/" + parameters.head + ".txt"), false)
    val logStream = new FileWriter(new File(StringDecryption.outputDir + "/logs/" + parameters.head + "Log.txt"), false)
    logStream.write("AnalysisTime;StringCount\n")
    val strings = Source.fromFile(stringsFile.getAbsolutePath, "UTF-8").getLines().filter(l => l.nonEmpty).toList
    val encryptedStrings =
      strings.filter(s ⇒ StringClassifier.classify(s))

    for (encryptedString <- encryptedStrings) {
      resultStream.append(s"$encryptedString\n")
    }
    val t1 = System.currentTimeMillis()
    logStream.write((t1 - t0) + ";" + strings.size+"\n")
    logStream.close()
    resultStream.close()

  }

}
