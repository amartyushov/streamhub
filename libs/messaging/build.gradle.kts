plugins {
    id("spring-conventions")
}

dependencies {
    api(project(":libs:events"))  // Kafka handles events

    implementation(Libs.springKafka)

    compileOnly(Libs.lombok)
    annotationProcessor(Libs.lombok)

    testImplementation(Libs.testcontainersKafka)
}