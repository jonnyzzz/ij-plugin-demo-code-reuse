plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm")
  id("org.jetbrains.intellij")
}

group = "com.example"
version = "1.0-SNAPSHOT"

apply(plugin = "plugin-include.build")

intellij {

}