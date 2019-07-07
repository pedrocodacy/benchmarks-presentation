import sbt.Keys._
import sbt._
import pl.project13.scala.sbt.JmhPlugin

lazy val core = (project in file("core"))
  .settings(
    name := "core",
    scalaVersion := "2.11.8"
  )

lazy val benchmarks = (project in file("benchmarks"))
  .settings(
    name := "benchmarks",
    scalaVersion := "2.11.8"
  )
  .dependsOn(core)
  .enablePlugins(JmhPlugin)


lazy val root = (project in file("."))
  .aggregate(core, benchmarks)