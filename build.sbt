lazy val app = project.in(file("app")).settings(
  scalaVersion := "2.11.11",
  resolvers += Resolver.bintrayRepo("scalameta", "maven"),
  libraryDependencies += "org.scalameta" %% "scalameta" % "1.9.0-767-33c47b6f"
)
