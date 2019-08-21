package analyses

import java.io.{File, FileWriter}

import classifier.StringClassifier
import main.StringDecryption

import scala.io.Source

class StringFeatureExtraction(stringsFile: File, val parameters: Seq[String], filterSet: Set[String]) {


  def doAnalyze(): Unit = {

    val resultStream = new FileWriter(new File(StringDecryption.outputDir + "/results/" + parameters.head + ".txt"), false)
    val strings = Source.fromFile(stringsFile.getAbsolutePath, "UTF-8").getLines().filter(l => l.nonEmpty)

    for (string <- strings) {
      resultStream.write((List(string.replaceAll("[\n\r,]", "")) ++ StringClassifier.getStatistics(string)).mkString(",") + (if (filterSet.isEmpty) ",0" else ",1") + "\n")
      resultStream.flush()
    }

    resultStream.close()

  }

}
