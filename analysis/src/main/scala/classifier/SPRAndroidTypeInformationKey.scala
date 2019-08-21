package classifier

import org.opalj.br._
import org.opalj.br.analyses.{ProjectInformationKey, SomeProject}
import org.opalj.de.{DependencyProcessor, DependencyType, DependencyTypes}

import scala.collection.mutable
import scala.io.Source

object SPRAndroidTypeInformationKey extends ProjectInformationKey[SPRAndroidTypeInformation, Nothing] {

  val map: Map[String, String] = Source.fromFile("EncryptionItems.txt").getLines().map(l => l.split(";").head -> l.split(";")(1)).toMap

  override protected def requirements: Seq[ProjectInformationKey[_ <: AnyRef, Nothing]] = Nil

  override protected def compute(project: SomeProject): SPRAndroidTypeInformation = {
    Utils.resetLibraries(project)
    val superTypes = mutable.HashMap.empty[ObjectType, Set[ObjectType]]
    val resultMap = mutable.HashMap.empty[Type, List[String]]
    var arraySet = Set.empty[ArrayType]
    var allTypes = Set.empty[Type]
    val dependencyExtractor = new DependencyExtractor(new DependencyProcessor {

      override def processDependency(source: VirtualSourceElement, target: VirtualSourceElement, dType: DependencyType): Unit = {
        if ((DependencyTypes.EXTENDS == dType || DependencyTypes.IMPLEMENTS == dType) &&
          source.classType != target.classType && target.classType.isObjectType) {
          val sourceObject = source.classType.asObjectType
          val targetObject = target.classType.asObjectType
          val superTypeSet = superTypes.getOrElse(sourceObject, Set()) ++ Set(targetObject)
          superTypes += sourceObject -> superTypeSet
        } else {
          if (source.classType.isObjectType && Utils.isLibraryType(source.classType.asObjectType))
            resultMap += source.classType.asObjectType -> List(getHash(source.classType.asObjectType, project))
          else {
            allTypes += source.classType
          }
          if (target.classType.isObjectType && Utils.isLibraryType(target.classType.asObjectType))
            resultMap += target.classType.asObjectType -> List(getHash(target.classType.asObjectType, project))
          else allTypes += target.classType

        }
      }


      override def processDependency(source: VirtualSourceElement, arrayType: ArrayType, dType: DependencyType): Unit = {
        arraySet += arrayType
      }

      override def processDependency(source: VirtualSourceElement, baseType: BaseType, dType: DependencyType): Unit = {
        resultMap += baseType -> List(getHash(baseType, project))
      }
    })
    project.allProjectClassFiles.foreach(c => dependencyExtractor.process(c))


    resultMap += VoidType -> List(getHash(VoidType, project))
    resultMap ++= superTypes.map(s => s._1 -> s._2.flatMap(o => if (Utils.isLibraryType(o))
      List(getHash(o, project)) else
      getTypeRep(o, superTypes.toMap, project, mutable.Set.empty[String])).toList)
    resultMap ++= arraySet.map(a => a -> getArrayRep(a, resultMap, project))
    allTypes.foreach { t =>
      if (!resultMap.contains(t)) {
        if (t.isBaseType) resultMap += t -> List(getHash(t, project))
        else resultMap += t -> List(getHash(t, project))
      }
    }

    new SPRAndroidTypeInformation(resultMap.toMap, map)
  }

  def getArrayRep(t: Type, resultsMap: mutable.HashMap[Type, List[String]], project: SomeProject): List[String] = {
    if (!t.isArrayType) resultsMap.getOrElse(t, List(getHash(t, project)))
    else
      getArrayRep(t.asArrayType.elementType, resultsMap, project)
  }

  def getHash(t: Type, project: SomeProject): String = t match {
    case a: FieldType if a.isArrayType && map.contains(a.asArrayType.elementType.toJava.replace(".", "/")) => map(a.asArrayType.elementType.toJava.replace(".", "/"))
    case a: FieldType if a.isArrayType && map.contains(a.asArrayType.elementType.toJava.replace(".", "/")) => map(a.asArrayType.elementType.toJava.replace(".", "/"))
    case a: FieldType if a.isArrayType && !map.contains(a.asArrayType.elementType.toJava.replace(".", "/")) &&
      a.asArrayType.elementType.isObjectType && project.isLibraryType(a.asArrayType.elementType.asObjectType) => "non"
    case a: FieldType if !a.isArrayType && map.contains(a.toJava.replace(".", "/")) => map(a.toJava.replace(".", "/"))
    case a: FieldType if !a.isArrayType && !map.contains(a.toJava.replace(".", "/")) => "non"
    case v: VoidType => map(v.toJava)
    case o: ObjectType if map.contains(o.fqn) => map(o.fqn)
    case o: ObjectType if !map.contains(o.fqn) && project.isLibraryType(o) => "non"
    case o: BaseType if map.contains(o.toJava.replace(".", "/")) => map(o.toJava.replace(".", "/"))
    case o: BaseType if !map.contains(o.toJava.replace(".", "/")) => "non"
    case _ => map("java/lang/Object")
  }


  def getTypeRep(t: ObjectType, superTypes: Map[ObjectType, Set[ObjectType]], project: SomeProject, accu: mutable.Set[String]): Set[String] = {
    if (Utils.isLibraryType(t)) (accu + getHash(t, project)).toSet
    else if (t == ObjectType.Object || !superTypes.contains(t)) (accu + getHash(ObjectType.Object, project)).toSet
    else {
      accu ++= superTypes(t).flatMap(o =>
        getTypeRep(o, superTypes, project, accu)
      )
      accu.toSet
    }
  }


}

class SPRAndroidTypeInformation(val androidTypeList: Map[Type, List[String]], val keyMap: Map[String, String]) {
}

