// buildSrc/build.gradle.kts
plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    // Kotlin plugin (REQUIRED for kotlin("jvm") in precompiled plugins)
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.3.0")

    // 👇 ЭТИ версии будут использоваться в precompiled plugins
    implementation("org.springframework.boot:spring-boot-gradle-plugin:4.0.1")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.7")
}