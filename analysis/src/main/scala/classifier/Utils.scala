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

  def enjarify(apkPath: String): File = {
    val file = File.createTempFile("myJar", ".jar")
    (getConfigValue("ENJARIFY_EXEC_CMD") + " -f " + apkPath + " -o " + file.getAbsolutePath).!!
    file
  }

  private val props = new Properties()

  def getConfigValue(value: String): String = {
    if (props.isEmpty) {
      props.load(new FileReader("config.txt"))
    }
    props.getProperty(value)
  }
  
}