plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm") version "1.6.20"
  id("org.jetbrains.intellij") version "1.5.2"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

intellij {
  version.set("2021.2")
  type.set("IC") // Target IDE Platform
  plugins.set(listOf(/* Plugin Dependencies */))
}

tasks.withType<JavaCompile> {
  sourceCompatibility = "11"
  targetCompatibility = "11"
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
  kotlinOptions.jvmTarget = "11"
}
