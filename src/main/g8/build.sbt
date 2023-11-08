val slf4j = "org.slf4j" % "slf4j-api" % "2.0.9"
val logback = "ch.qos.logback" % "logback-classic" % "1.3.11"
val scalatest = "org.scalatest" %% "scalatest" % "3.2.17" % "test"
val scalatestplus = "org.scalatestplus" %% "scalacheck-1-17" % "3.2.17.0" % "test"

ThisBuild / scalaVersion := "3.3.1"
ThisBuild / version := "0.1-SNAPSHOT"
ThisBuild / javacOptions += "-Xlint:deprecation"
ThisBuild / scalacOptions += "-deprecation"

lazy val root = (project in file("."))
    .settings(
        name := "$name$",
        libraryDependencies ++= Seq(
            logback,
            slf4j,
            scalatest,
            scalatestplus
        )
    )


