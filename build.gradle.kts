import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.20"
    application
}

group = "org.cucumber"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.cucumber:cucumber-java:7.8.1")
    testImplementation("io.cucumber:cucumber-junit:7.8.1")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.vintage:junit-vintage-engine")

    testImplementation("org.junit.platform:junit-platform-suite:1.9.1")

    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.8.1")

    testImplementation("io.cucumber:cucumber-spring:7.8.1")

    implementation("org.springframework:spring-context-support:5.3.23")

    implementation("org.springframework:spring-test:5.3.23")

    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4")

}

tasks.test {
    useJUnitPlatform()
    systemProperty("cucumber.junit-platform.naming-strategy", "long")
    testLogging {
        events("passed", "skipped", "failed")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}