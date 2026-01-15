import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    `java-library`
    jacoco
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(
            org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_25
        )

        freeCompilerArgs.addAll(
            "-Xjvm-enable-preview",
            "-Xjsr305=strict"
        )
    }
}

tasks.test {
    jvmArgs("--enable-preview")
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
        showStandardStreams = false
    }
    finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required = true
        html.required = true
    }
}

dependencies {
    testImplementation(Libs.junitJupiter)
    testImplementation(Libs.assertj)
    testImplementation(Libs.mockito)
}