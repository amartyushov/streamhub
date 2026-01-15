plugins {
    id("kotlin-conventions")
    id("org.springframework.boot")         // ← Версия из buildSrc/build.gradle.kts
    id("io.spring.dependency-management")  // ← Версия из buildSrc/build.gradle.kts
}

dependencies {
    implementation(Libs.springBootStarter)
    implementation(Libs.springBootValidation)
    implementation(Libs.springBootActuator)

    developmentOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    testImplementation(Libs.springBootTest)
}

tasks.getByName<Jar>("jar") {
    enabled = false
}

springBoot {
    buildInfo()
}