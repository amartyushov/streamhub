plugins {
    id("java-conventions")
}

dependencies {
    implementation(project(":libs:domain"))  // Events reference domain models

//    implementation(Libs.jackson)  // For serialization

    compileOnly(Libs.lombok)
    annotationProcessor(Libs.lombok)
}