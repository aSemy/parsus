package buildsrc.conventions

import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_1_7
import org.jetbrains.kotlin.gradle.targets.jvm.KotlinJvmTarget

/** Base configuration for all Kotlin/Multiplatform projects */

plugins {
    kotlin("multiplatform")
}

kotlin {
    jvmToolchain(8)

    @OptIn(ExperimentalKotlinGradlePluginApi::class)
    compilerOptions {
        apiVersion = KOTLIN_1_7
        languageVersion = KOTLIN_1_7
    }

    // configure all Kotlin/JVM Tests to use JUnitPlatform
    targets.withType<KotlinJvmTarget>().configureEach {
        testRuns.configureEach {
            executionTask.configure {
                useJUnitPlatform()
            }
        }
    }
}
