name := "opentype.scala.js"
organization := "com.outr"
version := "0.7.3-SNAPSHOT"

scalaVersion := "2.12.3"
crossScalaVersions := List("2.12.3", "2.11.11")
scalacOptions += "-P:scalajs:sjsDefinedByDefault"

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.3"

jsDependencies += ProvidedJS / "opentype.js"
skip in packageJSDependencies := false