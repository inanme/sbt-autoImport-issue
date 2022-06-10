
import _root_.sbtassembly.AssemblyPlugin.autoImport.assembly

val autoImportIssue = project
    .in(file("."))
    .enablePlugins(GatlingPlugin)
    .settings(assembly / mainClass := None)