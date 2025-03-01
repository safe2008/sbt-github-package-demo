import Dependencies._

name := "calculator"
scalaVersion := "2.13.3"
version := "0.1.5"
organization := "safe2008"

// configs for sbt-github-packages plugin
githubOwner := "safe2008"
githubRepository := "sbt-github-package-demo"
githubTokenSource :=TokenSource.Environment("GITHUB_TOKEN")
// githubTokenSource := TokenSource.GitConfig("github.token")

lazy val root = (project in file("."))
  .settings(
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
