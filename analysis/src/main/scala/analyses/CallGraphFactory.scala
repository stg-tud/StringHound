package analyses

import java.net.URL
import java.util.concurrent.ConcurrentHashMap

import org.opalj.br.analyses.{DeclaredMethods, DeclaredMethodsKey, Project}
import org.opalj.br.fpcf.cg.properties._
import org.opalj.br.fpcf.{FPCFAnalysesManagerKey, FPCFAnalysis, PropertyStoreKey}
import org.opalj.br.instructions.{INVOKEINTERFACE, INVOKESPECIAL, INVOKESTATIC, INVOKEVIRTUAL, Instruction, MethodInvocationInstruction}
import org.opalj.br.{DeclaredMethod, Method}
import org.opalj.collection.immutable.Chain
import org.opalj.fpcf.ComputationSpecification
import org.opalj.tac.fpcf.analyses.cg._
import org.opalj.tac.fpcf.analyses.cg.reflection.TriggeredReflectionRelatedCallsAnalysis
import org.opalj.tac.fpcf.analyses.{LazyTACAIProvider, TriggeredSystemPropertiesAnalysis}

object CallGraphFactory {

  def createOPALCallGraph: Project[URL] => Method => scala.TraversableOnce[scala.Tuple2[DeclaredMethod, scala.Int]] = (project: Project[URL]) => {
    var declaredMethods = project.get(DeclaredMethodsKey)
    val allMethods = declaredMethods.declaredMethods.filter { dm ⇒
      dm.hasSingleDefinedMethod &&
        dm.definedMethod.body.isDefined &&
        dm.definedMethod.body.get.pcOfPreviousInstruction(dm.definedMethod.body.get.instructions.length) < 0xFFFF &&
        (dm.definedMethod.classFile.thisType eq dm.declaringClassType)
    }.toTraversable

    val ps = project.get(PropertyStoreKey)

    val calleesAnalysis = LazyCalleesAnalysis(
      Set(
        StandardInvokeCallees,
        SerializationRelatedCallees,
        ReflectionRelatedCallees,
        ThreadRelatedIncompleteCallSites
      )
    )

    project.get(FPCFAnalysesManagerKey).runAll(
      List(
        LazyTACAIProvider,
        RTACallGraphAnalysisScheduler,
        TriggeredStaticInitializerAnalysis,
        TriggeredLoadedClassesAnalysis,
        TriggeredFinalizerAnalysisScheduler,
        TriggeredThreadRelatedCallsAnalysis,
        TriggeredSerializationRelatedCallsAnalysis,
        TriggeredReflectionRelatedCallsAnalysis,
        TriggeredInstantiatedTypesAnalysis,
        TriggeredConfiguredNativeMethodsAnalysis,
        TriggeredSystemPropertiesAnalysis,
        EagerLibraryEntryPointsAnalysis,
        calleesAnalysis
      ),
      { css: Chain[ComputationSpecification[FPCFAnalysis]] ⇒
        if (css.contains(calleesAnalysis)) {
          allMethods.foreach { dm ⇒ ps.force(dm, Callees.key) }
        }
      }
    )
    getCallers(ps)(declaredMethods)
  }


  def createCHACallGraph(project: Project[URL]): Map[Method, collection.Set[Method]] = {
    import scala.collection._
    import scala.collection.convert.decorateAsScala._
    import java.util.concurrent.ConcurrentHashMap
    val callees: concurrent.Map[Method, Set[Method]] = new ConcurrentHashMap[Method, Set[Method]]().asScala
    project.allMethodsWithBody.par.foreach { m =>
      callees.put(m, m.body.get.instructions.flatMap {
        case is: INVOKESPECIAL =>
          try {
            val res = project.specialCall(m.classFile.thisType, is.declaringClass, is.isInterface, is.name, is.methodDescriptor)
            if (res.hasValue)
              Set(res.value)
            else Set.empty[Method]
          } catch {
            case _: Throwable => Set.empty[Method]
          }
        case is: INVOKESTATIC =>
          try {
            val res = project.staticCall(is)
            if (res.hasValue)
              Set(res.value)
            else Set.empty[Method]
          }
          catch {
            case _: Throwable => Set.empty[Method]
          }
        case iv: INVOKEVIRTUAL if iv.declaringClass.isObjectType =>
          try {
            project.virtualCall(m.classFile.thisType.packageName, iv)
          } catch {
            case _: Throwable => Set.empty[Method]
          }
        case ii: INVOKEINTERFACE =>
          try {
            project.interfaceCall(ii)
          } catch {
            case _: Throwable => Set.empty[Method]
          }
        case _ => Set.empty[Method]
      }.toSet
      )
    }

    var callers = Map.empty[Method, Set[Method]]
    for (entry <- callees) {
      for (callee <- entry._2.filter(m => !project.isLibraryType(m.classFile))) {
        var set = Set.empty[Method]
        if (callers.contains(callee)) {
          set = callers(callee)
        }
        set += entry._1
        callers += callee -> set
      }
    }
    callers
  }


  def getCallers: org.opalj.fpcf.PropertyStore => DeclaredMethods => Method => scala.TraversableOnce[scala.Tuple2[DeclaredMethod, scala.Int]] =
    (ps: org.opalj.fpcf.PropertyStore) => (declaredMethods: DeclaredMethods) => (m: Method) => ps(declaredMethods.apply(m), CallersProperty.key).ub.callers(declaredMethods)


}
