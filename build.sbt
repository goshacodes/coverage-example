
val scala3Version = "3.3.4"
val scala2Version = "2.13.15"

val root = (project in file("."))
  .settings(
    name := "coverage-example",
    scalaVersion := scala3Version,
    crossScalaVersions := List(scala2Version, scala3Version),
    libraryDependencies ++= Seq(
      "com.softwaremill.sttp.tapir" %% "tapir-server" % "1.10.15",
      "org.scalameta" %% "munit" % "1.0.0" % Test,
    )
  )