lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8"
    )),
    name := "$name$"
  )
libraryDependencies += "org.scalastic" % "scalastic_2.10" % "0.90.10.1"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.1"
