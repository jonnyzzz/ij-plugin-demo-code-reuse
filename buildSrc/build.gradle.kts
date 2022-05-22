plugins {
  `kotlin-dsl`
}

repositories {
  mavenCentral()
  gradlePluginPortal()
}

dependencies {
  fun pluginDependency(id: String, version: String) {
    implementation("$id:$id.gradle.plugin:$version")
  }

  pluginDependency("org.jetbrains.kotlin.jvm", "1.6.20")
  pluginDependency("org.jetbrains.intellij", "1.5.2")
}

