import sbt.protocol.testing.TestResult

ThisBuild / scalaVersion := "3.9.0"

// sbt 2's scripted task reads this key, but sbt-giter8 does not enable ScriptedPlugin's global settings.
scriptedKeepTempDirectory := false

// Run the giter8 scripted test as part of `test`, so plain `sbt test` works.
Test / test := {
  val _ = (Test / g8Test).toTask("").value
  TestResult.Passed
}

// Reach the g8 template sources too, not just sbt's Compile/Test dirs.
addCommandAlias("scalafmtAll", "scalafmtRepo")
addCommandAlias("scalafmtCheckAll", "scalafmtCheckRepo")
