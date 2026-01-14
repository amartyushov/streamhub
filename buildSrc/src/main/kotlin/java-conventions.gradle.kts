plugins {
    java
    jacoco
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

tasks.withType<JavaCompile> {
    options.compilerArgs.addAll(listOf(
        "--enable-preview",
        "-Xlint:preview",
        "-Xlint:unchecked",
        "-parameters"
    ))
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