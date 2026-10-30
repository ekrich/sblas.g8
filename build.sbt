// Widen scalafmt's reach to the g8 template sources, which otherwise
// aren't picked up as sbt sources (and are never compiled from here).
Compile / unmanagedSourceDirectories += baseDirectory.value / "src" / "main" / "g8"
Compile / unmanagedSources / includeFilter := ("*.scala" | "*.sbt")
