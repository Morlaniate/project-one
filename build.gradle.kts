plugins {
    jacoco
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

    implementation("net.datafaker:datafaker:2.4.2")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.17.2")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.17.2")
    implementation("org.apache.commons:commons-lang3:3.13.0")
    implementation("org.apache.commons:commons-collections4:4.4")
    implementation("commons-io:commons-io:2.16.1")

}

jacoco {
    toolVersion = "0.8.12"
    reportsDirectory = layout.buildDirectory.dir("reports/jacoco")
}


tasks.test {
    useJUnitPlatform()
    finalizedBy("jacocoTestReport")
    doLast {
        println("View code coverage at:")
        println("file://$layout:buildDirectory/reports/jacoco/test/html/index.html")
    }
}

tasks.jacocoTestReport {

    reports {
        xml.required = true
        csv.required = true
        html.outputLocation = layout.buildDirectory.dir("jacocoHtml")
    }

    dependsOn(tasks.test) // tests are required to run before generating the report
}
