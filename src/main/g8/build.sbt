name := "$name$"

version := "0.1-SNAPSHOT"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "org.scalacheck" %% "scalacheck" % "1.14.0" % "test",
  "org.slf4j" % "slf4j-api" % "1.7.28",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
)

javacOptions += "-Xlint:deprecation"

scalacOptions += "-deprecation"

