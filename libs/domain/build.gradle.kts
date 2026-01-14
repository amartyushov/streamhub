plugins {
    id("java-conventions")
}

dependencies {
    api(project(":libs:common"))  // Can use common utilities

    // Annotations only
    compileOnly(Libs.lombok)
    annotationProcessor(Libs.lombok)
}