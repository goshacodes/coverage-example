val scala3Version = "3.3.4"
val scala2Version = "2.13.15"

lazy val root = (project in file("."))
  .settings(
    scalaVersion := scala3Version,
    crossScalaVersions := Seq(scala2Version, scala3Version),
    name := "coverage-example",
    libraryDependencies ++= Seq(
      "com.softwaremill.sttp.tapir" %% "tapir-server" % "1.11.5",
      "org.scalameta" %% "munit" % "1.0.0" % Test
    ),
  )
