plugins {
    buildsrc.conventions.`kotlin-multiplatform-base`
}

kotlin {
    jvm()

    js(IR) {
        browser()
        nodejs()
    }

    linuxX64()
    macosX64()
    macosArm64()
    mingwX64()

    sourceSets {
        commonMain {
            dependencies {
                implementation(projects.parsus)
            }
        }

        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

repositories {
    mavenCentral()
}
