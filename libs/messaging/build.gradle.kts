plugins {
    id("spring-conventions")
}

dependencies {
    implementation(project(":libs:events"))  // Kafka handles events

    implementation(Libs.springKafka)

    compileOnly(Libs.lombok)
    annotationProcessor(Libs.lombok)

    testImplementation(Libs.testcontainersKafka)
}