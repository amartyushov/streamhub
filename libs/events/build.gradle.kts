plugins {
    id("kotlin-conventions")
}

dependencies {
    api(project(":libs:common"))

//    implementation(Libs.jackson)  // For serialization

    compileOnly(Libs.lombok)
    annotationProcessor(Libs.lombok)
}