plugins {
 zsruir-codex/портировать-плагин-в-мод-для-neoforge
    `java-library`
    id("net.neoforged.gradle.userdev") version "7.0.170"
    id("buildlogic.platform")
 =======
    id("java-library")
    id("maven-publish")
    id("net.neoforged.gradle.userdev") version "7.0.170"
 version/7.0.x
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
 zsruir-codex/портировать-плагин-в-мод-для-neoforge
    implementation("net.neoforged:neoforge:${project.property("neo_version")}") {
        // Minecraft already bundles common libraries, use our versions
        exclude(group = "com.google.code.gson", module = "gson")
        exclude(group = "com.google.guava", module = "guava")
        exclude(group = "it.unimi.dsi", module = "fastutil")
        exclude(group = "org.apache.logging.log4j", module = "log4j-api")
        exclude(group = "org.apache.logging.log4j", module = "log4j-core")
    }
}

sourceSets {
    main {
        resources.srcDir("src/generated/resources")
=======
    implementation("net.neoforged:neoforge:${project.property("neo_version")}")
}

sourceSets.main.resources.srcDir("src/generated/resources")

publishing {
    publications.register<MavenPublication>("maven") {
        from(components["java"])
 version/7.0.x
    }
}
