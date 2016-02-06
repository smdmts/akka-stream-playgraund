name := "scalaz-playground"
scalaVersion := "2.11.7"

version := "0.1.0 "

val akkaVersion = "2.4.2-RC1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "com.typesafe.akka" %% "akka-agent" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream-experimental" % "2.0.3",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.2",
  "net.databinder.dispatch" %% "dispatch-json4s-native" % "0.11.2",
  "com.google.protobuf" % "protobuf-java" % "2.6.1",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.4.2",
  "org.scalaz" %% "scalaz-core" % "7.2.0"
)

initialCommands in console := "import scalaz._; import Scalaz._; import akka.actor.ActorSystem ; import akka.stream.scaladsl._ ; import akka.stream._"
