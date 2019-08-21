package analyses

import java.io.{File, FileWriter}
import java.net.URL

import classifier.{MethodClassifier, StringClassifier, Utils}
import main.StringDecryption
import org.opalj.br.analyses.{Project, StringConstantsInformationKey}

class StringAndMethodAnalysis(val project: Project[URL], val parameters: Seq[String]) {


  def doAnalyze(t0: Long): Unit = {

    val t1 = System.currentTimeMillis()

    val resultStream = new FileWriter(new File(StringDecryption.outputDir + "/results/" + parameters.head + ".txt"), false)
    val logStream = new FileWriter(new File(StringDecryption.outputDir + "/logs/" + parameters.head + "Log.txt"), false)
    logStream.write("Apk;PreAnalysisTime;StringClassifierTime;MethodClassifierTime;OverallTime;ClassCount;MethodCount;MeanInstPerMethodCount;MedianInstPerMethodCount;MaxInstPerMethodCount;ApkInstCount;StringUniqCount\n")

    try {
      val stringUsages = project.get(StringConstantsInformationKey).filter(s => s._1.nonEmpty && s._1.length > 4 && s._1.replaceAll("[,\n\r]", "").length > 2).toSet

      for (string <- stringUsages.par) {

        if (StringClassifier.classify(string._1, string._2.head.method)) {
          resultStream.append(s"${string._2.head.method.classFile.fqn};${string._2.head.method.signatureToJava(false)};${string._1.replaceAll("[;,\n\r]", "")}\n")
          resultStream.flush()
        }
      }
    } catch{
      case e:Throwable => StringDecryption.logger.error(parameters.head)
        StringDecryption.logger.error(e.getMessage)
    }

    val t2 = System.currentTimeMillis()

    Utils.resetLibraries(project)


    try {
      val decryptionMethods = project.allMethodsWithBody.par.filter(m => MethodClassifier.classify(m, project))
      for (decryptionMethod <- decryptionMethods) {
        resultStream.append(s"${decryptionMethod.classFile.fqn};${decryptionMethod.signature.toJava};\n")
      }
    } catch {
      case e: Throwable => StringDecryption.logger.error(parameters.head)
        StringDecryption.logger.error(e.getMessage)
    }

    val t3 = System.currentTimeMillis()

    //APKName,PreAnalysisTime,StringClassifierTime,MethodClassifierTime,OverallTime,
    // ClassCount,MethodCount,
    // MeanInstPerMethodCount,
    // MedianInstPerMethodCount,
    // MaxInstPerMethodCount,
    // ApkInstCount,
    // StringUniqCount
    val allInstructionCounts = project.allMethodsWithBody.par.map(m => m.body.get.instructionsCount).toList.sorted
    logStream.write(Array(parameters.head, t1 - t0, t2 - t1, t3 - t2, t3 - t0,
      project.allProjectClassFiles.size, project.allMethods.size,
      allInstructionCounts.sum.toDouble / (if (allInstructionCounts.nonEmpty) allInstructionCounts.size else 1),
      if (allInstructionCounts.nonEmpty) allInstructionCounts(allInstructionCounts.size / 2) else 0,
      if (allInstructionCounts.nonEmpty) allInstructionCounts.max else 0,
      allInstructionCounts.sum,
      project.get(StringConstantsInformationKey).keySet.size).mkString("", ";", "\n"))

    logStream.close()
    resultStream.close()

  }

}
