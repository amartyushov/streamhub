plugins {
    id("java-conventions")
}

dependencies {
    implementation(project(":libs:common"))  // Can use common utilities

    // Annotations only
    compileOnly(Libs.lombok)
    annotationProcessor(Libs.lombok)
}