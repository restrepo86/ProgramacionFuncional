name := "Calculadora"

version := "0.1"

scalaVersion := "2.12.4"


resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.3")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.3" % Test,
  "org.typelevel" %% "cats-free" %  "1.0.1"
)
