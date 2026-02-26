val slf4j = "org.slf4j" % "slf4j-api" % "2.0.17"
val logback = "ch.qos.logback" % "logback-classic" % "1.5.32"
val scalatest = "org.scalatest" %% "scalatest" % "3.2.19" % "test"
val scalatestplus = "org.scalatestplus" %% "scalacheck-1-19" % "3.2.19.0" % "test"

ThisBuild / scalaVersion := "3.3.7"
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
