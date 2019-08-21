package classifier

import java.net.URL

import extract.methods.lib.detect.StructurePreservingRep
import org.apache.commons.math3.stat.correlation.SpearmansCorrelation
import org.opalj.br.Method
import org.opalj.br.analyses.Project

import scala.io.Source

object MethodClassifier {

  val equal = false

  val spearmansCorrelation = new SpearmansCorrelation()


  val encMethods: List[Array[Double]] = Source.fromFile("EncMapping1.csv").getLines().map(l => l.split(";").map(v => v.toDouble) ++ (if (equal) List(0.0) else List[Double]())).toList


  def classify(method: Method, project: Project[URL]): Boolean = {
    if (method.body.isEmpty) return false
    val nlrArr = StructurePreservingRep.extractNLR(method, project, equal).toList.sortBy(f => f._1).map(f => f._2.toDouble).toArray
    for (encMethod <- encMethods) {
      if (correlation(encMethod, nlrArr) >= 0.85)
        return true
    }
    false
  }

  def correlation(xArray: Array[Double], yArray: Array[Double]): Double = spearmansCorrelation.correlation(xArray, yArray)

}
