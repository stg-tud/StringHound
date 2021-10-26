package classifier

import java.io.{File, FileReader}
import java.util.Properties

import org.opalj.br.Type
import org.opalj.br.analyses.SomeProject

object  Utils {

  var libraries: Set[Type] = _

  def resetLibraries(project: SomeProject): Unit = libraries = project.allClassFiles.filter(cf => !project.allProjectClassFiles.contains(cf)).map(cf => cf.thisType).toSet

  def isLibraryType(o: Type): Boolean = {
    libraries.contains(o)
  }  
}
