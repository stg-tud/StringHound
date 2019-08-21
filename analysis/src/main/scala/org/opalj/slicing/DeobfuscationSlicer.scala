package org.opalj.slicing

/* BSD 2-Clause License - see OPAL/LICENSE for details. */

import org.opalj.ai._
import org.opalj.ai.domain.{RecordDefUse, ThrowAllPotentialExceptionsConfiguration}
import org.opalj.ba.{AccessModifier, CLASS, CODE, CodeElement, FIELD, FIELDS, InsertionPosition, LabeledCode, METHOD, METHODS, PUBLIC, STATIC}
import org.opalj.bi
import org.opalj.bi.ACC_STATIC
import org.opalj.br._
import org.opalj.br.instructions._
import org.opalj.collection.immutable.{BitArraySet, IntArraySet, IntTrieSet, RefArray}
import org.opalj.collection.mutable.IntQueue
import org.opalj.control.iterateUntil


// Assumption: slicing criterion operates on stack not on local
class DeobfuscationSlicer(
                           private val method: Method,
                           private val pcsOfSlicingCriterion: IntArraySet,
                           private val result: AIResult {
                             val domain: Domain with RecordDefUse
                           },
                           private val loi: Int,
                           private val noParameterUsage: Boolean,
                           private val includeLoi: Boolean
                         ) {

  def this(method: Method, pcOfSlicingCriterion: Int, result: AIResult {
    val domain: Domain with RecordDefUse
  }, loi: Int, noParameterUsage: Boolean = false, includeLoi: Boolean = false) = {
    this(method, IntArraySet(pcOfSlicingCriterion), result, loi, noParameterUsage, includeLoi)
  }


  private val domain = result.domain
  private val cf = method.classFile
  private val code = method.body.get
  private val instructions = code.instructions
  private val operands = result.operandsArray
  private val relevantVariables: Array[VariableSet] = Array.fill(instructions.length)(null)
  private var relevantInstructions = BitArraySet.empty
  private var backWardsReachable = BitArraySet.empty
  private var newInstructions: Array[Instruction] = _
  var slicedPCs: IntArraySet = _

  def createLoadLocalVariableInstruction(ct: ComputationalType, lvIndex: Int): LoadLocalVariableInstruction = {
    ct match {
      case ComputationalTypeInt ⇒ ILOAD.canonicalRepresentation(lvIndex)
      case ComputationalTypeFloat ⇒ FLOAD.canonicalRepresentation(lvIndex)
      case ComputationalTypeLong ⇒ LLOAD.canonicalRepresentation(lvIndex)
      case ComputationalTypeDouble ⇒ DLOAD.canonicalRepresentation(lvIndex)
      case ComputationalTypeReference ⇒ ALOAD.canonicalRepresentation(lvIndex)
      case ComputationalTypeReturnAddress ⇒ ALOAD.canonicalRepresentation(lvIndex)
    }
  }

  def createStoreLocalVariableInstruction(ct: ComputationalType, lvIndex: Int): StoreLocalVariableInstruction = {
    ct match {
      case ComputationalTypeInt ⇒ ISTORE.canonicalRepresentation(lvIndex)
      case ComputationalTypeFloat ⇒ FSTORE.canonicalRepresentation(lvIndex)
      case ComputationalTypeLong ⇒ LSTORE.canonicalRepresentation(lvIndex)
      case ComputationalTypeDouble ⇒ DSTORE.canonicalRepresentation(lvIndex)
      case ComputationalTypeReference ⇒ ASTORE.canonicalRepresentation(lvIndex)
      case ComputationalTypeReturnAddress ⇒ ASTORE.canonicalRepresentation(lvIndex)
    }
  }

  def buildMethodFromSlice(): MethodTemplate = {
    if ((newInstructions eq null) || (slicedPCs eq null)) {
      doSlice()
    }
    assert(pcsOfSlicingCriterion.size == 1, "Method Creation only works for 1 Slicing criterion")
    val pcOfSlicingCriterion = pcsOfSlicingCriterion.head
    val name = method.name
    //        name = if (name == "<clinit>" || name == "<init>")
    //            name.substring(1, name.length - 1)+"MOD"
    //        else name
    // should not need to rename anymore?
    var usedParams = BitArraySet.empty
    newInstructions.iterator.zipWithIndex.filter(_._1 ne null).foreach {
      case (ins, pc) ⇒
        if (slicedPCs.contains(pc)) {
          ins match {
            case LoadLocalVariableInstruction(_, lvIndex) ⇒
              val origins = domain.localOrigin(pc, lvIndex)
              if ((origins ne null) && origins.exists(_ < 0)) {
                usedParams += lvIndex
              }
            case IINC(lvIndex, _) ⇒
              val origins = domain.localOrigin(pc, lvIndex)
              if ((origins ne null) && origins.exists(_ < 0)) {
                usedParams += lvIndex
              }
            case _ ⇒
          }
        }
    }
    val filteredParameters = RefArray.from(localVariableParameterIndexMap(method.descriptor, method.isStatic)
      .filter {
        case (index, ft) ⇒
          usedParams.contains(index)
      }.values.toArray.asInstanceOf[Array[AnyRef]])
    val accessFlags = method.accessFlags | {
      if (usedParams.contains(0) || name == "<init>") 0 else ACC_STATIC.mask
    }
    var nextFree = if ((accessFlags & ACC_STATIC.mask) != 0) 0 else 1
    var parameterIndexes = Map[Int, Int]()
    method.descriptor.parameterTypes.zipWithIndex.foreach { case (ft, index) =>
      if (usedParams.contains(index)) {
        parameterIndexes += ((index, nextFree))
        nextFree += ft.operandSize
      }
    }

    val filteredAttributes = code.attributes.filter {
      _ match {
        case lvt: LocalVariableTable ⇒ false // might be incorrect since we remove parameters
        // don't need it anyway
        case ltvt: LocalVariableTypeTable ⇒ false
        case _ ⇒ true
      }
    }
    val maxSliced = findLastRelevant().head // TODO
    val minSliced = slicedPCs.min
    val filteredExceptionHandlers = code.exceptionHandlers.filter { eh ⇒
      slicedPCs.contains(eh.handlerPC) && // Should eliminate all catch blocks that are not part of
        // the slice
        (eh.startPC until eh.endPC).exists(slicedPCs.contains(_))
      // eliminate empty exception Handlers
    }

    val labeledCode =
      LabeledCode(
        code.copy(
          instructions = newInstructions,
          attributes = filteredAttributes,
          exceptionHandlers = filteredExceptionHandlers
        ),
        slicedPCs.contains(_)
      )
    if (filteredExceptionHandlers.exists(_.handlerPC <= minSliced)) {
      if (method.name == "<init>")
        labeledCode.insert(0, InsertionPosition.Before,
          Seq(LoadLocalVariableInstruction(method.classFile.thisType, 0),
            INVOKESPECIAL(DUMMY_CLASS.fqn, isInterface = false, "<init>", MethodDescriptor.withNoArgs(VoidType).toJVMDescriptor),
            ACONST_NULL))
      else
        labeledCode.insert(0, InsertionPosition.Before, Seq(ACONST_NULL))
    } else if (method.name == "<init>")
      labeledCode.insert(0, InsertionPosition.Before,
        Seq(LoadLocalVariableInstruction(method.classFile.thisType, 0),
          INVOKESPECIAL(DUMMY_CLASS.fqn, isInterface = false, "<init>", MethodDescriptor.withNoArgs(VoidType).toJVMDescriptor)))

    //    if (!method.isStatic && !usedParams.contains(0)) {
    newInstructions.iterator.zipWithIndex.filter(_._1 ne null).foreach {
      case (ins, pc) ⇒
        if (slicedPCs.contains(pc)) {
          ins match {
            case LoadLocalVariableInstruction(ct, lvIndex) if parameterIndexes.get(lvIndex).isDefined ⇒
              labeledCode.replace(pc, Seq(createLoadLocalVariableInstruction(ct, parameterIndexes(lvIndex))))
            case StoreLocalVariableInstruction(ct, lvIndex) if parameterIndexes.get(lvIndex).isDefined ⇒
              labeledCode.replace(pc, Seq(createStoreLocalVariableInstruction(ct, parameterIndexes(lvIndex))))
            case IINC(lvIndex, constValue) if parameterIndexes.get(lvIndex).isDefined ⇒
              labeledCode.replace(pc, Seq(IINC(parameterIndexes(lvIndex), constValue)))
            case _ ⇒
          }
        }
      //      }
    }
    //        if (isNew) {
    //            labeledCode.insert(pcOfSlicingCriterion, InsertionPosition.After, Seq(DUP))
    //        }
    var maxLocals = method.body.get.maxLocals + 1 // skip one in case of double/long
    var beforeInstructions = Seq[CodeElement[AnyRef]]()
    var afterInstructions = Seq[CodeElement[AnyRef]]()
    if (instructions(pcOfSlicingCriterion).isInvocationInstruction) {
      val ins = instructions(pcOfSlicingCriterion).asInvocationInstruction
      var nextLocal = maxLocals + ins.methodDescriptor.requiredRegisters
      maxLocals = nextLocal + 1
      ins.methodDescriptor.parameterTypes.reverse.foreach { ft ⇒

        if (ft.operandSize == 2) {
          nextLocal -= 1
        }

        beforeInstructions :+= CodeElement.instructionToInstructionElement(
          StoreLocalVariableInstruction(ft, nextLocal)
        )
        if (ft.isObjectType && ft.asObjectType == ObjectType.String) {
          beforeInstructions ++= Seq(
            CodeElement.instructionToInstructionElement(
              LoadLocalVariableInstruction(ft, nextLocal)
            ),
            CodeElement.instructionToInstructionElement(INVOKESTATIC("slicing/StringLeaker", isInterface = false, "logInput", MethodDescriptor.JustTakes(ObjectType.String).toJVMDescriptor))
          )
        }
        afterInstructions +:= CodeElement.instructionToInstructionElement(LoadLocalVariableInstruction(ft, nextLocal))
        nextLocal -= 1
      }

    }
    labeledCode.insert(pcOfSlicingCriterion, InsertionPosition.Before, beforeInstructions ++ afterInstructions)

    if (maxSliced == pcOfSlicingCriterion) { // position of loi is after it, but nothing happens or before it
      labeledCode.insert(maxSliced, InsertionPosition.After,
        Seq(
          //                    CodeElement.instructionToInstructionElement(ALOAD(maxLocals)),
          CodeElement.instructionToInstructionElement(
            INVOKESTATIC(
              "slicing/StringLeaker",
              isInterface = false,
              "logString", "(Ljava/lang/CharSequence;)V"
            )
          ),
          CodeElement.instructionToInstructionElement(getDefaultValueFor(method.returnType)),
          ReturnInstruction(method.returnType)
        ))
    } else {
      labeledCode.insert(pcOfSlicingCriterion, InsertionPosition.After,
        Seq(
          CodeElement.instructionToInstructionElement(DUP),
          CodeElement.instructionToInstructionElement(ASTORE(maxLocals))
        ))
      labeledCode.insert(maxSliced, InsertionPosition.After,
        Seq(
          CodeElement.instructionToInstructionElement(ALOAD(maxLocals)),
          CodeElement.instructionToInstructionElement(
            INVOKESTATIC(
              "slicing/StringLeaker",
              isInterface = false,
              "logString", "(Ljava/lang/CharSequence;)V"
            )
          ),
          CodeElement.instructionToInstructionElement(getDefaultValueFor(method.returnType)),
          ReturnInstruction(method.returnType)
        ))
    }


    val newCode = labeledCode.result


    val newCodeLength = newCode.instructions.length
    var skip = 0
    val instructionsWithFixedOffsets = newCode.instructions.iterator.zipWithIndex.flatMap {
      case (ins, pc) ⇒
        ins match {
          case null ⇒ if (skip > 0) {
            skip -= 1
            Seq()
          } else {
            Seq(null)
          }
          case SimpleConditionalBranchInstruction(offset) ⇒
            if (pc + offset < newCodeLength) {
              Seq(ins)
            } else {
              skip = 2
              Seq(POP, NOP, NOP)
            }
          case GotoInstruction(offset) ⇒
            if (pc + offset < newCodeLength) {
              Seq(ins)
            } else {
              skip = 2
              Seq(NOP, NOP, NOP)
            }
          case LOOKUPSWITCH(_, _) ⇒ Seq(ins)
          case TABLESWITCH(_, _, _, _) ⇒ Seq(ins)
          case _ ⇒ Seq(ins)
        }
    }.toArray
    val fixedCode = newCode.copy(instructions = instructionsWithFixedOffsets).MAXLOCALS(maxLocals + 2)
    METHOD(new AccessModifier(accessFlags), name,
      MethodDescriptor.apply(filteredParameters, method.returnType).toJVMDescriptor,
      fixedCode)
      .result(cf.version, cf.thisType)._1
  }

  def buildBackwardsReachable(): BitArraySet = {
    var backWardsReachable = BitArraySet.empty
    val worklist = IntQueue(loi)
    while (worklist.nonEmpty) {
      val pc = worklist.dequeue
      backWardsReachable += pc
      domain.predecessorsOf(pc).withFilter(!backWardsReachable.contains(_)).foreach(worklist.enqueue)
    }
    backWardsReachable.iterator.filter(domain.dominatorTree.strictlyDominates(loi, _)).foreach { pc ⇒
      backWardsReachable -= pc
      // This is necessary for loop handling
    }
    if (!includeLoi) {
      backWardsReachable -= loi
    }
    backWardsReachable
  }


  def doSlice(): IntArraySet = {
    // maybe there is a better way for this?
    backWardsReachable = buildBackwardsReachable()
    identifyDependencies()
    calculateVariableRelevance()
    slicedPCs = calculateActualSlice()
    slicedPCs
  }

  val DUMMY_CLASS = ObjectType("slicing/DummyClass")

  private def identifyDependencies(): Unit = {
    // Why do we use the two loops? => We don't need to - we just want to do checkControlDependencies as seldomly as possible
    val worklist = IntQueue(pcsOfSlicingCriterion.toArray: _*)
    while (worklist.nonEmpty) {
      while (worklist.nonEmpty) {
        var current = worklist.dequeue
        current = getPCOfOrigin(current)
        if (!relevantInstructions.contains(current)) {
          findOriginsForOperands(current)
          findUsagesOfOperands(current)
        }
      }
      checkControlDependencies()
    }

    def findOriginsForOperands(origin: Int): Unit = {
      if (origin >= 0) { // We need to make sure its not a parameter
        val ins = instructions(origin)
        relevantInstructions += origin
        ins match {
          case FieldReadAccess(base, name, ft) ⇒
            if (base == cf.thisType) {
              code.filter {
                case (pc, FieldWriteAccess(_, name2, ft2)) if name == name2 && ft == ft2 ⇒
                  origin > pc
                //                                    backWardsReachable.contains(pc) // We actually should check whether its backwards reachable from the origin here
                case _ ⇒ false
              }.foreach { pc ⇒
                worklist.enqueue(pc)
              }
            }
          case _ ⇒
        }
        if (ins.readsLocal) {
          require(ins.isIINC)
          domain.localOrigin(origin, ins.indexOfReadLocal).foreach(origin ⇒
            worklist.enqueue(origin))
        }
        val numberOfOperands = ins.numberOfPoppedOperands(operands(origin)(_)
          .computationalType.category)
        for (i ← 0 until numberOfOperands) {
          val origins = domain.operandOrigin(origin, i)
          origins.map(getPCOfOrigin _).filter(backWardsReachable.contains(_)) foreach (origin ⇒
            worklist.enqueue(origin))
        }
      }
    }

    def findUsagesOfOperands(origin: Int): Unit = {
      if (origin >= 0) {
        // We filter parameters, for different usage contexts this might not be sensible
        domain.safeUsedBy(origin).foreach { user ⇒
          val ins = instructions(user)
          val isRelevant = ins match {
            case _: ArrayAccessInstruction ⇒ true
            case _: FieldAccess ⇒ true
            case _ ⇒ false
          }
          if (backWardsReachable.contains(user)
            && (ins.isMethodInvocationInstruction ||
            isRelevant) // TODO does this suffice?!
          ) {
            worklist.enqueue(user)
          }
        }
      }
    }

    def checkControlDependencies(): Unit = {
      val cdsOFSlicingCriterion =
      //                domain.pdtBasedControlDependencies.transitiveDF(pcOfSlicingCriterion)
        pcsOfSlicingCriterion.map(domain.pdtBasedControlDependencies(_))
      // what is best here? exceptional control flow breaks this
      for (pc ← relevantInstructions.iterator) {
        val directControlDependencies = domain.pdtBasedControlDependencies(pc)
        if (directControlDependencies.nonEmpty &&
          !haveAtLeastOneCommonElement(directControlDependencies, cdsOFSlicingCriterion)) {
          // relevant Instruction has control dependency that is different than the one
          // from the slicing criterion
          directControlDependencies.iterator.filterNot(relevantInstructions.contains)
            .foreach(worklist.enqueue)
        }
      }
    }
  }

  private def getPCOfOrigin(origin: Int): Int = {
    if (origin < ImmediateVMExceptionsOriginOffset) {
      pcOfImmediateVMException(origin)
    } else {
      if (noParameterUsage && (method.isStatic && origin < 0 || origin < -1)) {
        throw ParameterUsageException(pcsOfSlicingCriterion, method, origin)
      }
      origin
    }

  }

  private def findLastRelevant(): IntTrieSet = {
    var prevSet = if (includeLoi) {
      IntTrieSet(loi)
    } else {
      domain.predecessorsOf(loi)
    }
    var currSet = prevSet.filter(relevantInstructions.contains(_))
    while (currSet.isEmpty) {
      val set = prevSet
      prevSet = IntTrieSet.empty
      set.foreach(prevSet ++!= domain.predecessorsOf(_))
      currSet = prevSet.filter(relevantInstructions.contains(_))
    }
    currSet
  }

  // The principle is the following:
  // relevantVariables(pc) contains the stackIndexes and localIndexes that are relevant after the
  // instruction at pc is executed.
  private def calculateVariableRelevance(): Unit = {
    val startSet = findLastRelevant()
    for (pc ← startSet) {
      val ins = instructions(pc)
      var stackIndexes = List.empty[Boolean]
      var localIndexes = BitArraySet.empty
      if (ins.readsLocal) {
        localIndexes += ins.indexOfReadLocal
      } else {
        val ops = operands(pc)
        val numOperandsPushed = ins.numberOfPushedOperands(ops(_).computationalType.category)
        val numOperandsUsed = ins.numberOfPoppedOperands(ops(_).computationalType.category)
        val numOperandsAfter = ops.size - numOperandsUsed
        // the values that are pushed by this instruction are relevant(making this instruction
        // relevant)
        iterateUntil(0, numOperandsPushed) { _ ⇒
          stackIndexes :+= true
        }
        // elements that are on the stack but are used by a later instruction are not relevant
        iterateUntil(0, numOperandsAfter) { _ ⇒
          stackIndexes :+= false
        }
      }
      relevantVariables(pc) = VariableSet(stackIndexes, localIndexes)
    }
    val worklist = IntQueue()
    startSet.foreach(pc ⇒ worklist.enqueue(pc))
    while (worklist.nonEmpty) {
      val current = worklist.dequeue
      val variables = markVariables(current)
      val preds = domain.predecessorsOf(current)
      preds.foreach {
        pred ⇒
          if (domain.isDirectRegularPredecessorOf(pred, current)) {
            if (mergeAndCheckForChanges(pred, variables))
              worklist.enqueue(pred)
          } else {
            // exceptional control flow
            // TODO we have to fix this but how ?!
          }
      }

    }
  }

  private def mergeAndCheckForChanges(pred: PC, variables: VariableSet): Boolean = {
    if (relevantVariables(pred) == null) {
      relevantVariables(pred) = variables
      true
    } else {
      val VariableSet(oldStack, oldLocals) = relevantVariables(pred)
      val VariableSet(newStack, newLocals) = variables
      val mergedLocals = oldLocals | newLocals
      val (shorter, longer) = if (oldStack.lengthCompare(newStack.size) <= 0) {
        (oldStack, newStack)
      } else {
        (newStack, oldStack)
      }
      val mergedStack = shorter.iterator.padTo(longer.size, false).zip(longer.iterator)
        .map(pair ⇒ pair._1 || pair._2).toList
      relevantVariables(pred) = VariableSet(mergedStack, mergedLocals)
      !(oldStack == newStack && oldLocals == newLocals)
    }
  }

  private def markVariables(pc: PC): VariableSet = {
    val ins = instructions(pc)
    val pushedNum = ins.numberOfPushedOperands(operands(pc)(_).computationalType.category)
    val poppedNum = ins.numberOfPoppedOperands(operands(pc)(_).computationalType.category)
    val VariableSet(stackIndexes, localIndexes) = relevantVariables(pc)
    val (droppedIndexes, newStackIndexes_) = stackIndexes.splitAt(pushedNum)
    var newStackIndexes = newStackIndexes_ // This is annoying
    var newLocalIndexes = localIndexes
    if (pushedNum == 0 || stackIndexes.nonEmpty) {
      ins match {
        case StoreLocalVariableInstruction(ct, index) ⇒
          // Writes relevant local but is not IINC (which should already be marked relevant)
          if (localIndexes.contains(index)) {
            // written local is relevant
            // we pop a relevant value
            newStackIndexes +:= true
            // the value before this instruction is not relevant because it is overwritten
            newLocalIndexes -= index
          } else {
            // popped value not relevant
            newStackIndexes +:= false
          }
        case IINC(_, _) ⇒ // Do nothing; iinc should already be part of relevant variables
        // therefore the index is marked in the previous step
        case LoadLocalVariableInstruction(ct, index) ⇒
          // all push exactly 1 operand
          if (stackIndexes.head) {
            // the value pushed is relevant
            newLocalIndexes += index
          }
        case SWAP ⇒
          newStackIndexes +:= droppedIndexes.head
          newStackIndexes +:= droppedIndexes.tail.head
        case DUP ⇒
          newStackIndexes +:= stackIndexes.head || stackIndexes(1)
        case DUP_X1 ⇒
          // 1,2 ==> 1,2,1
          newStackIndexes +:= stackIndexes(1)
          newStackIndexes +:= stackIndexes.head || stackIndexes(2)
        case DUP_X2 ⇒
          if (operands(pc)(1).computationalType.category == Category2ComputationalTypeCategory) {
            //                    0,1 ==> 0, 1, 0
            newStackIndexes +:= stackIndexes(1)
            newStackIndexes +:= stackIndexes.head || stackIndexes(2)
          } else {
            //                    0,1,2 ==> 0,1,2,1
            newStackIndexes +:= stackIndexes(2)
            newStackIndexes +:= stackIndexes(1)
            newStackIndexes +:= stackIndexes.head || stackIndexes(3)
          }
        case DUP2 ⇒
          if (operands(pc)(0).computationalType.category == Category2ComputationalTypeCategory) {
            newStackIndexes +:= stackIndexes.head || stackIndexes(1)
          } else {
            //                    1,2 ==> 1,2 1,2
            newStackIndexes +:= stackIndexes(1) || stackIndexes(3)
            newStackIndexes +:= stackIndexes.head || stackIndexes(2)
          }
        case DUP2_X1 ⇒
          if (operands(pc)(0).computationalType.category == Category2ComputationalTypeCategory) {
            //                    1,2 == 1,2,1
            newStackIndexes +:= stackIndexes(1)
            newStackIndexes +:= stackIndexes.head || stackIndexes(2)
          } else {
            // 1,2,3 => 1,2,3,1,2
            newStackIndexes +:= stackIndexes(2)
            newStackIndexes +:= stackIndexes(1) || stackIndexes(4)
            newStackIndexes +:= stackIndexes.head || stackIndexes(3)
          }
        case DUP2_X2 ⇒
          if (operands(pc)(0).computationalType.category == Category1ComputationalTypeCategory) {
            if (operands(pc)(1).computationalType.category == Category1ComputationalTypeCategory) {
              if (operands(pc)(2).computationalType.category == Category1ComputationalTypeCategory) {
                //                            Form  1
                newStackIndexes +:= stackIndexes(3)
                newStackIndexes +:= stackIndexes(2)
                newStackIndexes +:= stackIndexes(1) || stackIndexes(4)
                newStackIndexes +:= stackIndexes.head || stackIndexes(5)
              } else {
                //                            Form 3
                newStackIndexes +:= stackIndexes(2)
                newStackIndexes +:= stackIndexes(1) || stackIndexes(4)
                newStackIndexes +:= stackIndexes.head || stackIndexes(3)
              }
            }
          } else {
            if (operands(pc)(1).computationalType.category == Category1ComputationalTypeCategory) {
              //                        Form 2 assume that 3 is cat 2
              newStackIndexes +:= stackIndexes(2)
              newStackIndexes +:= stackIndexes(1)
              newStackIndexes +:= stackIndexes.head || stackIndexes(3)
            } else {
              //                        Form 4
              newStackIndexes +:= stackIndexes(1)
              newStackIndexes +:= stackIndexes.head || stackIndexes(2)
            }
          }
        case ATHROW ⇒
          // Clears whole stack and only leaves exception on it
          // TODO
          newStackIndexes = List(stackIndexes.head)
        case other ⇒
          val instructionRelevant = (droppedIndexes contains true) ||
            (relevantInstructions contains pc)
          iterateUntil(0, poppedNum) { _ ⇒
            newStackIndexes +:= instructionRelevant
          }
        // array?
      }
    }
    VariableSet(newStackIndexes, newLocalIndexes)
  }

  private def calculateActualSlice(): IntArraySet = {
    var slicedPCs = IntArraySet.empty
    var skip = 0
    val slice = code.instructions.iterator.zipWithIndex.map { p ⇒
      val (ins, pc) = p
      if (ins eq null) {
        if (skip > 0) {
          skip -= 1
          NOP
        } else {
          null
        }
      } else if (!backWardsReachable.contains(pc) || (relevantVariables(pc) eq null)) {
        ins
      } else {
        val pushedNum = ins.numberOfPushedOperands(operands(pc)(_)
          .computationalType.category)
        val VariableSet(stackIndexes, localIndexes) = relevantVariables(pc)
        val pushedVariables = stackIndexes.take(pushedNum)
        val slicedInstruction =
          if (pushedNum == 0 || stackIndexes.nonEmpty) {

            ins match {
              case ins@StoreLocalVariableInstruction(ct, index) ⇒
                if (localIndexes.contains(index)) {
                  // written local is relevant
                  ins
                } else {
                  //we need to check whether the origin of the value might be part of the
                  // slice despite not pushing a relevant value, e.g. because it is a
                  // method call on a relevant object
                  // We cannot just check the origin, there might be other stack
                  // manipulating instructions between this usage here and the origin.
                  // We only insert a pop if we really are at the next instruction
                  val origins = domain.operandOrigin(pc, 0).filter(originPc ⇒
                    originPc >= 0 &&
                      instructions(originPc)
                        .nextInstructions(originPc)(code).contains(pc))
                  val pushedValueInSlice = origins.exists(relevantInstructions.contains(_))
                  if (pushedValueInSlice && !pcsOfSlicingCriterion.exists(domain.postDominatorTree.strictlyDominates(pc, _))) {
                    skip = ins.indexOfNextInstruction(pc)(code) - pc - 1
                    POP
                  } else {
                    null
                  }
                }

              case IINC(index, _) ⇒
                if (localIndexes.contains(index) || relevantInstructions.contains(pc)) {
                  ins
                } else {
                  null
                }
              case LoadLocalVariableInstruction(ct, index) ⇒
                // all push exactly 1 operand
                if (stackIndexes.head) {
                  // the value pushed is relevant
                  ins
                } else {
                  null
                }

              case SWAP | DUP ⇒
                // This is only necessary if both references are relevant
                if (stackIndexes.head && stackIndexes(1)) {
                  ins
                } else {
                  null
                }
              case DUP_X1 ⇒
                if (stackIndexes.head && stackIndexes(2)) {
                  ins
                } else {
                  null
                }
              case DUP_X2 ⇒
                if (operands(pc)(1).computationalType.category == Category1ComputationalTypeCategory) {
                  if (stackIndexes.head && stackIndexes(3)) {
                    ins
                  } else {
                    null
                  }
                } else {
                  if (stackIndexes.head && stackIndexes(2)) {
                    ins
                  } else {
                    null
                  }
                }
              case DUP2 ⇒
                if (operands(pc)(0).computationalType.category == Category2ComputationalTypeCategory) {
                  if (stackIndexes.head && stackIndexes(1)) {
                    ins
                  } else {
                    null
                  }
                } else {
                  (stackIndexes.head, stackIndexes(1), stackIndexes(2), stackIndexes(3)) match {
                    case (_, _, false, false) ⇒ null
                    case (false, false, _, _) ⇒ null
                    case (true, false, true, false) ⇒ DUP
                    case (false, true, false, true) ⇒ DUP
                    case (true, true, true, true) ⇒ ins
                    case (true, true, true, false) ⇒ DUP_X1
                    case _ ⇒ ???
                  }
                }
              case DUP2_X1 ⇒
                if (operands(pc)(0).computationalType.category == Category2ComputationalTypeCategory) {
                  if (stackIndexes.head && stackIndexes(2)) {
                    ins
                  } else {
                    null
                  }
                } else {
                  (stackIndexes.head, stackIndexes(1), stackIndexes(2), stackIndexes(3), stackIndexes(4)) match {
                    case (_, _, _, false, false) ⇒ null
                    case (true, false, false, true, false) ⇒ DUP
                    case (false, true, false, false, true) ⇒ DUP
                    case (true, true, false, true, true) ⇒ DUP2
                    case (true, true, true, true, true) ⇒ ins
                    case _ ⇒ ???
                  }
                }
              case DUP2_X2 ⇒ ???
              case ATHROW ⇒
                if (stackIndexes.head) {
                  ins
                } else {
                  null
                }
              case jump: UnconditionalBranchInstruction ⇒
                val cds = domain.pdtBasedControlDependencies(pc)
                if (cds.isEmpty ||
                  (!pcsOfSlicingCriterion.exists(cds.contains) &&
                    haveAtLeastOneCommonElement(cds, slicedPCs))) {
                  jump
                } else {
                  null
                }
              case POP ⇒
                val origins = domain.operandOrigin(pc, 0)
                val pushedValueInSlice = origins.exists(relevantInstructions.contains(_))
                if (pushedValueInSlice) {
                  POP
                } else {
                  null
                }
              case other ⇒
                if (pushedVariables.contains(true) | relevantInstructions.contains(pc)) {
                  other
                } else {
                  null
                }
            }
          } else {
            null
          }
        if (slicedInstruction != null) {
          slicedPCs += pc
          slicedInstruction
        } else {
          ins
        }

      }
    }
    newInstructions = slice.toArray

    slicedPCs
  }

  private def haveAtLeastOneCommonElement(set1: IntArraySet, set2: Set[IntArraySet]): Boolean = {
    set2.exists(haveAtLeastOneCommonElement(set1, _))
  }

  private def haveAtLeastOneCommonElement(set1: IntArraySet, set2: IntArraySet): Boolean = {
    val (shorter, longer) = if (set1.size < set2.size) (set1, set2) else (set2, set1)
    shorter.exists(longer.contains)
  }

  def getDefaultValueFor(returnType: Type): LabeledInstruction =
    returnType match {
      case _ if returnType.isIntLikeType ⇒ ICONST_0
      case _: VoidType ⇒ NOP
      case _: LongType ⇒ LCONST_0
      case _: DoubleType ⇒ DCONST_0
      case _: FloatType ⇒ FCONST_0
      case _: BooleanType ⇒ ICONST_0
      case _ if returnType.isObjectType ⇒ ACONST_NULL
      case _ if returnType.isReferenceType ⇒ ACONST_NULL
    }

  private def localVariableParameterIndexMap(methodDescriptor: MethodDescriptor, isStatic: Boolean): Map[Int, FieldType] = {
    var index = if (isStatic) 0 else 1
    var res = Map.empty[Int, FieldType]
    methodDescriptor.parameterTypes.iterator.foreach { ft ⇒
      res += index → ft
      index += ft.operandSize
    }
    res
  }

  private case class VariableSet(stack: List[Boolean], locals: BitArraySet) {
    override def toString: String = {
      val sb = new StringBuffer()
      sb.append(stack.mkString("(", ",", ")"))
      sb.append(" ; ")
      sb.append(locals.iterator.zipWithIndex.map(_.swap).mkString("(", ",", ")"))
      sb.toString
    }

  }

}

object DeobfuscationSlicer {
  def buildTargetClass(): ClassFile = {
    CLASS(
      version = bi.Java5Version,
      accessModifiers = PUBLIC,
      thisType = "slicing/StringLeaker",
      fields = FIELDS(
        FIELD(PUBLIC.STATIC, "result", ObjectType.String.toJVMTypeName),
        FIELD(PUBLIC.STATIC, "input", ArrayType(ObjectType.String).toJVMTypeName)
      ),
      methods = METHODS(
        METHOD(
          STATIC.PUBLIC,
          "<clinit>",
          MethodDescriptor.NoArgsAndReturnVoid.toJVMDescriptor,
          CODE(
            ICONST_0,
            ANEWARRAY(ObjectType.String),
            PUTSTATIC("slicing/StringLeaker", "input", ArrayType(ObjectType.String).toJVMTypeName),
            RETURN
          )
        ),
        METHOD(
          STATIC.PUBLIC,
          "logInput",
          MethodDescriptor.JustTakes(ObjectType.String).toJVMDescriptor,
          CODE(
            GETSTATIC("slicing/StringLeaker", "input", ArrayType(ObjectType.String).toJVMTypeName),
            ASTORE_3,
            ALOAD_3, // REG_3 = Old Array
            ARRAYLENGTH,
            ICONST_1,
            IADD,
            DUP,
            ISTORE_1, // REG_1 = New Length
            ANEWARRAY(ObjectType.String),
            ASTORE(4), // REG_4 = New Array
            ALOAD_3,
            ICONST_0,
            ALOAD(4),
            ICONST_0,
            ALOAD_3,
            ARRAYLENGTH,
            INVOKESTATIC("java/lang/System", isInterface = false, "arraycopy", MethodDescriptor(RefArray(ObjectType.Object, IntegerType, ObjectType.Object, IntegerType, IntegerType), VoidType).toJVMDescriptor),
            ALOAD(4),
            ALOAD(4),
            ALOAD_3,
            ARRAYLENGTH,
            ALOAD_0,
            AASTORE,
            PUTSTATIC("slicing/StringLeaker", "input", ArrayType(ObjectType.String).toJVMTypeName),
            RETURN
          )
        ),
        METHOD(
          PUBLIC.STATIC,
          "logString",
          MethodDescriptor.JustTakes(ObjectType("java/lang/CharSequence")).toJVMDescriptor,
          CODE(
            ALOAD_0,
            INVOKEVIRTUAL(ObjectType.Object, "toString", MethodDescriptor.JustReturnsString),
            PUTSTATIC("slicing/StringLeaker", "result", ObjectType.String.toJVMTypeName),
            RETURN
          )
        )
      )
    ).toBR._1
  }
}

trait SlicingConfiguration extends ThrowAllPotentialExceptionsConfiguration {

  override def throwExceptionsOnMethodCall: ExceptionsRaisedByCalledMethod = {
    ExceptionsRaisedByCalledMethods.AllExplicitlyHandled
  }

  override def throwNullPointerExceptionOnMethodCall: Boolean = false

  override def throwNullPointerExceptionOnFieldAccess: Boolean = false

  override def throwNullPointerExceptionOnArrayAccess: Boolean = false

  override def throwArrayIndexOutOfBoundsException: Boolean = false

  override def throwNullPointerExceptionOnThrow: Boolean = false

  override def throwClassCastException: Boolean = false

  override def abortProcessingExceptionsOfCalledMethodsOnUnknownException: Boolean = false

  override def abortProcessingThrownExceptionsOnUnknownException: Boolean = false

  override def throwArithmeticExceptions: Boolean = false

  override def throwNullPointerExceptionOnMonitorAccess: Boolean = true

  override def throwArrayStoreException: Boolean = false

  override def throwNegativeArraySizeException: Boolean = false

  override def throwClassNotFoundException: Boolean = false
}

case class ParameterUsageException(pcsOfSlicingCriterion: IntArraySet, method: Method, usedParameter: Int)
  extends RuntimeException
