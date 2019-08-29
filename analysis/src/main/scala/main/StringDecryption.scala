package main

import java.io._
import java.security.Permission
import java.text.SimpleDateFormat
import java.util.Date

import analyses._
import classifier.Utils
import helper.AndroidJarAnalysis
import org.apache.commons.cli.{DefaultParser, Options}
import org.opalj.br.analyses.Project
import org.opalj.log._
import org.slf4j.{Logger, LoggerFactory}

import scala.io.Source

object StringDecryption {

  val logger: Logger = LoggerFactory.getLogger(StringDecryption.getClass)
  var outputDir = "."

  val options = new Options()

  options.addOption("f", "file", true, "input file <jar or file with file paths>")
  options.addOption("s", "single", false, "analyzes only a single input file")
  options.addOption("st", "strings", false, "only string classifier on string files")
  options.addOption("m", "method", false, "only method filter")
  options.addOption("stm", "stringmethod", false, "executes method filter and string classifier on code")
  options.addOption("sstat", "stringstatistics", false, "extracts features for strings only for single input")
  options.addOption("cstat", "codestatistics", false, "extracts features for strings in code")
  options.addOption("o", "outputdir", true, "sets the output directory")
  options.addOption("bf", "bruteforce", false, "enables brute force decryption for slicing")
  options.addOption("d", "debug", false, "disables threading for debug purposes")
  options.addOption("j", "isjava", false, "loads additional libraries for slicing of java applications")

  val logSlicing = true


  val stdLib: File = org.opalj.bytecode.RTJar

  def enableSystemExitCall(): Unit = {
    System.setSecurityManager(null)
  }

  def forbidSystemExitCall(): Unit = {
    val securityManager = new SecurityManager() {
      override def checkPermission(permission: Permission): Unit = {
        if (permission.getName.contains("exitVM")) throw new ExitTrappedException
      }
    }
    System.setSecurityManager(securityManager)
  }

  def createDirs(outputDir: String): Unit = {
    new File(outputDir + "/results/").mkdir()
    new File(outputDir + "/logs/").mkdir()
  }

  def main(args: Array[String]): Unit = {
    val command = new DefaultParser()

    try {

      val line = command.parse(options, args)

      if (line.hasOption("o")) {
        outputDir = line.getOptionValue("o")
      }

      createDirs(outputDir)

      val filename = line.getOptionValue("f")
      val file = new File(filename)
      if (!file.exists() || !file.isFile) {
        println("File not found: " + filename)
        throw new Exception("File not found: " + filename)
      }
      var jar = file
      if (file.getName.endsWith(".apk")) {
        jar = Utils.enjarify(file.getAbsolutePath)
      }
      var filterSet = Set.empty[String]
      val bruteforce = line.hasOption("bf")
      val debug = line.hasOption("debug")
      if (line.hasOption("s")) {
        if (line.hasOption("stm")) {
          runOnOneFile(jar, "stm", filterSet, bruteforce, debug, !line.hasOption("j"))
        } else if (line.hasOption("st")) {
          new StringClassifierAnalysis(jar, List(file.getName)).doAnalyze(System.currentTimeMillis())
        } else if (line.hasOption("m")) {
          runOnOneFile(jar, "m", filterSet, bruteforce, debug, !line.hasOption("j"))
        } else if (line.hasOption("sstat")) {
          new StringFeatureExtraction(jar, List(file.getName), filterSet).doAnalyze()
        } else if (line.hasOption("cstat")) {
          runOnOneFile(jar, "cstat", filterSet, bruteforce, debug, !line.hasOption("j"))
        } else {
          runOnOneFile(jar, "", filterSet, bruteforce, debug, !line.hasOption("j"))
        }
      } else {
        println("Running on path file: " + filename)
        if (line.hasOption("stm")) {
          runOnPathFile(filename, "stm", filterSet, bruteforce, debug, !line.hasOption("j"))
        } else if (line.hasOption("st")) {
          runOnPathFileStrings(filename)
        } else if (line.hasOption("m")) {
          runOnPathFile(filename, "m", filterSet, bruteforce, debug, !line.hasOption("j"))
        } else if (line.hasOption("cstat")) {
          runOnPathFile(filename, "cstat", filterSet, bruteforce, debug, !line.hasOption("j"))
        } else {
          runOnPathFile(filename, "", filterSet, bruteforce, debug, !line.hasOption("j"))
        }

      }
    } catch {
      case e: Throwable => import org.apache.commons.cli.HelpFormatter
        val formatter = new HelpFormatter()
        formatter.printHelp("StringDecryption", options)
    }
    ErrorLogger.close()
    System.exit(0)
  }

  def runOnPathFile(paths: String, analysis: String, filterSet: Set[String], bruteForce: Boolean, debug: Boolean, isAndroid: Boolean): Unit = {
    val bufferedReader = new BufferedReader(new FileReader(paths))
    var line = bufferedReader.readLine()
    var count = 1
    while (line != null) {
      val file = new File(line)
      if (line.length() > 0 && file.exists() && file.isFile) {
        var jar = file
        if (file.getName.endsWith(".apk")) {
          jar = Utils.enjarify(file.getAbsolutePath)
        }
        try {
          runOnOneFile(jar, analysis, filterSet, bruteForce, debug, isAndroid)
          println(count + ": " + jar)
        } catch {
          case e: Throwable =>
            logger.error(jar.getAbsolutePath)
            logger.error(e.getMessage)
            logger.error(e.getStackTrace.mkString("\n"))
        }
        finally {
          System.gc()
        }
        count += 1
      }
      line = bufferedReader.readLine()
    }

    bufferedReader.close()
  }


  def runOnPathFileStrings(paths: String): Unit = {
    val bufferedReader = new BufferedReader(new FileReader(paths))
    val dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
    var line = bufferedReader.readLine()
    var count = 1
    while (line != null) {
      val jar = new File(line)
      if (line.nonEmpty && jar.exists() && jar.isFile) {
        try {
          new StringClassifierAnalysis(jar, List(jar.getName)).doAnalyze(System.currentTimeMillis())
          val date = new Date()
          println(count + ": " + jar + "\t time: " + dateFormat.format(date))
        } catch {
          case e: Throwable =>
            logger.error(jar.getAbsolutePath)
            logger.error(e.getMessage)
            logger.error(e.getStackTrace.mkString("\n"))
        }
        count += 1
      }
      line = bufferedReader.readLine()
    }
    bufferedReader.close()
  }


  def runOnOneFile(jar: File, analysis: String, filterSet: Set[String], bruteForce: Boolean, debug: Boolean, isAndroid: Boolean): Unit = {
    val jarName = jar.getName

    //val resultFile = new File(outputDir + "/results/" + jarName + ".txt")

    //if (!resultFile.exists()) {
    OPALLogger.updateLogger(GlobalLogContext, ErrorLogger)
    val absolutePath = jar.getAbsoluteFile.getParentFile.getAbsolutePath
    val parameters = List(jar.getName, absolutePath)
    forbidSystemExitCall()
    val t0 = System.currentTimeMillis()
    try {
      val androidLib = new File(AndroidJarAnalysis.identifyAndroidJar(jar))
      val p = Project(Array(jar), Array(stdLib, androidLib))
      OPALLogger.updateLogger(p.logContext, ErrorLogger)
      analysis match {
        case "m" =>
          new MethodFilterAnalysis(p, parameters).doAnalyze(t0)
        case "stm" =>
          new StringAndMethodAnalysis(p, parameters).doAnalyze(t0)
        case "cstat" => new CodeStringFeatureExtraction(p, parameters, filterSet).doAnalyze()
        case _ =>
          new SlicingAnalysis(p, parameters).doAnalyze(t0, bruteForce, debug, isAndroid)
      }
    } catch {
      case e: Throwable =>
        logger.error(parameters.head)
        logger.error(e.getMessage)
        logger.error(e.getStackTrace.mkString("\n"))
    }
    /*} else {
      println("Warning already present results!")
    }*/
    enableSystemExitCall()
  }

  class ExitTrappedException extends SecurityException {}


  object ErrorLogger extends OPALLogger {
    val fw = new FileWriter(outputDir + "/opal.log", true)

    override def log(message: LogMessage)(implicit ctx: LogContext): Unit = {
      if (message.level == Error && message.category.isDefined && message.category.get.contains("class hierarchy")) {
        if (message.category.isDefined)
          fw.write(message.category.get + "\n")
        fw.write(message.message + "\n")
        throw new Exception("[Fatal]: " + message.message)
      } else if (message.level == Error) {
        if (message.category.isDefined)
          fw.write(message.category.get + "\n")
        fw.write(message.message + "\n")
      }
    }

    def close(): Unit = {
      fw.close()
    }
  }

}
