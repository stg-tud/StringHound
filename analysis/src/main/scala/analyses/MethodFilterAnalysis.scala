package analyses

import java.io.{File, FileWriter}
import java.net.URL

import classifier.MethodClassifier
import main.StringDecryption
import org.opalj.br.analyses.{Project, StringConstantsInformationKey}

class MethodFilterAnalysis(val project: Project[URL], val parameters: Seq[String]) {


  def doAnalyze(t0: Long): Unit = {

    val resultStream = new FileWriter(new File(StringDecryption.outputDir + "/results/" + parameters.head + ".txt"), false)
    val logStream = new FileWriter(new File(StringDecryption.outputDir + "/logs/" + parameters.head + "Log.txt"), false)
    logStream.write("Apk;PreAnalysisTime;MethodClassifierTime,OverallTime,ClassCount,MethodCount,MeanInstPerMethodCount,MedianInstPerMethodCount,MaxInstPerMethodCount,ApkInstCount,StringUniqCount\n")
    val t1 = System.currentTimeMillis()
    val decryptionMethods = project.allMethodsWithBody.par.filter(m => MethodClassifier.classify(m, project)).seq

    val t2 = System.currentTimeMillis()
    for (decryptionMethod <- decryptionMethods) {
      resultStream.append(s"${decryptionMethod.classFile.fqn};${decryptionMethod.signature.toJava}\n")
    }

    val allInstructionCounts = project.allMethodsWithBody.par.map(m => m.body.get.instructionsCount).toList.sorted
    logStream.write(Array(parameters.head, t1 - t0, t2 - t1, t2 - t0,
      project.allProjectClassFiles.size, project.allProjectClassFiles.map(c => c.methods.size).sum,
      allInstructionCounts.sum.toDouble / (if (allInstructionCounts.nonEmpty) allInstructionCounts.size else 1),
      if (allInstructionCounts.nonEmpty) allInstructionCounts(allInstructionCounts.size / 2) else 0,
      if (allInstructionCounts.nonEmpty) allInstructionCounts.max else 0,
      allInstructionCounts.sum,
      project.get(StringConstantsInformationKey).keySet.size).mkString("", ",", "\n"))
    logStream.close()

    resultStream.close()

  }

}
