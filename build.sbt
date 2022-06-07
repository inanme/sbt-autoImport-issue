
import _root_.io.gatling.sbt.GatlingPlugin.autoImport.{assembly => _, _}

val autoImportIssue = project
    .in(file("."))
    .enablePlugins(GatlingPlugin)
    .settings(assembly / mainClass := None)