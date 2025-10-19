import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.21" apply false
    id("org.springframework.boot") version "3.3.0" apply false
    id("io.spring.dependency-management") version "1.1.0" apply false
    id("com.diffplug.spotless") version "6.20.0"
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "com.diffplug.spotless")

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "21"
        kotlinOptions.freeCompilerArgs += listOf("-Xjvm-default=all")
    }

    spotless {
        kotlin {
            ktlint()
            trimTrailingWhitespace()
            endWithNewline()
        }
    }
}
