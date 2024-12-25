import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    val kotlin = "2.1.0"

    kotlin("jvm") version kotlin
}

repositories {
    mavenCentral()
}

group = "ru.jetlabs"

kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_21)
    }
}