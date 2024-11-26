import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.jvm)
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