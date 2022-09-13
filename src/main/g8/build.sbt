val slf4j = "org.slf4j" % "slf4j-api" % "2.0.0"
val logback = "ch.qos.logback" % "logback-classic" % "1.3.0"
val scalatest = "org.scalatest" %% "scalatest" % "3.2.13" % "test"
val scalatestplus = "org.scalatestplus" %% "scalacheck-1-16" % "3.2.12.0" % "test"

ThisBuild / scalaVersion := "3.2.0"
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


