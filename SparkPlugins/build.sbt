name := "spark-plugins"

version := "0.2-SNAPSHOT"
isSnapshot := true

scalaVersion := "2.12.15"

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

libraryDependencies += "io.dropwizard.metrics" % "metrics-core" % "4.2.0"
libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "3.3.1"
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.2.0"

// publishing to Sonatype Nexus repository and Maven
publishMavenStyle := true

organization := "ch.cern.sparkmeasure"
description := "SparkPlugins provides code and examples of Apache Spark Plugin extensions to the metrics system applied to measuring I/O from cloud Filesystems, OS/system metrics and custom metrics."
developers := List(Developer(
  "LucaCanali", "Luca Canali", "Luca.Canali@cern.ch",
  url("https://github.com/LucaCanali")
))
homepage := Some(url("https://github.com/cerndb/SparkPlugins"))

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)

scmInfo := Some(
  ScmInfo(
    url("https://github.com/cerndb/SparkPlugins"),
    "scm:git@github.com:cerndb/SparkPlugins.git"
  )
)
