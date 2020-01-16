ThisBuild / organization := "ph.samson.daac"
ThisBuild / scalaVersion := "2.13.1"

ThisBuild / licenses := Seq(
  "GPL-3.0-only" -> url("https://spdx.org/licenses/GPL-3.0-only.html")
)
headerLicense := Some(
  HeaderLicense.Custom(
    s"""|Copyright (C) 2020  Edward Samson
        |
        |This program is free software: you can redistribute it and/or modify
        |it under the terms of the GNU General Public License as published by
        |the Free Software Foundation, version 3.
        |
        |This program is distributed in the hope that it will be useful,
        |but WITHOUT ANY WARRANTY; without even the implied warranty of
        |MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        |GNU General Public License for more details.
        |
        |You should have received a copy of the GNU General Public License
        |along with this program.  If not, see <http://www.gnu.org/licenses/>.
        |""".stripMargin
  )
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
