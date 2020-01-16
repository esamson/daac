ThisBuild / organization := "ph.samson.japper"
ThisBuild / scalaVersion := "2.13.1"

ThisBuild / licenses := Seq(
  "GPL-3.0-only" -> url("https://spdx.org/licenses/GPL-3.0-only.html")
)
ThisBuild / homepage := Some(url("https://github.com/esamson/daac"))
ThisBuild / developers := List(
  Developer(
    id = "esamson",
    name = "Edward Samson",
    email = "edward@samson.ph",
    url = url("https://edward.samson.ph")
  )
)
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/esamson/daac"),
    "scm:git:git@github.com:esamson/daac.git"
  )
)

ThisBuild / dynverSonatypeSnapshots := true

name := "daac"

libraryDependencies ++= Seq(
  "org.scalaj" %% "scalaj-http" % "2.4.2"
)
