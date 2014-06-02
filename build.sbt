name := "lamma"

version := "1.0"

scalaVersion := "2.10.4"

crossScalaVersions := Seq("2.10.4", "2.11.1")

libraryDependencies += "junit" % "junit" % "4.11" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.6" % "test"

// ============ publish to public maven repos ================

publishMavenStyle := true

publishArtifact in Test := false

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomIncludeRepository := { _ => false }

licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("https://github.com/maxcellent/lamma"))

pomExtra := (
  <scm>
    <url>git://github.com/maxcellent/lamma.git</url>
    <connection>scm:git://github.com/maxcellent/lamma.git</connection>
  </scm>
    <developers>
      <developer>
        <id>maxcellent</id>
        <name>Max Zhu</name>
        <url>http://lamma.io</url>
      </developer>
    </developers>
  )