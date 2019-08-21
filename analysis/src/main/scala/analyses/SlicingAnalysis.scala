package analyses

import java.io._
import java.net.URL
import java.time.Instant
import java.time.temporal.ChronoUnit
import java.util.concurrent.atomic.AtomicInteger
import java.util.{Timer, TimerTask}

import classifier.{MethodClassifier, StringClassifier}
import main.StringDecryption
import org.apache.commons.lang3.ClassUtils
import org.opalj._
import org.opalj.ai.domain.PerformAI
import org.opalj.ai.domain.l1.DefaultDomainWithCFGAndDefUse
import org.opalj.ai.{AIResult, ValueOrigin}
import org.opalj.ba.{CLASS, CODE, CodeAttributeBuilder, CodeElement, FIELD, FIELDS, METHOD, METHODS, PUBLIC, STATIC, toDA}
import org.opalj.bc.Assembler
import org.opalj.bi.ACC_PUBLIC
import org.opalj.br.analyses.{Project, StringConstantsInformationKey}
import org.opalj.br.instructions.{MethodInvocationInstruction, _}
import org.opalj.br.{PCInMethod, _}
import org.opalj.collection.immutable.{ConstArray, RefArray}
import org.opalj.slicing.{DeobfuscationSlicer, ParameterUsageException, SlicingConfiguration}
import org.opalj.util.InMemoryAndURLClassLoader

import scala.io.Source


class SlicingAnalysis(val project: Project[URL], val parameters: Seq[String]) {


  private lazy val charSeqClazz = Class.forName("java.lang.CharSequence")
  private val CharSequenceObjectType = ObjectType("java/lang/CharSequence")
  var genericErrors = new AtomicInteger
  var out: PrintStream = _
  var err: PrintStream = _
  val devNullPrintStream = new DevNullPrintStream()
  var attempts = new AtomicInteger
  var executions = new AtomicInteger
  var verifyErrors = new AtomicInteger
  var timeouts = new AtomicInteger
  var methodCalls = new AtomicInteger
  var successful = new AtomicInteger
  var invocationTargetError = new AtomicInteger
  var parameterErrors = new AtomicInteger
  var usesParams = new AtomicInteger
  var noClassDef = new AtomicInteger
  var otherSource = new AtomicInteger
  var nullPointerError = new AtomicInteger
  var resultStream: FileWriter = _
  var urls: Array[URL] = _
  var libraryClasses: Set[ClassFile] = Set()
  var constantStrings = Set.empty[String]
  var stringUsages = List.empty[String]

  var debug = false

  var allThreads = Set.empty[Long]
  var first = true
  var clean = false

  val cleanTask: TimerTask = new TimerTask() {
    override def run(): Unit = {
      if (!debug) {
        clean = true
      }
    }
  }

  var bruteforce = false

  val slicingTimerTask: TimerTask = new TimerTask() {
    override def run(): Unit = {
      val slicesCount = attempts.get()
      System.setOut(out)
      println("#slices: " + slicesCount)
      System.setOut(devNullPrintStream)
    }
  }

  val executionTimerTask: TimerTask = new TimerTask() {
    override def run(): Unit = {
      val executionCount = executions.get()
      System.setOut(out)
      println("#executions: " + executionCount)
      System.setOut(devNullPrintStream)
    }
  }

  val relevantSinks: Set[String] = Source.fromFile("relevantSinks.txt").getLines().filter(l => l.nonEmpty && l.startsWith("<")).map { l =>
    val split = l.substring(1, l.lastIndexOf('>')).split(": ")
    val fqn = split(0)
    val methodSignature = MethodSignatureWrapper(split(1)).toString
    fqn + " " + methodSignature
  }.toSet

  var decryptionContextSet = Map.empty[Method, (MethodTemplate, Set[ClassFile], ClassFile)]


  def isRelevantSink(mii: MethodInvocationInstruction): Boolean = {
    if (mii.declaringClass.isObjectType) {
      val methodSignature = MethodSignatureWrapper(mii.methodDescriptor.toJava(mii.name)).toString
      val sink = mii.declaringClass.asObjectType.fqn.replace('/', '.') + " " + methodSignature
      relevantSinks.contains(sink)
    } else false
  }


  def doAnalyze(t0: Long, bf: Boolean, debug: Boolean, isAndroid: Boolean): Unit = {
    out = System.out
    err = System.err
    bruteforce = bf
    this.debug = debug
    libraryClasses = project.allLibraryClassFiles.toSet
    if (isAndroid)
      urls = List.empty[URL].toArray
    else
      urls = new File(parameters.tail.head).listFiles(f ⇒ f.getName.endsWith(".jar")).map(_.toURI.toURL)
    resultStream = new FileWriter(new File(StringDecryption.outputDir + "/results/" + parameters.head + ".txt"), false)
    val logStream = new FileWriter(new File(StringDecryption.outputDir + "/logs/" + parameters.head + "Log.txt"), false)
    logStream.write("Apk;PreAnalysisTime;StringClassifierTime;MethodClassifierTime;SlicingTime;OverallTime;ClassCount;MethodCount;MeanInstPerMethodCount;MedianInstPerMethodCount;MaxInstPerMethodCount;ApkInstCount;StringUniqCount;DecryptedStrings;SlicesCount\n")
    //inputResultStream = new FileWriter(new File("results/" + parameters.head + "-input-result.txt"), false)
    System.setOut(devNullPrintStream)
    System.setErr(devNullPrintStream)
    //deobfuscatedStrings = Map()
    implicit val p: Project[URL] = project
    implicit val classHierarchy: ClassHierarchy = project.classHierarchy
    val start = Instant.now()
    val t1 = System.currentTimeMillis()
    val constantStringsWithMethod = project.get(StringConstantsInformationKey)
    constantStrings = constantStringsWithMethod.keySet.toSet ++ project.allProjectClassFiles.flatMap(c => c.fields).filter(f => f.fieldType == ObjectType.String && f.constantFieldValue.isDefined).map(f => f.constantFieldValue.get.valueToString).toSet
    StringClassifier.classify("dummy") // triggering to make sure that StringClassifier is initialized
    val encryptedStrings =
      constantStringsWithMethod.par.map { case (s, ms) ⇒ s ->
        ms.filter(m ⇒ StringClassifier.classify(s, m.method))
      }.filter(s => s._2.nonEmpty).seq.toMap

    val t2 = System.currentTimeMillis()
    val decryptionMethods = project.allMethodsWithBody.par.filter(m => MethodClassifier.classify(m, project)).seq

    val t3 = System.currentTimeMillis()

    if (encryptedStrings.nonEmpty || decryptionMethods.nonEmpty) {
      stringUsages = constantStrings.filter(s => s.length > 2).toList.sortBy((s: String) => (-s.length, s))
      var decryptionMethodUsages: Set[Method] = Set.empty[Method]
      try {
        val callGraph = CallGraphFactory.createOPALCallGraph(project)
        decryptionMethodUsages = decryptionMethods.flatMap(dm => callGraph(dm).
          map(f => f._1.asDefinedMethod.definedMethod).toSet).toSet
      } catch {
        case _: Throwable => val callGraph = CallGraphFactory.createCHACallGraph(project)
          decryptionMethodUsages = decryptionMethods.flatMap(dm => if (callGraph.contains(dm)) callGraph(dm) else Set.empty[Method]).toSet
      }
      decryptionMethodUsages = decryptionMethodUsages ++ encryptedStrings.
        flatMap(m => m._2.map(m1 => m1.method).toSet).toSet
      System.setOut(out)
      println("Methods to slice: " + decryptionMethodUsages.size)
      System.setOut(devNullPrintStream)
      val cleanTimer = new Timer()
      cleanTimer.schedule(cleanTask, 1000, 120000)
      val timer = new Timer()
      timer.schedule(slicingTimerTask, 1000, 10000)
      decryptionMethodUsages.foreach { method =>

        try {

          val domain = new ai.domain.l1.DefaultDomainWithCFGAndDefUse(project, method) with SlicingConfiguration
          val body = method.body.get


          lazy val result: AIResult {val domain: DefaultDomainWithCFGAndDefUse[URL]} = PerformAI(domain)


          body.iterate { (pc, instruction) =>
            instruction.opcode match {
              case INVOKEVIRTUAL.opcode |
                   INVOKESPECIAL.opcode |
                   INVOKESTATIC.opcode |
                   INVOKEINTERFACE.opcode =>
                val invoke = instruction.asMethodInvocationInstruction
                val params = invoke.methodDescriptor.parameterTypes
                val sig = invoke.methodDescriptor.toJava(invoke.name)

                if (invoke.isVirtualMethodCall && checkType(invoke.declaringClass)) {
                  processOrigins(params.size, new SinkInfo(invoke.declaringClass, sig, pc), method, project, result)
                }
                params.iterator.zipWithIndex foreach { e =>
                  val (t, index) = e
                  if (checkType(t) || ObjectType.Object == t) {
                    processOrigins(params.size - 1 - index,
                      new SinkInfo(invoke.declaringClass, sig, pc),
                      method, project, result)

                  }
                }
              case PUTFIELD.opcode =>
                val fa = instruction.asInstanceOf[FieldWriteAccess]
                if (checkType(fa.fieldType) || (ObjectType.Object == fa.fieldType)) {
                  processOrigins(0, new SinkInfo(fa.declaringClass, fa.name, pc), method, project, result)
                }
              case PUTSTATIC.opcode =>
                val fa = instruction.asInstanceOf[FieldWriteAccess]
                if (checkType(fa.fieldType) || (ObjectType.Object == fa.fieldType)) {
                  processOrigins(0, new SinkInfo(fa.declaringClass, fa.name, pc), method, project, result)
                }
              case AASTORE.opcode =>
                processOrigins(0, new SinkInfo(method.classFile.thisType, method.name, pc), method, project, result)
              case ARETURN.opcode =>
                if (checkType(method.returnType) || (ObjectType.Object == method.returnType)) {
                  processOrigins(0, new SinkInfo(method.classFile.thisType, method.name, pc), method, project, result)
                }
              case _ => // Rest
            }
          }
        } catch {
          case e: Throwable ⇒
            if (StringDecryption.logSlicing) {
              val sb = new StringBuilder()
              sb.append(parameters.head + "\n")
                .append(method + "\n")
                .append(method.classFile + "\n")
              StringDecryption.logger.error(sb.toString())
              StringDecryption.logger.error(e.getStackTrace.mkString("\n"))
            }
        }
      }
      timer.cancel()
      cleanTimer.cancel()
      if (bruteforce) {
        System.setOut(out)
        println("start brute force execution")
        System.setOut(devNullPrintStream)
        val executionTimer = new Timer()
        val cleanExecTimer = new Timer()
        clean = false
        first = true
        cleanExecTimer.schedule(cleanTask, 1000, 120000)
        executionTimer.schedule(executionTimerTask, 1000, 10000)
        executeBruteForceDecryption(encryptedStrings)
        cleanExecTimer.cancel()
        executionTimer.cancel()
      }
    }
    else {
      System.setOut(out)
      println("No encryption method skipping: " + parameters.head)

    }
    val t4 = System.currentTimeMillis()
    System.setErr(err)
    System.setOut(out)
    println("Write results to -> " + StringDecryption.outputDir + "/results/" + parameters.head + ".txt")

    val end = Instant.now()
    //val relevantMethods = methods.map(_._1).map(m => m.classFile.thisType.simpleName + " " + m)
    val time = ChronoUnit.MILLIS.between(start, end)
    //val writer = new FileWriter(new File(StringDecryption.outputDir + "/results.json"), true)

    //val stringFile = new FileWriter(new File("results/" + parameters.head + "-PLAIN-STRINGS.txt"), false)

    val allInstructionCounts = project.allMethodsWithBody.map(m => m.body.get.instructionsCount).toList.sorted
    logStream.write(Array(parameters.head, t1 - t0, t2 - t1, t3 - t2, t4 - t3, t4 - t0,
      project.allProjectClassFiles.size, project.allMethods.size,
      allInstructionCounts.sum.toDouble / (if (allInstructionCounts.nonEmpty) allInstructionCounts.size else 1),
      if (allInstructionCounts.nonEmpty) allInstructionCounts(allInstructionCounts.size / 2) else 0,
      if (allInstructionCounts.nonEmpty) allInstructionCounts.max else 0,
      allInstructionCounts.sum,
      constantStrings.size, successful, attempts).mkString("", ";", "\n"))
    logStream.close()

    /*writer.write(
      s"""
         |{"target":"${parameters.head}","deobfuscatedStrings":$successful,"successful":$successful,"otherSource":$otherSource,"attempts":$attempts,"usesParams":$usesParams,"genericErrors":$genericErrors,"verifyErrors":$verifyErrors,"timeouts":$timeouts,"methodCalls":$methodCalls,"invocationTargetErrors":$invocationTargetError,"runTime":$time,"parameterError":$parameterErrors,"noClassDef":$noClassDef},
       """.stripMargin)

    writer.close()*/
    //val resultsFolder = new File(StringDecryption.outputDir + "/endResults/")
    //resultsFolder.mkdirs()
    //FilterEncryptionStrings.filterWholeSet(unfilteredResults, constantStrings, parameters.head)
    resultStream.close()
  }

  def executeBruteForceDecryption(encryptedStrings: Map[String, ConstArray[PCInMethod]]): Unit = {
    var foundStrings = Map.empty[String, Set[(MethodTemplate, Set[ClassFile], ClassFile)]]
    var notFoundStrings = Set.empty[(String, Method)]

    encryptedStrings.foreach { s =>
      if (s._2.exists(ms => decryptionContextSet.contains(ms.method)))
        foundStrings = foundStrings ++
          Map(s._1 -> s._2.filter(ms => decryptionContextSet.contains(ms.method)).
            map(m => decryptionContextSet(m.method)).toSet)
      else notFoundStrings += ((s._1, s._2.head.method))
    }

    if (first) {
      allThreads = Thread.getAllStackTraces.keySet().toArray().map(f => f.asInstanceOf[Thread].getId).toSet
      first = false
    }

    for (nfs <- notFoundStrings) {

      for (foundString <- foundStrings) {
        for (mt <- foundString._2) {
          executions.incrementAndGet()
          val newInstructions = mt._1.body.get.instructions.map { instruction: Instruction =>
            instruction match {
              case v: LoadString_W if v.value.equals(foundString._1) =>
                LoadString_W(nfs._1)
              case v: LoadString if v.value.equals(foundString._1) =>
                LoadString(nfs._1)
              case _ =>
                instruction
            }
          }
          val runner = new Thread(
            () => {

              try {

                val fixedCode = mt._1.body.get.copy(instructions = newInstructions)

                val newMt = mt._1.copy(body = Some(fixedCode))

                val cf = addMethodToClass(mt._3, newMt)
                val mappedClasses = (mt._2.filter(_.fqn != cf.fqn) + cf).map(c =>
                  (c.thisType.toJava, Assembler(toDA(fixTime(c)))
                  )).toMap

                val cl = new InMemoryAndURLClassLoader(mappedClasses, this.getClass.getClassLoader, urls)
                val targetString = Some(nfs._1)
                val sinkInfo = new SinkInfo(cf.thisType, "bruteForce", -1)
                val inMethod = nfs._2
                callReflectiveMethod(newMt, cl, cf, inMethod, sinkInfo, targetString)
              } catch {
                case _: Throwable =>
              }
            }
          )
          //runner.setUncaughtExceptionHandler(h)
          runner.start()
          if (debug) {
            runner.join()
          } else {
            runner.join(5000)
          }
          if (runner.isAlive) {
            try {
              classOf[Thread].getMethod("stop").invoke(runner)
            } catch {
              case _: java.lang.Throwable =>
            }
          }
          if (clean || freeMBytes <= 500) {
            cleanHard()
            clean = false
            System.gc()
          }
        }
      }
    }
  }

  def buildMethodForOrigin(origin: Opcode, sinkInfo: SinkInfo, project: Project[URL], method: Method,
                           result: AIResult {val domain: DefaultDomainWithCFGAndDefUse[URL]}): Unit = {
    if (origin >= 0) {
      try {
        val ins = result.code.instructions(origin)
        ins.opcode match {
          case INVOKESTATIC.opcode |
               INVOKEVIRTUAL.opcode |
               INVOKEINTERFACE.opcode |
               INVOKESPECIAL.opcode ⇒
            val mii = ins.asMethodInvocationInstruction
            //                  val hasStringParam = mii.methodDescriptor.parameterTypes.contains(ObjectType.String)
            val hasBaseOrStringParam = mii.methodDescriptor.parameterTypes.exists { ft ⇒
              val isBaseOrStringArrayType = if (ft.isArrayType) {
                val et = ft.asArrayType.elementType
                et.isBaseType || et.isObjectType &&
                  (et == ObjectType.Object || checkType(et)(project.classHierarchy))
              } else {
                false
              }
              ft.isBaseType ||
                ft == ObjectType.Object ||
                isBaseOrStringArrayType ||
                (ft.isObjectType && checkType(ft)(project.classHierarchy))
            }
            val isJDKMethod =
              mii.declaringClass.isObjectType &&
                project.isLibraryType(mii.declaringClass.asObjectType)
            val isToStringOrOnString = mii.name == "toString" ||
              checkType(mii.declaringClass)(project.classHierarchy)

            if (hasBaseOrStringParam &&
              (!isJDKMethod || isToStringOrOnString)) {
              buildAndCallMethod(method, origin, result, sinkInfo)(project)
            }
          case AALOAD.opcode | GETFIELD.opcode | GETSTATIC.opcode ⇒
            buildAndCallMethod(method, origin, result, sinkInfo)(project)
          case NEW.opcode
          => buildAndCallMethod(method, origin, result, sinkInfo)(project)
          // Slicer can't handle this correctly at the moment
          case LDC.opcode | LDC2_W.opcode | LDC_W.opcode |
               ACONST_NULL.opcode ⇒ /* Don't do anything, we don't care*/
          case ANEWARRAY.opcode | NEWARRAY.opcode ⇒
          case _ ⇒
          //println(body.instructions(origin))
        }
      } catch {
        case ex: Throwable =>
          if (StringDecryption.logSlicing) {
            StringDecryption.logger.error(parameters.head)
            StringDecryption.logger.error(ex.getMessage)
            StringDecryption.logger.error(ex.getStackTrace.mkString("\n"))
          }
      }
    }
  }

  def processOrigins(index: Int, sinkInfo: SinkInfo, method: Method, project: Project[URL],
                     result: AIResult {val domain: DefaultDomainWithCFGAndDefUse[URL]}): Unit = {
    val operands = result.operandsArray(sinkInfo.sinkPC)
    if (operands == null) return
    val op = operands(index)
    op match {
      case result.domain.StringValue(s) ⇒ // Not Obfuscated or deob method

      case result.domain.DomainReferenceValueTag(v) ⇒
        if (v.allValues.exists(p => p.upperTypeBound.containsId(ObjectType.String.id))) {
          result.domain.originsIterator(op).foreach(buildMethodForOrigin(_, sinkInfo, project, method: Method, result))
        }

      case result.domain.MultipleReferenceValues(s) ⇒ s.foreach {
        case result.domain.StringValue(st) ⇒ // Not Obfuscated or deob method
        case value ⇒ value.origins.foreach(buildMethodForOrigin(_, sinkInfo, project, method: Method, result))
      }
      case e ⇒
        print(e)
    }
    //                    domain.foreachOrigin(op, buildMethodForOrigin(_))
  }

  def fixTime(cf: ClassFile): ClassFile = {
    val filteredMethods = cf.methods.map[MethodTemplate] { m =>
      var skip = 0
      val body = m.body.map(body => Code(body.maxStack, body.maxLocals, body.instructions.map {
        case MethodInvocationInstruction(ObjectType.System, _, "currentTimeMillis", _) =>
          skip = 2
          LCONST_0
        case null if skip > 0 => skip -= 1; NOP
        case ins => ins
      },
        body.exceptionHandlers, body.attributes))
      m.copy(body = body)
    }

    cf.copy(methods = filteredMethods)
  }

  def redirectToDummyClass(cf: ClassFile, dummyClass: ClassFile, superType: Option[ObjectType], isInitChange: Boolean): (ClassFile, ClassFile) = {
    var newClass = cf
    var newDummy = dummyClass
    if (isInitChange)
      cf.methods.toSet.map(m => makeRef2DummyInit(m, newClass, if (superType.isDefined) superType.get else ObjectType.Object, newDummy)).foreach { res: (MethodTemplate, Set[MethodTemplate]) =>
        newClass = addMethodToClass(newClass, res._1)
        for (m <- res._2)
          newDummy = addMethodToClass(newDummy, m)
      }
    (newClass, newDummy)
    //cf
  }

  def makeRef2DummyInit(method: Method, cf: ClassFile, superType: ObjectType, dummyClass: ClassFile): (MethodTemplate, Set[MethodTemplate]) = {
    var methodTmpSet = Set.empty[MethodTemplate]
    val code = method.body.map { body ⇒
      val instructions = body.instructions.map {
        case inst: INVOKESPECIAL if inst.declaringClass.fqn == superType.fqn =>
          val tmp = buildDummySpecialConsumerMethod(inst, dummyClass)
          methodTmpSet += tmp
          INVOKESPECIAL(dummyClass.thisType, isInterface = false, "<init>", tmp.descriptor)
        case inst: MethodInvocationInstruction if inst.declaringClass.isObjectType && inst.declaringClass.asObjectType.fqn == superType.fqn =>
          val (ins, methodTmp) = getDefaultValueForType(inst, cf, dummyClass, methodTmpSet)
          methodTmpSet += methodTmp
          ins
        case a => a
      }
      body.copy(instructions = instructions)
    }
    (method.copy(body = code), methodTmpSet)
  }

  def generateFreeName(setNames: Set[String]): String = {
    var count = 0
    while (setNames.contains("dummyConsumer" + count)) count += 1
    "dummyConsumer" + count
  }

  def buildNewRefArray[T <: AnyRef](first: List[T], second: List[T]): RefArray[T] = {
    RefArray._UNSAFE_from((first ++ second).toArray)
  }

  def buildDummySpecialConsumerMethod(t: INVOKESPECIAL, cf: ClassFile): MethodTemplate = {
    import org.opalj.ba._
    METHOD(
      PUBLIC,
      "<init>",
      MethodDescriptor.apply(t.methodDescriptor.parameterTypes, VoidType).toJVMDescriptor,
      CODE(
        ALOAD_0,
        INVOKESPECIAL(ObjectType.Object, isInterface = false, "<init>", MethodDescriptor.NoArgsAndReturnVoid),
        RETURN
      )
    ).result(cf.version, cf.thisType)._1
  }

  def removeAndroidSystemCalls(method: Method, cf: ClassFile, dummyClass: ClassFile): Set[MethodTemplate] = {
    var set = Set.empty[MethodTemplate]
    val code = method.body.map { body ⇒
      val instructions = body.instructions.map {
        case NEW(ot) if project.isLibraryType(ot) && (ot.fqn.startsWith("android") || ot.fqn.startsWith("dalvik")) ⇒
          ACONST_NULL
        case ins@MethodInvocationInstruction(rt@ObjectType(_), _, _, _) =>
          val res = if (project.isLibraryType(rt) && (rt.fqn.startsWith("android") || rt.fqn.startsWith("dalvik"))) {
            val (inst, methodTmp) = getDefaultValueForType(ins, cf, dummyClass, set)
            set += methodTmp
            inst
          } else ins
          res
        case ins ⇒ ins
      }
      body.copy(instructions = instructions)
    }
    set += method.copy(body = code)
    set
  }

  def getDefaultValueForType(t: MethodInvocationInstruction, cf: ClassFile, dummyClass: ClassFile, methodTmpSet: Set[MethodTemplate]): (Instruction, MethodTemplate) = {
    // TODO: Maybe check for wrapper classes
    val freeName = generateFreeName((cf.methods.toSet.map((m: Method) => m.name) ++ methodTmpSet.map(m => m.name) ++ dummyClass.methods.toSet.map((m: Method) => m.name)).toSet[String])
    val methodTmp = buildDummyConsumeMethod(freeName, t, cf, getDefaultInstructionsForType(t.methodDescriptor.returnType))
    (INVOKESTATIC(DUMMY_CLASS, isInterface = false, freeName, methodTmp.descriptor), methodTmp)
  }

  def getDefaultInstructionsForType(t: Type): (CodeElement[_], CodeElement[_]) = {
    t match {
      case a if a.isIntLikeType ⇒ (ICONST_0, IRETURN)
      case _: VoidType ⇒
        (NOP, RETURN)
      case _: LongType ⇒
        (LCONST_0, LRETURN)
      case _: DoubleType ⇒
        (DCONST_0, DRETURN)
      case _: FloatType ⇒
        (FCONST_0, FRETURN)
      case _: BooleanType ⇒
        (ICONST_0, IRETURN)
      case a if a.isObjectType ⇒
        (ACONST_NULL, ARETURN)
      case a if a.isReferenceType ⇒
        (ACONST_NULL, ARETURN)
    }
  }

  def buildDummyConsumeMethod(name: String, t: MethodInvocationInstruction, cf: ClassFile, instTpl: (CodeElement[_], CodeElement[_])): MethodTemplate = {
    import org.opalj.ba._
    if (t.isInstanceMethod || t.isInterfaceCall || t.isVirtualMethodCall) {
      val newRefArray = RefArray._UNSAFE_from((List(t.declaringClass) ++ t.methodDescriptor.parameterTypes.toList).toArray)
      METHOD(
        PUBLIC.STATIC,
        name,
        MethodDescriptor.apply(newRefArray, t.methodDescriptor.returnType).toJVMDescriptor,
        CODE(
          instTpl._1,
          instTpl._2
        )
      ).result(cf.version, cf.thisType)._1
    } else
      METHOD(
        PUBLIC.STATIC,
        name,
        MethodDescriptor.apply(t.methodDescriptor.parameterTypes, t.methodDescriptor.returnType).toJVMDescriptor,
        CODE(
          instTpl._1,
          instTpl._2
        )
      ).result(cf.version, cf.thisType)._1
  }


  def tryToCreateInstance[T](clazz: Class[_]): Any = {
    if (clazz.isPrimitive) {
      //throw new NullPointerException()
      ClassUtils.primitiveToWrapper(clazz) match {
        case w if w == classOf[Integer] => Integer.valueOf(0)
        case w if w == classOf[java.lang.Boolean] => java.lang.Boolean.FALSE
        case w if w == classOf[java.lang.Long] => java.lang.Long.valueOf(0L)
        case w if w == classOf[java.lang.Short] => java.lang.Short.valueOf(0.asInstanceOf[Short])
        case w if w == classOf[java.lang.Byte] => java.lang.Byte.valueOf(0.asInstanceOf[Byte])
        case w if w == classOf[java.lang.Character] => java.lang.Character.valueOf('a')
        case w if w == classOf[java.lang.Float] => java.lang.Float.valueOf(0.0f)
        case w if w == classOf[java.lang.Double] => java.lang.Double.valueOf(0.0)
      }
    } else {
      val const = clazz.getDeclaredConstructors.find(c => c.getParameterTypes.isEmpty && c.isAccessible)
      if (const.isDefined) {
        const.get.newInstance()
      } else {
        null
      }
    }
  }

  def filterMethodsAndFields(cf: ClassFile, relevantMethods: Set[Method], relevantFields: Set[Field]): ClassFile = {
    //    cf.copy(
    //            fields = modifiedClass.fields.filter(relevantFields.contains(_)).map(_.copy()),
    //      methods = cf.methods.filter(relevantMethods.contains(_)).map(_.copy()))
    cf.copy(accessFlags = cf.accessFlags | ACC_PUBLIC.mask)
  }


  def buildDummyStatic(cf: ClassFile): MethodTemplate = {
    import org.opalj.ba._
    METHOD(
      PUBLIC.STATIC,
      DUMMYSTATIC,
      MethodDescriptor.NoArgsAndReturnVoid.toJVMDescriptor,
      CODE(
        RETURN
      )
    ).result(cf.version, cf.thisType)._1
  }

  val DUMMYSTATIC = "DUMMYSTATIC"

  def addMethodToClass(cf: ClassFile, mt: MethodTemplate): ClassFile = {
    var copiedMethods = cf.methods.filterNot(m ⇒ m.descriptor == mt.descriptor && m.name == mt.name)
      .map[MethodTemplate](_.copy())
    if (mt.name == "<clinit>") {
      copiedMethods :+= buildDummyStatic(cf)
    }
    cf.copy(methods = mt +: copiedMethods, version = bi.Java5Version)
  }

  def handleAllCallsToNewMethod(cf: ClassFile, newMethod: MethodTemplate): ClassFile = {
    var allMethods = cf.methods.toSet.map((m: Method) => m.copy())
    cf.methods.foreach { m =>
      if (m.body.isDefined) {
        val code = m.body.map { body =>
          val newInstructions = body.instructions.map {
            case mi: MethodInvocationInstruction if mi.name == newMethod.name && mi.methodDescriptor == newMethod.descriptor =>
              val freeName = generateFreeName(cf.methods.toSet.map((m: Method) => m.name))
              val methodTmp = buildDummyConsumeMethod(freeName, mi, cf, getDefaultInstructionsForType(mi.methodDescriptor.returnType))
              allMethods += methodTmp
              INVOKESTATIC(cf.thisType, isInterface = false, freeName, methodTmp.descriptor)
            case i => i
          }
          body.copy(instructions = newInstructions)
        }
        allMethods = allMethods.filterNot(m1 => m1.name == m.name && m1.descriptor == m.descriptor) + m.copy(body = code)
      }
    }
    cf.copy(methods = buildNewRefArray(allMethods.toList, List()))
  }

  val stackMapCache = new java.util.concurrent.ConcurrentHashMap[Method, StackMapTable]()

  def addStackMapTable(m: Method, ch: ClassHierarchy): MethodTemplate = {
    val stackMapTable = stackMapCache.computeIfAbsent(m, m ⇒ CodeAttributeBuilder.computeStackMapTable(m)(ch))
    m.copy(attributes = m.attributes :+ stackMapTable)
  }

  val NON_ABSTRACT = 0xFBFF

  def handleAbstractMethods(modifiedClass: ClassFile): List[MethodTemplate] = {
    modifiedClass.methods.filter(m => m.isAbstract).toList.map { m =>
      val defaultInstructions = getDefaultInstructionsForType(m.returnType)
      METHOD(
        PUBLIC,
        m.name,
        MethodDescriptor.apply(m.parameterTypes, m.returnType).toJVMDescriptor,
        CODE(
          defaultInstructions._1,
          defaultInstructions._2
        )
      ).result(modifiedClass.version, modifiedClass.thisType)._1
    }
  }

  def buildAndCallMethod(method: Method, origin: ValueOrigin,
                         result: AIResult {val domain: DefaultDomainWithCFGAndDefUse[URL]},
                         sinkInfo: SinkInfo)
                        (implicit project: Project[_]): AnyVal = {
    if (first) {
      allThreads = Thread.getAllStackTraces.keySet().toArray().map(f => f.asInstanceOf[Thread].getId).toSet
      first = false
    }
    attempts.incrementAndGet()
    val runner = new Thread(
      () => {
        try {
          val cf = method.classFile
          val out = buildMethod(method, origin, result, sinkInfo.sinkPC)
          if (out._1.isDefined) {
            val modifiedMethod = out._1.get
            //                        val supertype = if (modifiedMethod.isStatic) Some(ObjectType("java/lang/Object")) else cf.superclassType
            val neededInterfaces = findInvokedInterfaceMethodsInSlice(modifiedMethod, cf.interfaceTypes)
            val modifiedClass = addMethodToClass(cf, modifiedMethod)
              .copy(accessFlags = cf.accessFlags | ACC_PUBLIC.mask,
                interfaceTypes = neededInterfaces)
            val linkedMethod = modifiedClass.methods.filter(m => m.name == modifiedMethod.name &&
              m.descriptor == modifiedMethod.descriptor).head
            val (relevantMethods, relevantFields, relevantClasses) = getAccessedFieldsMethodsAndClasses(modifiedClass,
              Some(linkedMethod))(modifiedClass, project)


            val superType = /*if (modifiedMethod.name == "<init>")*/ Option(DUMMY_CLASS) //else modifiedClass.superclassType
            val filteredClass = modifiedClass.copy(
              //            fields = modifiedClass.fields.filter(relevantFields.contains(_)).map(_.copy()),
              methods = buildNewRefArray(modifiedClass.methods.filter(m => !m.isAbstract && (relevantMethods.contains(m) || m.name == DUMMYSTATIC)).toList,
                handleAbstractMethods(modifiedClass)).map[MethodTemplate](_.copy())).
              copy(superclassType = superType).copy(accessFlags = modifiedClass.accessFlags & NON_ABSTRACT)


            val dummyClass = buildDummyClass()

            val (redirectedClass, newDummy) = handleMissingMethods(redirectToDummyClass(filteredClass, dummyClass, modifiedClass.superclassType, /*modifiedMethod.name == "<init>"*/ isInitChange = true), cf, project)

            val newClass = handleAllCallsToNewMethod(redirectedClass, modifiedMethod)


            val strippedClasses = (relevantClasses.
              filter(_.fqn != cf.fqn).
              map(filterMethodsAndFields(_, relevantMethods, relevantFields)) + newDummy + newClass + DeobfuscationSlicer.buildTargetClass()).
              //map(cf ⇒ removeAndroidSystemCallsFromStaticInit(cf)).
              map(cf ⇒ cf.copy(version = bi.Java5Version)).map(cf => fixTime(cf))
            //map(cf ⇒ cf.copy(methods = cf.methods.map[MethodTemplate](m ⇒
            //  addStackMapTable(m, project.classHierarchy))))
            val mappedClasses = strippedClasses.
              map(cf => (cf.thisType.toJava, Assembler(toDA(cf)))).toMap
            //                        val cl = new InMemoryClassLoader(mappedClasses, this.getClass.getClassLoader)
            val cl = new InMemoryAndURLClassLoader(
              mappedClasses,
              this.getClass.getClassLoader,
              urls
            )
            strippedClasses.filter(c => c.fqn != cf.fqn && c.fqn != "slicing.StringLeaker").foreach(rcf => cl.loadClass(rcf.thisType.toJava))
            val success = callReflectiveMethod(modifiedMethod, cl, redirectedClass, method, sinkInfo, out._2)
            if (bruteforce && success &&
              modifiedMethod.body.get.instructions.exists(i => i.isInstanceOf[LoadString_W] || i.isInstanceOf[LoadString])) {
              decryptionContextSet += method -> (modifiedMethod, strippedClasses, newClass)
            }
          }
        } catch {
          case ex: java.lang.VerifyError =>
            verifyErrors.incrementAndGet()
            if (StringDecryption.logSlicing) {
              StringDecryption.logger.error(parameters.head)
              StringDecryption.logger.error(ex.getMessage)
              StringDecryption.logger.error(ex.getStackTrace.mkString("\n"))
            }
          case ex: java.lang.reflect.InvocationTargetException =>
            invocationTargetError.incrementAndGet()
            if (StringDecryption.logSlicing) {
              StringDecryption.logger.error(parameters.head)
              StringDecryption.logger.error(ex.getMessage)
              StringDecryption.logger.error(ex.getStackTrace.mkString("\n"))
            }
          case ex: java.lang.NullPointerException =>
            nullPointerError.incrementAndGet()
            if (StringDecryption.logSlicing) {
              StringDecryption.logger.error(parameters.head)
              StringDecryption.logger.error(ex.getMessage)
              StringDecryption.logger.error(ex.getStackTrace.mkString("\n"))
            }
          case ex: ParameterUsageException ⇒
            parameterErrors.incrementAndGet()
            if (StringDecryption.logSlicing) {
              StringDecryption.logger.error(parameters.head)
              StringDecryption.logger.error(ex.getMessage)
              StringDecryption.logger.error(ex.getStackTrace.mkString("\n"))
            }
          case ex: java.lang.NoClassDefFoundError =>
            noClassDef.incrementAndGet()
            if (StringDecryption.logSlicing) {
              StringDecryption.logger.error(parameters.head)
              StringDecryption.logger.error(ex.getMessage)
              StringDecryption.logger.error(ex.getStackTrace.mkString("\n"))
            }
          case ex: java.util.NoSuchElementException =>
            if (StringDecryption.logSlicing) {
              StringDecryption.logger.error(parameters.head)
              StringDecryption.logger.error(ex.getMessage)
              StringDecryption.logger.error(ex.getStackTrace.mkString("\n"))
            }
          case ex: ThreadDeath => throw ex
          case ex: Throwable =>
            genericErrors.incrementAndGet()
            if (StringDecryption.logSlicing) {
              StringDecryption.logger.error(parameters.head)
              StringDecryption.logger.error(ex.getMessage)
              StringDecryption.logger.error(ex.getStackTrace.mkString("\n"))
            }
        }
      }
    )
    //runner.setUncaughtExceptionHandler(h)
    runner.start()
    if (debug)
      runner.join()
    else
      runner.join(5000)
    if (runner.isAlive) {
      try {
        classOf[Thread].getMethod("stop").invoke(runner)
      } catch {
        case e: Throwable =>
          StringDecryption.logger.error(parameters.head)
          StringDecryption.logger.error(e.getMessage)
          StringDecryption.logger.error(e.getStackTrace.mkString("\n"))
      }
      timeouts.incrementAndGet()
    }
    if (clean || freeMBytes <= 500) {
      cleanHard()
      clean = false
      System.gc()
    }
  }

  def handleMissingMethods(filteredClass: (ClassFile, ClassFile), originalClass: ClassFile, project: Project[_]): (ClassFile, ClassFile) = {
    var allMethods: Set[MethodTemplate] = filteredClass._1.methods.toSet.map((m: Method) => m.copy())
    var newDummyMethods = filteredClass._2.methods.toSet.map((m: Method) => m.copy())
    filteredClass._1.methods.foreach { m =>
      if (m.body.isDefined) {
        m.body.get.instructions.foreach {
          case mi: MethodInvocationInstruction if mi.declaringClass == filteredClass._1.thisType =>
            if (mi.declaringClass == filteredClass._1.thisType) {
              var found = filteredClass._1.methods.find(m1 => m1.name == mi.name && mi.methodDescriptor == m1.descriptor)
              if (found.isEmpty) {
                found = originalClass.methods.find(m1 => m1.name == mi.name && mi.methodDescriptor == m1.descriptor)
                if (found.isEmpty && originalClass.superclassType.isDefined && project.classFile(originalClass.superclassType.get).isDefined) {
                  found = project.classFile(originalClass.superclassType.get).get.methods.find(m1 => m1.name == mi.name && mi.methodDescriptor == m1.descriptor)
                  if (found.isEmpty) {
                    if (mi.isVirtualMethodCall) {
                      newDummyMethods += buildDummyMethod(mi.name, mi, filteredClass._2)
                    } else {
                      allMethods += buildDummyMethod(mi.name, mi, filteredClass._1)
                    }
                  } else {
                    if (found.get.body.isDefined) {
                      if (mi.isVirtualMethodCall) {
                        newDummyMethods += buildDummyMethod(mi.name, mi, filteredClass._2)
                      } else {
                        allMethods += buildDummyMethod(mi.name, mi, filteredClass._1)
                      }
                    }
                    else {
                      if (mi.isVirtualMethodCall) {
                        newDummyMethods += buildDummyMethod(mi.name, mi, filteredClass._2)
                      } else {
                        allMethods += buildDummyMethod(mi.name, mi, filteredClass._1)
                      }
                    }
                  }
                } else {
                  if (mi.isVirtualMethodCall) {
                    newDummyMethods += buildDummyMethod(mi.name, mi, filteredClass._2)
                  } else {
                    allMethods += buildDummyMethod(mi.name, mi, filteredClass._1)
                  }
                }
              }
            }
          case _ =>
        }
      }
    }
    (filteredClass._1.copy(methods = buildNewRefArray(allMethods.toList, List[Method]()).map[MethodTemplate](_.copy())),filteredClass._2.copy(methods = buildNewRefArray(newDummyMethods.toList, List[Method]()).map[MethodTemplate](_.copy())))
  }

  def buildDummyMethod(name: String, t: MethodInvocationInstruction, cf: ClassFile): MethodTemplate = {
    val instTpl = getDefaultInstructionsForType(t.methodDescriptor.returnType)
    import org.opalj.ba._
    if (t.isInstanceMethod) {
      METHOD(
        PUBLIC,
        name,
        MethodDescriptor.apply(t.methodDescriptor.parameterTypes, t.methodDescriptor.returnType).toJVMDescriptor,
        CODE(
          instTpl._1,
          instTpl._2
        )
      ).result(cf.version, cf.thisType)._1
    } else
      METHOD(
        PUBLIC.STATIC,
        name,
        MethodDescriptor.apply(t.methodDescriptor.parameterTypes, t.methodDescriptor.returnType).toJVMDescriptor,
        CODE(
          instTpl._1,
          instTpl._2
        )
      ).result(cf.version, cf.thisType)._1
  }

  def freeMBytes(): Long = {
    Runtime.getRuntime.freeMemory / 1024 / 1024
  }

  val DUMMY_CLASS = ObjectType("slicing/DummyClass")

  def buildDummyClass(): ClassFile = {
    CLASS(
      version = bi.Java5Version,
      accessModifiers = PUBLIC,
      thisType = DUMMY_CLASS.fqn,
      fields = FIELDS(),
      methods = METHODS(
        METHOD(
          PUBLIC,
          "<init>",
          MethodDescriptor.NoArgsAndReturnVoid.toJVMDescriptor,
          CODE(
            ALOAD_0,
            INVOKESPECIAL(ObjectType.Object, isInterface = false, "<init>", MethodDescriptor.NoArgsAndReturnVoid),
            RETURN
          )
        )
      )
    ).toBR._1
  }

  def cleanHard(): Unit = {
    Thread.getAllStackTraces.keySet().toArray().foreach { f =>
      val th = f.asInstanceOf[Thread]
      if (!allThreads.contains(th.getId) &&
        !th.getName.startsWith("org.opalj") &&
        !th.getName.startsWith("scala-execution-context-") &&
        !th.getName.contains("RMI") &&
        !th.getName.contains("JMX") &&
        !th.getName.contains("GC") &&
        !th.getName.contains("Attach Listener") &&
        !th.getName.contains("Signal Dispatcher") &&
        !th.getName.contains("Finalizer") &&
        !th.getName.contains("Reference Handler") &&
        !th.getName.equals("main") &&
        !th.getName.contains("Monitor")) {
        try {
          //println(th.getName + " -> " + th.getId)
          th.interrupt()
          th.interrupt()
        } catch {
          case _: Throwable =>
        }
        try {
          val runnableField = th.getClass.getDeclaredField("target")
          runnableField.setAccessible(true)
          val r = runnableField.get(th).asInstanceOf[Runnable]
          transitiveKill(r)
        } catch {
          case _: Throwable =>
        }
        th.stop()
      }

    }
  }

  def transitiveKill(r: Object): Unit = {
    for (field <- r.getClass.getFields) {
      field.setAccessible(true)
      field.getType.getTypeName match {
        case "boolean" | "Z" => field.setBoolean(r, false)
        case "byte" | "B" => field.setByte(r, 0)
        case "char" | "C" => field.setChar(r, 0)
        case "double" | "D" => field.setDouble(r, 0.0)
        case "float" | "F" => field.setFloat(r, 0.0f)
        case "int" | "I" => field.setInt(r, 0)
        case "long" | "J" => field.setLong(r, 0)
        case "short" | "S" => field.setShort(r, 0)
        case _ =>
          val o = field.get(r)
          transitiveKill(o)
          field.set(r, null)
      }
    }
  }

  /*val h: Thread.UncaughtExceptionHandler = (th: Thread, ex: Throwable) => {
    if (StringDecryption.logSlicing) {
      StringDecryption.logger.error(parameters.head)
      StringDecryption.logger.error(ex.getMessage)
      StringDecryption.logger.error(ex.getStackTrace.mkString("\n"))
    }
    try {
      th.stop()
    } catch {
      case _: Throwable =>
    }
  }*/


  def callReflectiveMethod(modifiedMethod: MethodTemplate,
                           cl: ClassLoader,
                           cf: ClassFile,
                           method: Method,
                           sinkInfo: SinkInfo,
                           encStringOption: Option[String]): Boolean = {
    val resultClass = cl.loadClass("slicing.StringLeaker")
    val clazz = cl.loadClass(cf.thisType.toJava)
    var successful = false
    //                        try {
    val constructors = clazz.getDeclaredConstructors.filter(_.getParameterTypes.length == 0)
    if (modifiedMethod.name == "<clinit>") {
      //            attempts.incrementAndGet()
      clazz.getMethod(DUMMYSTATIC).invoke(null)
      successful = logResult(resultClass, method, sinkInfo, encStringOption)
    } else if (modifiedMethod.name == "<init>") {
      //            attempts.incrementAndGet()
      constructors(0).setAccessible(true)
      constructors(0).newInstance()
      successful = logResult(resultClass, method, sinkInfo, encStringOption)
    } else if (constructors.nonEmpty || modifiedMethod.isStatic) {
      val instance = if (modifiedMethod.isStatic) null else {
        constructors(0).setAccessible(true)
        constructors(0).newInstance()
      }
      val methods = clazz.getDeclaredMethods
        .filter(m => m.getName == modifiedMethod.name && m.getParameterTypes.sameElements(modifiedMethod.parameterTypes.map(_.toJavaClass)))
      val jvmMethod = methods(0)
      jvmMethod.setAccessible(true)
      val params: Array[_ <: Object] = jvmMethod.getParameterTypes.map(tryToCreateInstance).map(
        _.asInstanceOf[Object]
      )
      successful = tryInvoke(jvmMethod, resultClass, instance.asInstanceOf[Object], params, method, sinkInfo, encStringOption)
    } else {
      attempts.decrementAndGet()
      usesParams.incrementAndGet()
      val constructorsWithParams = clazz.getDeclaredConstructors.map(c => {
        c.setAccessible(true)
        c
      })
      attempts.incrementAndGet()
      for (constructor <- constructorsWithParams) {
        try {
          val constructorParams: Array[_ <: Object] =
            constructor.getParameterTypes.map(tryToCreateInstance).map(
              _.asInstanceOf[Object]
            )
          val instance = constructor.newInstance(constructorParams: _*)

          val jvmMethod = clazz.getDeclaredMethods
            .filter(m => m.getName == modifiedMethod.name && m.getParameterTypes.sameElements(modifiedMethod.parameterTypes.map(_.toJavaClass)))(0)
          jvmMethod.setAccessible(true)
          val params: Array[_ <: Object] = jvmMethod.getParameterTypes.map(tryToCreateInstance).map(_.asInstanceOf[Object])
          successful |= tryInvoke(jvmMethod, resultClass, instance.asInstanceOf[Object], params, method, sinkInfo, encStringOption)
        } catch {
          case _: Throwable =>
        }
      }
    }
    successful
  }


  def findInvokedInterfaceMethodsInSlice(modifiedMethod: MethodTemplate, interfaceTypes: Seq[ObjectType]): RefArray[ObjectType] = {
    val calledMethods = modifiedMethod.body.get.collect { case ins: INVOKEINTERFACE ⇒ ins.declaringClass
    }
    RefArray.from(interfaceTypes.intersect(calledMethods).toArray.asInstanceOf[Array[AnyRef]])
  }

  def tryInvoke(jvmMethod: java.lang.reflect.Method,
                resultClass: Class[_],
                instance: Object,
                params: Array[_ <: Object],
                originalMethod: Method,
                sinkInfo: SinkInfo, encStringOption: Option[String]): Boolean = {
    jvmMethod.invoke(instance, params: _*)
    logResult(resultClass, originalMethod, sinkInfo, encStringOption)
  }

  def logResult(resultClass: Class[_],
                originalMethod: Method,
                sinkInfo: SinkInfo, encStringOption: Option[String]): Boolean = {
    val resField = resultClass.getDeclaredField("result")
    resField.setAccessible(true)
    val res = resField.get(null).asInstanceOf[String]
    if (res.nonEmpty && res != "null") {
      val cl = StringClassifier.classify(res)
      if ((sinkInfo.sinkMethod != "bruteForce" || !cl) && (encStringOption.isEmpty ||
        !res.contains(encStringOption.get))
      ) {
        var encString: String = "-"
        if (encStringOption.isDefined) encString = encStringOption.get.replaceAll("[\n\r;]", "")
        val escapedString = res.replaceAll("[\n\r;]", "")
        var ratio = 1.0
        if (res.length > 0) {
          ratio = removeConstantStrings(res).length.toDouble / res.length
        }
        resultStream.append(s"${originalMethod.classFile.fqn};${originalMethod.signature.toJava};$ratio;${if (cl) 1 else 0};$encString;$escapedString\n")
        resultStream.flush()
        //unfilteredResults += ((s"${originalMethod.classFile.fqn}:${originalMethod.signature.toJava}", res))
        successful.incrementAndGet()
      }
      return true
    }
    false
  }


  def removeConstantStrings(result: String): String = {
    var str = result
    if (constantStrings.contains(str + "_adfeiwo")) {
      ""
    } else {
      for (string <- stringUsages) {
        str = str.replace(string, "")
        if (str.isEmpty) return str
      }
      str
    }
  }

  def buildMethod(method: Method, origin: ValueOrigin,
                  result: AIResult {val domain: DefaultDomainWithCFGAndDefUse[URL]},
                  loi: Int)
                 (implicit project: Project[_]): (Option[MethodTemplate], Option[String]) = {

    val slicer = new DeobfuscationSlicer(method, origin, result, loi)
    val slicedPCs = slicer.doSlice()
    val instructions = method.body.get.instructions
    var str: Option[String] = None
    slicedPCs.toChain.toList.foreach { pc =>
      if (instructions.length > pc)
        instructions(pc) match {
          case LoadString(s) =>
            if (StringClassifier.classify(s)) str = Some(s)
          case LoadString_W(s) =>
            if (StringClassifier.classify(s)) str = Some(s)
          case _ =>
        }
    }
    val m = slicer.buildMethodFromSlice()
    if (m.descriptor.parameterTypes.exists(!checkType(_)(project.classHierarchy))) {
      usesParams.incrementAndGet()
      (None, str)
    } else {
      (Some(m), str)
    }
  }


  def checkType(ty: Type)(implicit classHierarchy: ClassHierarchy): Boolean = {
    val ot = if (ty.isObjectType) {
      Some(ty.asObjectType)
    } else if (ty.isArrayType) {
      val et = ty.asArrayType.elementType
      if (et.isObjectType) {
        Some(et.asObjectType)
      } else {
        None
      }
    } else {
      None
    }
    ot.exists { ot ⇒
      classHierarchy.isSubtypeOf(ot, CharSequenceObjectType) || // OrUnkown?!
        classHierarchy.allSubtypes(ot, reflexive = true).contains(CharSequenceObjectType)
    }
  }

  def getAccessedFieldsMethodsAndClasses(cf: ClassFile, relevantMethod: Option[Method],
                                         visitedClasses: scala.collection.mutable.Set[(ClassFile, Option[Method])] = scala
                                           .collection.mutable.Set.empty[(ClassFile, Option[Method])])
                                        (implicit modifiedClassFile: ClassFile,
                                         project: Project[_]): (Set[Method], Set[Field], Set[ClassFile]) = {
    var relevantMethods = cf.methods
      .filter(m => m.name == "<clinit>" ||
        (m.name == "<init>" /*&& relevantMethod.exists(!_.isStatic)*/)
        || relevantMethod.exists(relM => relM.name == m.name && relM.descriptor == m.descriptor)).toSet
    var toVisit = relevantMethods
    var visitedMethods = toVisit
    visitedClasses.add((cf, relevantMethod))
    var relevantFields = Set[Field]()
    var relevantClasses = Set(cf) ++ cf.interfaceTypes.flatMap[ClassFile](project.classFile(_))
    cf.superclassType.foreach(project.classFile(_).foreach(relevantClasses += _))
    relevantClasses = relevantClasses.filter(cf => (cf eq modifiedClassFile) || project.allProjectClassFiles.contains(cf))

    def lookupClassFile(cfOption: Option[ClassFile], methodOption: Option[Method] = None): Unit = {
      cfOption.map(cf => if (cf.fqn == modifiedClassFile.fqn) modifiedClassFile else cf)
        .foreach(cf =>
          if (!libraryClasses.contains(cf)
            && (!visitedClasses.contains((cf, methodOption))
            || methodOption.exists(!relevantMethods.contains(_)))) {
            val (addedMethods, addedFields, addedClasses) =
              getAccessedFieldsMethodsAndClasses(cf, methodOption, visitedClasses)
            relevantMethods ++= addedMethods
            relevantFields ++= addedFields
            relevantClasses ++= addedClasses
          }
        )
    }


    while (toVisit.nonEmpty) {
      val m = toVisit.head
      visitedMethods += m
      toVisit = toVisit.tail
      if (m.exceptionTable.isDefined) {
        m.exceptionTable.get.exceptions.foreach(ex => lookupClassFile(project.classFile(ex)))
      }
      if (m.body.isDefined) {
        m.body.get.exceptionHandlers.foreach(ex => if (ex.catchType.isDefined) lookupClassFile(project.classFile(ex.catchType.get)))
      }
      m.descriptor.parameterTypes
        .foreach(ty => if (ty.isObjectType) lookupClassFile(project.classFile(ty.asObjectType)) else if (ty.isArrayType && ty.asArrayType.elementType.isObjectType) lookupClassFile(project.classFile(ty.asArrayType.elementType.asObjectType)))
      if (m.descriptor.returnType.isObjectType) {
        lookupClassFile(project.classFile(m.descriptor.returnType.asObjectType))
      }
      else if (m.descriptor.returnType.isArrayType && m.descriptor.returnType.asArrayType.elementType.isObjectType) lookupClassFile(project.classFile(m.descriptor.returnType.asArrayType.elementType.asObjectType))
      m.body.foreach(_.instructions.foreach {
        case FieldAccess(base, name, ty) =>
          if (ty.isObjectType) lookupClassFile(project.classFile(ty.asObjectType))
          project.classFile(base).foreach(cf => {
            cf.findField(name, ty).foreach(relevantFields += _)
            lookupClassFile(Some(cf))
          })
        case MethodInvocationInstruction(base, isInterface, name, desc) if base.isObjectType && !isInterface =>
          project.classFile(base.asObjectType).foreach(targetCf => {
            val callee = project.resolveMethodReference(base.asObjectType, name, desc)
            callee.foreach(relevantMethods += _)
            if (cf == targetCf) {
              callee.foreach(m => if (!visitedMethods(m)) {
                toVisit += m
              })
            } else {
              lookupClassFile(Some(targetCf), callee)
            }
          })
        case NEW(ty) =>
          lookupClassFile(project.classFile(ty))
        case ANEWARRAY(ty) if ty.isObjectType =>
          lookupClassFile(project.classFile(ty.asObjectType))
        case MULTIANEWARRAY(ty, _) if ty.isObjectType =>
          lookupClassFile(project.classFile(ty.asObjectType))
        case INSTANCEOF(ty) if ty.isObjectType =>
          lookupClassFile(project.classFile(ty.asObjectType))
        case LDCClass(ty) if ty.isObjectType =>
          lookupClassFile(project.classFile(ty.asObjectType))
        case _ =>
      })
    }

    (relevantMethods, relevantFields, relevantClasses)
  }

  class SinkInfo(val sinkDeclaringClass: ReferenceType, val sinkMethod: String, val sinkPC: Int)

}



