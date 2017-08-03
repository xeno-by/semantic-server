lazy val app = project.in(file("app")).settings(
  scalaVersion := "2.11.11",
  libraryDependencies += "org.scalameta" %% "scalameta" % "2.0.0-M1"
)
