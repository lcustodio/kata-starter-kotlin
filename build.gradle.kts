plugins {
    kotlin("jvm") version "1.9.22"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("com.natpryce:hamkrest:1.8.0.1")
    testImplementation("junit:junit:4.13.2")
}

kotlin {
    jvmToolchain(21)
}