import NativePackagerKeys._

name := "scala-spray-heroku"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.6"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.6"
  val sprayV = "1.3.2"
  Seq(
    "io.spray" %% "spray-can" % sprayV,
    "io.spray" %% "spray-routing" % sprayV,
    "io.spray" %% "spray-testkit" % sprayV % "test",
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-testkit" % akkaV % "test",
    "com.typesafe" % "config" % "1.2.1",
    "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
  )
}

Revolver.settings

packageArchetype.java_application
