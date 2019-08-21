package classifier

import java.net.URL

import org.opalj.br._
import org.opalj.br.analyses.Project
import org.opalj.br.instructions.{INVOKESTATIC, MethodInvocationInstruction}

object MethodSignatureWrapper {


  def main(args: Array[String]): Unit = {
    var ms = apply("int Mary(int,int,int)")
    println(ms.name)
    ms = apply("int[][] Mary(Olivia,int,int)")
    println(ms.name)
  }

  def apply(returnType: Type, name: String, paramTypes: IndexedSeq[FieldType], isStatic: Boolean): MethodSignatureWrapper = {
    new MethodSignatureWrapper(returnType, name, paramTypes, isStatic)
  }

  def apply(m: org.opalj.br.Method): MethodSignatureWrapper = {
    new MethodSignatureWrapper(m)
  }

  def apply(ii: MethodInvocationInstruction): MethodSignatureWrapper = {
    new MethodSignatureWrapper(ii.methodDescriptor.returnType, ii.name, ii.methodDescriptor.parameterTypes.toIndexedSeq, ii.isInstanceOf[INVOKESTATIC])
  }

  def apply(sig: String): MethodSignatureWrapper = {
    val sig1 = removeModifiers(sig.trim)
    val params = sig1.substring(sig1.indexOf('(') + 1, sig1.indexOf(')')).split(",")
    if (params.isEmpty || (params.size == 1 && params(0).isEmpty)) {
      new MethodSignatureWrapper(applyReturn(sig1.substring(0, sig1.indexOf(' '))),
        sig1.substring(sig1.indexOf(' ') + 1, sig1.indexOf('(')).trim, IndexedSeq.empty[FieldType], sig.contains("static "))
    }
    else
      new MethodSignatureWrapper(applyReturn(sig1.substring(0, sig1.indexOf(' '))),
        sig1.substring(sig1.indexOf(' ') + 1, sig1.indexOf('(')).trim,
        params.map(p => applyParam(p)), sig.contains("static "))
  }

  def removeModifiers(sig: String, rep: String): String = {
    if (sig.startsWith(rep))
      removeModifiers(sig.replace(rep, ""))
    else sig
  }

  def removeModifiers(sig: String): String = {
    var newSig = sig
    newSig = removeModifiers(newSig, "public ")
    newSig = removeModifiers(newSig, "protected ")
    newSig = removeModifiers(newSig, "private ")
    newSig = removeModifiers(newSig, "abstract ")
    newSig = removeModifiers(newSig, "final ")
    newSig = removeModifiers(newSig, "native ")
    newSig = removeModifiers(newSig, "static ")
    newSig = removeModifiers(newSig, "synchronized ")
    newSig = removeModifiers(newSig, "transient ")
    newSig = removeModifiers(newSig, "[SYNTHETIC] ")
    newSig = removeModifiers(newSig, "[BRIDGE] ")
    newSig = removeModifiers(newSig, "[VARARGS] ")
    newSig.trim()
  }


  private def applyParam(ft: String): FieldType = {
    ft match {
      case "byte" ⇒ ByteType
      case "char" ⇒ CharType
      case "double" ⇒ DoubleType
      case "float" ⇒ FloatType
      case "int" ⇒ IntegerType
      case "long" ⇒ LongType
      case "short" ⇒ ShortType
      case "boolean" ⇒ BooleanType
      case _ ⇒ {
        if (ft.contains("[]")) ArrayType(applyParam(ft.substring(0, ft.length - 2)))
        else ObjectType(ft.replace('.', '/'))
      }
    }
  }

  private def applyReturn(ft: String): Type = ft match {
    case "void" => VoidType
    case _ => applyParam(ft)
  }


}

class MethodSignatureWrapper(val returnType: Type, val name: String, val paramTypes: IndexedSeq[FieldType], val isStatic: Boolean) {


  def this(m: org.opalj.br.Method) {
    this(m.returnType, m.name, m.parameterTypes.toIndexedSeq, m.isStatic)
  }

  override def toString: String = (if (isStatic) "static " else "") + returnType.toJava + " " + name + "(" + paramTypes.map(_.toJava).mkString(",") + ")"


  override def equals(obj: Any): Boolean = obj match {
    case i if i == null => false
    case md: MethodSignatureWrapper => md.returnType == returnType && name.equals(md.name) &&
      md.paramTypes.size == paramTypes.size && paramTypes.indices.forall(i => md.paramTypes(i) == paramTypes(i))
    case _ => false
  }

  override def hashCode(): Int = toString.hashCode

  private def isPrimitiveType(t: Type): Boolean =
    !(t.isArrayType || t.isObjectType)

  def similarMethodSignature(ms: MethodSignatureWrapper, theProject: Project[URL], ignoreReturnType: Boolean): Boolean =
    (similarType(returnType, ms.returnType, theProject) || ignoreReturnType) && isStatic == ms.isStatic &&
      paramTypes.size == ms.paramTypes.size && paramTypes.indices.forall(i => similarType(paramTypes(i), ms.paramTypes(i), theProject))

  def similarMethodSignature(ms: MethodSignatureWrapper, theProject: Project[URL]): Boolean = isStatic == ms.isStatic && similarType(returnType, ms.returnType, theProject) &&
    paramTypes.size == ms.paramTypes.size && paramTypes.indices.forall(i => similarType(paramTypes(i), ms.paramTypes(i), theProject))

  private def similarType(f: Type, s: Type, theProject: Project[URL]): Boolean =
    if (isPrimitiveType(f) && isPrimitiveType(s)) f == s
    else if (f.isArrayType && s.isArrayType) similarType(f.asArrayType.componentType, s.asArrayType.componentType, theProject)
    else if (f.isObjectType && s.isObjectType && (isLibraryType(f.asObjectType, theProject) || isLibraryType(s.asObjectType, theProject)))
      f.asObjectType.fqn.equals(s.asObjectType.fqn)
    else f.isObjectType && s.isObjectType

  private def isLibraryType(objectType: ObjectType, theProject: Project[URL]): Boolean =
    objectType.fqn.equals("java/lang/Object") || theProject.allLibraryClassFiles.exists(cf => cf.fqn.equals(objectType.fqn))


  def compareTo(obj: Any, theProject: Project[URL]): Double = {
    obj match {
      case ms: MethodSignatureWrapper if ms == null || paramTypes.size != ms.paramTypes.size || !similarType(returnType, ms.returnType, theProject) =>
      case ms: MethodSignatureWrapper => if (paramTypes.indices.forall(i => similarType(paramTypes(i), ms.paramTypes(i), theProject))) return 1.0
      else return ((if (similarType(returnType, ms.returnType, theProject)) 1.0 else 0.0) + (if (ms.name.equals(name)) 1.0 else 0.0) + paramTypes.indices.map(i => if (similarType(paramTypes(i), ms.paramTypes(i), theProject)) 1.0 else 0.0).sum) / (paramTypes.size + 2.0).toDouble
      case _ =>
    }
    0.0
  }
}
