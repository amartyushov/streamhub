object Versions {
    const val springBoot = "4.0.1"
    const val springCloud = "2025.1.0"

    const val kafka = "4.0.1"
    const val postgresql = "42.7.3"
    const val flyway = "10.15.0"
    const val lombok = "1.18.32"

    const val junit = "6.0.2"
    const val assertj = "3.25.3"
    const val mockito = "5.11.0"
    const val testcontainers = "2.0.2"
}

object Libs {
    // Spring
    const val springBootStarter = "org.springframework.boot:spring-boot-starter"
    const val springBootWeb = "org.springframework.boot:spring-boot-starter-web"
    const val springBootWebSocket = "org.springframework.boot:spring-boot-starter-websocket"
    const val springBootData = "org.springframework.boot:spring-boot-starter-data-jpa"
    const val springBootSecurity = "org.springframework.boot:spring-boot-starter-security"
    const val springBootValidation = "org.springframework.boot:spring-boot-starter-validation"
    const val springBootActuator = "org.springframework.boot:spring-boot-starter-actuator"

    // Kafka
    const val springKafka = "org.springframework.kafka:spring-kafka"

    // Database
    // Spring Boot BOM manages this for you
    const val postgresql = "org.postgresql:postgresql:${Versions.postgresql}"
    // Spring Boot BOM manages this for you
    const val flyway = "org.flywaydb:flyway-core:${Versions.flyway}"
    // Spring Boot BOM manages this for you
    const val flywayPostgres = "org.flywaydb:flyway-database-postgresql:${Versions.flyway}"

    // Utils
    const val lombok = "org.projectlombok:lombok:${Versions.lombok}"
//    const val jackson = "com.fasterxml.jackson.core:jackson-databind"

    // Testing
    const val springBootTest = "org.springframework.boot:spring-boot-starter-test"
    const val junitJupiter = "org.junit.jupiter:junit-jupiter:${Versions.junit}"
    // Spring Boot BOM manages this for you
    const val assertj = "org.assertj:assertj-core:${Versions.assertj}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val testcontainers = "org.testcontainers:testcontainers:${Versions.testcontainers}"
    const val testcontainersPostgres = "org.testcontainers:testcontainers-postgresql:${Versions.testcontainers}"
    const val testcontainersKafka = "org.testcontainers:testcontainers-kafka:${Versions.testcontainers}"
}