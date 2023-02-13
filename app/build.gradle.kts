
plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}
val jpaStreamerVersion: String by project
val hibernateVersion: String by project
val mysqlVersion: String by project

dependencies {
    implementation("com.google.guava:guava:31.1-jre")
    implementation("org.hibernate:hibernate-entitymanager:$hibernateVersion")
    implementation("com.speedment.jpastreamer:jpastreamer-core:$jpaStreamerVersion")
    annotationProcessor("com.speedment.jpastreamer:fieldgenerator-standard:$jpaStreamerVersion")
    implementation("com.mysql:mysql-connector-j:$mysqlVersion")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

application {
    // Define the main class for the application.
    mainClass.set("com.example.App")
}

sourceSets{
    main {
        java {
            srcDir("src/main/java")
            srcDir("target/generated-sources/annotations")
        }
    }
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
