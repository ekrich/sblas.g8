ThisBuild / scalaVersion := "3.9.0"

libraryDependencies += "org.ekrich" %% "sblas" % "0.8.0"

// Set to Info, Debug (Info is default)
logLevel := Level.Info

enablePlugins(ScalaNativePlugin)

nativeConfig ~= { nc =>
  import scala.util.Properties
  // cblas via Accelerate on macOS, openblas everywhere else
  val linkingFlags = if (Properties.isMac) "-lcblas" else "-lopenblas"
  nc.withLinkingOptions(nc.linkingOptions :+ linkingFlags)
}
