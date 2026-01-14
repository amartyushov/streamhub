plugins {
    id("spring-conventions")
}

dependencies {
    api(project(":libs:domain"))  // Entities reference domain models

    implementation(Libs.springBootData)
    implementation(Libs.postgresql)
    implementation(Libs.flyway)
    implementation(Libs.flywayPostgres)

    compileOnly(Libs.lombok)
    annotationProcessor(Libs.lombok)

    testImplementation(Libs.testcontainersPostgres)
}