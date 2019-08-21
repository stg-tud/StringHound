package helper

import java.io.File
import java.net.URL

import org.opalj.br.MethodWithBody
import org.opalj.br.analyses.{AnalysisExecutor, BasicReport, OneStepAnalysis, Project}
import org.opalj.log.{ConsoleOPALLogger, OPALLogger}

import scala.collection.mutable
import scala.io.Source

object AndroidJarAnalysis extends AnalysisExecutor {

  var results = mutable.Set.empty[Int]

  var theProject: Option[Project[URL]] = None


  val analysis = new OneStepAnalysis[URL, BasicReport] {

    override def doAnalyze(
                            project: Project[URL],
                            parameters: Seq[String],
                            isInterrupted: () => Boolean): BasicReport = {

      OPALLogger.updateLogger(project.logContext, new ConsoleOPALLogger(true, org.opalj.log.Error))
      theProject = Some(project)
      results = mutable.Set.empty[Int]
      if (project.allProjectClassFiles.size != 0) {
        for {
          cf <- project.allProjectClassFiles
          method@MethodWithBody(body) <- cf.methods if method.body.isDefined
        } {
          val methodInvokes = body.instructions.filter(i => i != null && i.isMethodInvocationInstruction)
          if (methodInvokes != null && methodInvokes.nonEmpty)
            for (inst <- methodInvokes.map(i => i.asMethodInvocationInstruction))
              results += (inst.declaringClass.toJava + "." + inst.methodDescriptor.toJava(inst.name)).hashCode
        }

      }
      BasicReport("")
    }
  }

  def identifyAndroidJar(jar: File): String = {
    AndroidJarAnalysis.main(Array("-cp=" + jar.getAbsolutePath))
    val methodCalls = AndroidJarAnalysis.results.toSet
    val androidJars = Set(
      (3, android3.intersect(methodCalls).size),
      (4, android4.intersect(methodCalls).size),
      (5, android5.intersect(methodCalls).size),
      (6, android6.intersect(methodCalls).size),
      (7, android7.intersect(methodCalls).size),
      (8, android8.intersect(methodCalls).size),
      (9, android9.intersect(methodCalls).size),
      (10, android10.intersect(methodCalls).size),
      (11, android11.intersect(methodCalls).size),
      (12, android12.intersect(methodCalls).size),
      (13, android13.intersect(methodCalls).size),
      (14, android14.intersect(methodCalls).size),
      (15, android15.intersect(methodCalls).size),
      (16, android16.intersect(methodCalls).size),
      (17, android17.intersect(methodCalls).size),
      (18, android18.intersect(methodCalls).size),
      (19, android19.intersect(methodCalls).size),
      (20, android20.intersect(methodCalls).size),
      (21, android21.intersect(methodCalls).size),
      (22, android22.intersect(methodCalls).size),
      (23, android23.intersect(methodCalls).size),
      (24, android24.intersect(methodCalls).size),
      (25, android25.intersect(methodCalls).size)
    )
    var max = androidJars.map(_._2).max
    max = androidJars.filter(i => i._2 == max).maxBy(_._1)._1
    "android-platforms/android-" + max + "/android.jar"
  }

  val androidJars: Set[String] = Source.fromFile("androidMethodSignatures/androidMethodSignatures.txt", "UTF-8").getLines().toSet

  val android3: Set[Int] = androidJars.filter(l => l.startsWith("android3:")).map(l => l.split(":")(1).hashCode)
  val android4: Set[Int] = androidJars.filter(l => l.startsWith("android4:")).map(l => l.split(":")(1).hashCode)
  val android5: Set[Int] = androidJars.filter(l => l.startsWith("android5:")).map(l => l.split(":")(1).hashCode)
  val android6: Set[Int] = androidJars.filter(l => l.startsWith("android6:")).map(l => l.split(":")(1).hashCode)
  val android7: Set[Int] = androidJars.filter(l => l.startsWith("android7:")).map(l => l.split(":")(1).hashCode)
  val android8: Set[Int] = androidJars.filter(l => l.startsWith("android8:")).map(l => l.split(":")(1).hashCode)
  val android9: Set[Int] = androidJars.filter(l => l.startsWith("android9:")).map(l => l.split(":")(1).hashCode)
  val android10: Set[Int] = androidJars.filter(l => l.startsWith("android10:")).map(l => l.split(":")(1).hashCode)
  val android11: Set[Int] = androidJars.filter(l => l.startsWith("android11:")).map(l => l.split(":")(1).hashCode)
  val android12: Set[Int] = androidJars.filter(l => l.startsWith("android12:")).map(l => l.split(":")(1).hashCode)
  val android13: Set[Int] = androidJars.filter(l => l.startsWith("android13:")).map(l => l.split(":")(1).hashCode)
  val android14: Set[Int] = androidJars.filter(l => l.startsWith("android14:")).map(l => l.split(":")(1).hashCode)
  val android15: Set[Int] = androidJars.filter(l => l.startsWith("android15:")).map(l => l.split(":")(1).hashCode)
  val android16: Set[Int] = androidJars.filter(l => l.startsWith("android16:")).map(l => l.split(":")(1).hashCode)
  val android17: Set[Int] = androidJars.filter(l => l.startsWith("android17:")).map(l => l.split(":")(1).hashCode)
  val android18: Set[Int] = androidJars.filter(l => l.startsWith("android18:")).map(l => l.split(":")(1).hashCode)
  val android19: Set[Int] = androidJars.filter(l => l.startsWith("android19:")).map(l => l.split(":")(1).hashCode)
  val android20: Set[Int] = androidJars.filter(l => l.startsWith("android20:")).map(l => l.split(":")(1).hashCode)
  val android21: Set[Int] = androidJars.filter(l => l.startsWith("android21:")).map(l => l.split(":")(1).hashCode)
  val android22: Set[Int] = androidJars.filter(l => l.startsWith("android22:")).map(l => l.split(":")(1).hashCode)
  val android23: Set[Int] = androidJars.filter(l => l.startsWith("android23:")).map(l => l.split(":")(1).hashCode)
  val android24: Set[Int] = androidJars.filter(l => l.startsWith("android24:")).map(l => l.split(":")(1).hashCode)
  val android25: Set[Int] = androidJars.filter(l => l.startsWith("android25:")).map(l => l.split(":")(1).hashCode)

}
