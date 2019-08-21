package extract.methods.lib.detect

import java.net.URL

import classifier.SPRAndroidTypeInformationKey
import org.opalj.br.analyses.Project
import org.opalj.br.instructions.{ANEWARRAY, ARRAYLENGTH, ATHROW, ArrayLoadInstruction, ArrayStoreInstruction, CHECKCAST, ComparisonInstruction, GETFIELD, GETSTATIC, GOTO, GOTO_W, IFGE, IFGT, IFLE, IFLT, IFNE, IFNONNULL, IFNULL, IF_ACMPEQ, IF_ACMPNE, IF_ICMPEQ, IF_ICMPGE, IF_ICMPGT, IF_ICMPLE, IF_ICMPLT, IF_ICMPNE, IINC, INSTANCEOF, INVOKEINTERFACE, INVOKESPECIAL, INVOKESTATIC, INVOKEVIRTUAL, JSR, JSR_W, LOOKUPSWITCH, LoadConstantInstruction, MONITORENTER, MONITOREXIT, MULTIANEWARRAY, MethodInvocationInstruction, NEW, NEWARRAY, NumericConversionInstruction, PUTFIELD, PUTSTATIC, ReturnInstruction, StackBasedArithmeticInstruction, TABLESWITCH}
import org.opalj.br.{Code, Method, Type}

import scala.collection.mutable

object StructurePreservingRep {

  var map: Map[String, String] = Map.empty[String, String]

  var invoke: String = ""
  var putstatic: String = ""
  var putfield: String = ""
  var check: String = ""
  var arrayStore: String = ""
  var if1: String = ""
  var athrow: String = ""
  var switch: String = ""
  var monitor: String = ""
  var return1: String = ""
  var const: String = ""

  var to: String = ""

  var new1: String = ""
  var newarray: String = ""
  var arrlength: String = ""

  var arrayLoad: String = ""
  var getfield: String = ""
  var getstatic: String = ""

  var emptyMap: Map[String, Int] = Map.empty[String, Int]


  def extractNLR(m: Method, theProject: Project[URL], equal: Boolean): mutable.HashMap[String, Int] = {
    if (emptyMap.isEmpty) {
      map = theProject.get(SPRAndroidTypeInformationKey).keyMap
      invoke = map("invoke")
      putstatic = map("putstatic")
      putfield = map("putfield")
      check = map("check")
      arrayStore = map("ArrayStore")
      if1 = map("if")
      athrow = map("athrow")
      switch = map("switch")
      monitor = map("monitor")
      return1 = map("return")
      const = map("const")

      to = map("to")

      new1 = map("new")
      newarray = map("newarray")
      arrlength = map("arraylength")

      arrayLoad = map("ArrayLoad")
      getfield = map("getfield")
      getstatic = map("getstatic")
      emptyMap = map.values.toSet[String].toList.sorted.map(v => v -> 0).toMap
    }
    val androidTypeList = theProject.get(SPRAndroidTypeInformationKey).androidTypeList
    var counter: mutable.HashMap[String, Int] = mutable.HashMap.empty[String, Int]
    counter ++= emptyMap ++ (if (equal) Map("non" -> 0) else Map[String, Int]())
    androidTypeList(m.returnType).foreach(i => if (i != null && i.nonEmpty && (i != "non" || equal)) counter += ((i, counter(i) + 1)))
    m.parameterTypes.foreach(p => androidTypeList(p).foreach(i => if (i != null && i.nonEmpty && (i != "non" || equal)) counter += ((i, counter(i) + 1))))
    if (m.body.isDefined && m.body.nonEmpty)
      counter = extractNameLessCode(m.body.get, theProject, m, equal, counter)
    counter.filter(p => p._1 != "non")
  }

  def extractNameLessCode(n: Code, theProject: Project[URL], m: Method, equal: Boolean, counter: mutable.HashMap[String, Int]): mutable.HashMap[String, Int] = {
    val atl = theProject.get(SPRAndroidTypeInformationKey).androidTypeList
    val androidTypeList = androidType(atl)(equal)
    n.foreach { i =>
      (i.pc, i.instruction) match {
        case (_, PUTSTATIC(clazz, _, ft)) => counter += putstatic -> (counter.getOrElse(putstatic, 0) + 1)
          androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
          androidTypeList(ft).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
        case (_, PUTFIELD(clazz, _, ft)) => counter += putfield -> (counter.getOrElse(putfield, 0) + 1)
          androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
          androidTypeList(ft).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))

        case (_, GETFIELD(clazz, _, ft)) => counter += getfield -> (counter.getOrElse(getfield, 0) + 1)
          androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
          androidTypeList(ft).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
        case (_, GETSTATIC(clazz, _, ft)) => counter += getstatic -> (counter.getOrElse(getstatic, 0) + 1)
          androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
          androidTypeList(ft).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))

        case (_, i: MethodInvocationInstruction) => i match {
          case INVOKESTATIC(clazz, _, name, md) => {
            if (theProject.isLibraryType(clazz)) {
              counter += invoke -> (counter.getOrElse(invoke, 0) + 1)
              androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              androidTypeList(md.returnType).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              if (map.contains(name)) counter += map(name) -> (counter.getOrElse(map(name), 0) + 1)
              md.parameterTypes.toList.foreach(p => androidTypeList(p).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1)))
            } else {
              counter += invoke -> (counter.getOrElse(invoke, 0) + 1)
              androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              androidTypeList(md.returnType).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              md.parameterTypes.toList.foreach(p => androidTypeList(p).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1)))
            }
          }
          case INVOKESPECIAL(clazz, _, name, md) => {
            if (theProject.isLibraryType(clazz)) {
              counter += invoke -> (counter.getOrElse(invoke, 0) + 1)
              androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              androidTypeList(md.returnType).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              if (map.contains(name)) counter += map(name) -> (counter.getOrElse(map(name), 0) + 1)
              md.parameterTypes.toList.foreach(p => androidTypeList(p).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1)))
            } else {
              counter += invoke -> (counter.getOrElse(invoke, 0) + 1)
              androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              androidTypeList(md.returnType).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              md.parameterTypes.toList.foreach(p => androidTypeList(p).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1)))
            }
          }

          case INVOKEINTERFACE(clazz, name, md) => {
            if (theProject.isLibraryType(clazz)) {
              counter += invoke -> (counter.getOrElse(invoke, 0) + 1)
              androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              androidTypeList(md.returnType).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              if (map.contains(name)) counter += map(name) -> (counter.getOrElse(map(name), 0) + 1)
              md.parameterTypes.toList.foreach(p => androidTypeList(p).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1)))
            } else {
              counter += invoke -> (counter.getOrElse(invoke, 0) + 1)
              androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              androidTypeList(md.returnType).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              md.parameterTypes.toList.foreach(p => androidTypeList(p).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1)))
            }
          }

          case INVOKEVIRTUAL(clazz, name, md) => {
            if (clazz.isObjectType && theProject.isLibraryType(clazz.asObjectType)) {
              counter += invoke -> (counter.getOrElse(invoke, 0) + 1)
              androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              androidTypeList(md.returnType).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              if (map.contains(name)) counter += map(name) -> (counter.getOrElse(map(name), 0) + 1)
              md.parameterTypes.toList.foreach(p => androidTypeList(p).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1)))
            } else {
              counter += invoke -> (counter.getOrElse(invoke, 0) + 1)
              androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              androidTypeList(md.returnType).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
              md.parameterTypes.toList.foreach(p => androidTypeList(p).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1)))
            }
          }
          case _ =>
        }

        case (_, NEW(clazz)) => counter += new1 -> (counter.getOrElse(new1, 0) + 1)
          androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))

        case (_, ANEWARRAY(clazz)) => counter += newarray -> (counter.getOrElse(newarray, 0) + 1)
          androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
        case (_, MULTIANEWARRAY(clazz, _)) => counter += newarray -> (counter.getOrElse(newarray, 0) + 1)
          androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
        case (_, NEWARRAY(clazz)) => counter += newarray -> (counter.getOrElse(newarray, 0) + 1)
          androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))

        case (_, CHECKCAST(clazz)) => counter += check -> (counter.getOrElse(check, 0) + 1)
          androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))
        case (_, INSTANCEOF(clazz)) => counter += check -> (counter.getOrElse(check, 0) + 1)
          androidTypeList(clazz).foreach(atl => counter += atl -> (counter.getOrElse(atl, 0) + 1))

        case (_, IF_ACMPEQ(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IF_ACMPNE(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IF_ICMPEQ(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IF_ICMPGE(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IF_ICMPGT(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IF_ICMPLE(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IF_ICMPLT(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IF_ICMPNE(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IFGE(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IFGT(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IFLE(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IFLT(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IFNE(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IFNONNULL(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, IFNULL(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, JSR(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, JSR_W(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, GOTO(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)
        case (_, GOTO_W(_)) => counter += if1 -> (counter.getOrElse(if1, 0) + 1)

        case (_, _: LoadConstantInstruction[_]) => counter += const -> (counter.getOrElse(const, 0) + 1)

        case (_, ci: ComparisonInstruction) => counter += map("cmp") -> (counter.getOrElse(map("cmp"), 0) + 1)

        case (_, sba: StackBasedArithmeticInstruction) => counter += map(sba.operator) -> (counter.getOrElse(map(sba.operator), 0) + 1)

        case (_, _: NumericConversionInstruction) => counter += to -> (counter.getOrElse(to, 0) + 1)

        case (_, ARRAYLENGTH) =>
          counter += arrlength -> (counter.getOrElse(arrlength, 0) + 1)

        case (_, _: ArrayLoadInstruction) => counter += arrayLoad -> (counter.getOrElse(arrayLoad, 0) + 1)
        case (_, _: ArrayStoreInstruction) => counter += arrayStore -> (counter.getOrElse(arrayStore, 0) + 1)
        case (_, _: ReturnInstruction) => counter += return1 -> (counter.getOrElse(return1, 0) + 1)
        case (_, ATHROW) => counter += athrow -> (counter.getOrElse(athrow, 0) + 1)
        case (_, IINC(_, _)) => counter += map("+") -> (counter.getOrElse(map("+"), 0) + 1)
        case (_, LOOKUPSWITCH(_, _)) => counter += switch -> (counter.getOrElse(switch, 0) + 1)
        case (_, TABLESWITCH(_, _, _, _)) => counter += switch -> (counter.getOrElse(switch, 0) + 1)

        case (_, MONITORENTER) => counter += monitor -> (counter.getOrElse(monitor, 0) + 1)
        case (_, MONITOREXIT) => counter += monitor -> (counter.getOrElse(monitor, 0) + 1)

        case (_, _) =>
      }
    }
    counter
  }


  def androidType: Map[Type, List[String]] => Boolean => Type => List[String] = (atl: Map[Type, List[String]]) => (a: Boolean) => (t: Type) =>
    atl.getOrElse(t, if (a) List("non") else List[String]())

}
