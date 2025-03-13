plugins {
    id("java")
    id("se.patrikerdes.use-latest-versions") version "0.2.18"
    id("com.github.ben-manes.versions") version "0.41.0"
    id("io.freefair.lombok") version "8.6"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.assertj:assertj-core:3.22.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.11.1")
    implementation("org.apache.commons:commons-lang3:3.13.0")
    implementation("org.apache.commons:commons-collections4:4.4")

}

tasks.test {
    useJUnitPlatform()
}