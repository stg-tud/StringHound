

name := "deobfuscator"

version := "1.0"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-lang3" % "3.7",
  "org.apache.commons" % "commons-text" % "1.3",
  "org.slf4j" % "slf4j-simple" % "1.7.25",
  "org.apache.commons" % "commons-lang3" % "3.7",
  "net.sf.extjwnl" % "extjwnl" % "1.9.4",
  "net.sf.extjwnl" % "extjwnl-data-wn31" % "1.2"
)
unmanagedClasspath in Runtime += baseDirectory.value / "resources"


mainClass := Some("main.StringDecryption")

libraryDependencies ++= Dependencies.common(scalaVersion.value)
libraryDependencies ++= Dependencies.br
libraryDependencies ++= Dependencies.bi
libraryDependencies ++= Dependencies.testlibs



assemblyMergeStrategy in assembly := {
  case x if Assembly.isConfigFile(x) =>
    MergeStrategy.concat
  case PathList(ps @ _*) if Assembly.isReadme(ps.last) || Assembly.isLicenseFile(ps.last) =>
    MergeStrategy.rename
  case PathList("META-INF", xs @ _*) =>
    (xs map {_.toLowerCase}) match {
      case ("manifest.mf" :: Nil) | ("index.list" :: Nil) | ("dependencies" :: Nil) =>
        MergeStrategy.discard
      case ps @ (x :: xs) if ps.last.endsWith(".sf") || ps.last.endsWith(".dsa") =>
        MergeStrategy.discard
      case "plexus" :: xs =>
        MergeStrategy.discard
      case "services" :: xs =>
        MergeStrategy.filterDistinctLines
      case ("spring.schemas" :: Nil) | ("spring.handlers" :: Nil) =>
        MergeStrategy.filterDistinctLines
      case _ => MergeStrategy.last
    }
  case _ => MergeStrategy.last
}