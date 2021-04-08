import Dependencies._

name := "calculator"
scalaVersion := "2.13.5"
version := "0.1.5"
organization := "safe2008"

// configs for sbt-github-packages plugin
githubOwner := "safe2008"
githubRepository := "sbt-github-package-demo"
githubTokenSource := TokenSource.Or(TokenSource.Environment("GITHUB_TOKEN"), TokenSource.GitConfig("github.token"))
publishConfiguration := publishConfiguration.value.withOverwrite(true)
publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)

credentials +=
  Credentials(
    "GitHub Package Registry",
    "maven.pkg.github.com",
    "safe2008",
    sys.env.getOrElse("GITHUB_TOKEN", "N/A")
  )

lazy val root = (project in file("."))
  .settings(
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
