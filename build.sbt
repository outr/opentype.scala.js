name := "opentype.scala.js"
organization := "com.outr"
version := "0.7.1_1"

scalaVersion := "2.12.2"
crossScalaVersions := List("2.12.2", "2.11.11")

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

jsDependencies += ProvidedJS / "opentype.js"
skip in packageJSDependencies := false