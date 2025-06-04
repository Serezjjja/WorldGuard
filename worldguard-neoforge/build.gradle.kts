plugins {
    id("java-library")
    id("maven-publish")
    id("net.neoforged.gradle.userdev") version "7.0.170"
}

base.archivesName.set("worldguard-neoforge")

version = project.properties["version"]!!
group = project.properties["group"]!!

repositories {
    mavenCentral()
    maven { url = uri("https://maven.enginehub.org/repo/") }
}

dependencies {
    implementation(project(":worldguard-core"))
    implementation(libs.worldedit.core)
    implementation("net.neoforged:neoforge:${project.property("neo_version")}")
}

sourceSets.main.resources.srcDir("src/generated/resources")

publishing {
    publications.register<MavenPublication>("maven") {
        from(components["java"])
    }
}
