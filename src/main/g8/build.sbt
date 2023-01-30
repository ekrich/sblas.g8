scalaVersion := "2.13.8"

libraryDependencies += "org.ekrich" %%% "sblas" % "0.5.0"

// Set to Info, Debug (Info is default)
logLevel := Level.Info

enablePlugins(ScalaNativePlugin)
