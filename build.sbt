name := """biodiversidadebean"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  jdbc,
  cache,
  javaWs,
  javaCore,
  filters,
  
  "org.postgresql" % "postgresql" % "9.4-1206-jdbc42",
  "org.webjars"     % "jquery"      % "2.1.1",
  "org.webjars"     % "bootstrap"   % "3.3.1",
  "org.easytesting" % "fest-assert" % "1.4" % Test,
  "junit"           % "junit"       % "4.12" % Test
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v", "-q")

routesGenerator := InjectedRoutesGenerator

libraryDependencies += javaJdbc
lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

fork in run := true