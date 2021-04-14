scalaVersion := "2.13.5"

libraryDependencies += "org.ekrich" %%% "sblas" % "0.3.0"

// Set to Info, Debug (Info is default)
logLevel := Level.Info

// Set to debug, release (debug is default)
nativeMode := "debug"

// Set to false (default) or remove if you want to show stubs as linking errors
nativeLinkStubs := true

enablePlugins(ScalaNativePlugin)
