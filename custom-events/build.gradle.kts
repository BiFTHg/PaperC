plugins {
    id("java")
    id("maven-publish")
}

group = "net.craftoriya"
version = "1.21.4-R0.1-0.0.20-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(project(":paper-api"))
}

java {
    withSourcesJar()
}

publishing {
    repositories {
        maven {
            url = uri("https://maven.craftoriya.net/repository/public-snapshots/")
            credentials {
                username = System.getenv("NEXUS_USER") ?: project.findProperty("craftoriya.nexus.username").toString()
                password =
                    System.getenv("NEXUS_USER_PASSWORD") ?: project.findProperty("craftoriya.nexus.password").toString()
            }
            isAllowInsecureProtocol = true
            metadataSources {
                mavenPom()
                artifact()
            }
        }
    }
    publications {
        create<MavenPublication>("default") {
            groupId = project.group.toString()
            artifactId = "custom-events"
            version = project.version.toString()

            from(components["java"])
            versionMapping {
                usage("java-api") {
                    fromResolutionOf("runtimeClasspath")
                }
                usage("java-runtime") {
                    fromResolutionResult()
                }
            }
        }
    }
}
