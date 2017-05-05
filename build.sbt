name := "opentype.scala.js"
organization := "com.outr"
version := "0.7.1-SNAPSHOT"

scalaVersion := "2.12.2"
crossScalaVersions := List("2.12.2", "2.11.11")

enablePlugins(ScalaJSPlugin)
enablePlugins(BuildInfoPlugin)

buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion)
buildInfoPackage := "opentype"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

crossTarget in fastOptJS := baseDirectory.value / "src" / "main" / "resources" / "app"
crossTarget in fullOptJS := baseDirectory.value / "src" / "main" / "resources" / "app"
