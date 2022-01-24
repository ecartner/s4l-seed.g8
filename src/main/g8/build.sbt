val slf4j = "org.slf4j" % "slf4j-api" % "1.7.33"
val logback = "ch.qos.logback" % "logback-classic" % "1.2.10"
val scalatest = "org.scalatest" %% "scalatest" % "3.2.10" % "test"
val scalatestplus = "org.scalatestplus" %% "scalacheck-1-15" % "3.2.9.0" % "test"

ThisBuild / scalaVersion := "3.1.0"
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


