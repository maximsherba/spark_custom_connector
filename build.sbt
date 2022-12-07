name := "spark_custom_connector"

version := "0.1"

scalaVersion := "2.12.13"

val testcontainersScalaVersion = "0.38.8"

//scalacOptions ++= Seq("-unchecked","-Xmax-classfile-name","128")
//scalacOptions in Compile ++= Seq("-Xmax-classfile-name", "128")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "3.0.1",
  "org.postgresql" % "postgresql" % "42.2.18",

  "org.scalatest" %% "scalatest" % "3.2.2" % "test",
  "com.dimafeng" %% "testcontainers-scala-scalatest" % testcontainersScalaVersion % "test",
  "com.dimafeng" %% "testcontainers-scala-postgresql" % testcontainersScalaVersion % "test",
)

Test / fork := true
