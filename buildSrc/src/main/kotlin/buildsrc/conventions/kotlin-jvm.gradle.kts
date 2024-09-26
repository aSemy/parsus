package buildsrc.conventions

import org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_1_7
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

kotlin {
    jvmToolchain(8)
    compilerOptions {
        languageVersion = KOTLIN_1_7
        apiVersion = KOTLIN_1_7
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
