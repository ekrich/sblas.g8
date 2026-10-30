import sbt.protocol.testing.TestResult

ThisBuild / scalaVersion := "3.9.0"

// sbt 2's scripted task reads this key, but sbt-giter8 does not enable ScriptedPlugin's global settings.
scriptedKeepTempDirectory := false

// Run the giter8 scripted test as part of `test`, so plain `sbt test` works.
Test / test := {
  val _ = (Test / g8Test).toTask("").value
  TestResult.Passed
}

// Widen scalafmt's reach to the g8 template sources, which otherwise
// aren't picked up as sbt sources (and are never compiled from here).
Compile / unmanagedSourceDirectories += baseDirectory.value / "src" / "main" / "g8"
Compile / unmanagedSources / includeFilter := ("*.scala" | "*.sbt")
