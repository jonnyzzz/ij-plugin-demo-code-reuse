plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm") version "1.6.20"
  id("org.jetbrains.intellij") version "1.5.2"
}

group = "com.example"
version = "1.0-SNAPSHOT"

apply(plugin = "plugin-include.build")

intellij {

}