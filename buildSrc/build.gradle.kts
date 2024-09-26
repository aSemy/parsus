plugins {
    `kotlin-dsl`
}

dependencies {
    val kotlinVer = "2.0.20"
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVer")
    implementation("org.jetbrains.kotlin:kotlin-allopen:$kotlinVer")
    implementation("org.jetbrains.kotlinx:kotlinx-benchmark-plugin:0.4.8")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:1.9.20")
}
