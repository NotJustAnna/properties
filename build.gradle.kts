plugins {
    `java-library`
    `maven-publish`
}

group = "net.adriantodt"
version = "1.0.0"

run {
    val v = System.getenv("VERSION")?.takeIf { it.isNotBlank() && it != "auto" } ?: project.version.toString()
    val snapshot = (System.getenv("SNAPSHOT") ?: "false").toBoolean()
    project.version = if (snapshot) if (v.endsWith("-SNAPSHOT")) v else "$v-SNAPSHOT" else v
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:23.0.0")
}

java.targetCompatibility = JavaVersion.VERSION_1_8
java.sourceCompatibility = JavaVersion.VERSION_1_8

tasks {
    register<Jar>("sourcesJar") {
        archiveClassifier.set("sources")
        from(sourceSets.main.get().allSource)
    }

    val javadoc by getting(Javadoc::class) {
        isFailOnError = false
        options {
            encoding = "UTF-8"
            memberLevel = JavadocMemberLevel.PUBLIC
        }
    }

    register<Jar>("javadocJar") {
        dependsOn(javadoc)
        archiveClassifier.set("javadoc")
        from(javadoc.destinationDir)
    }
}

artifacts {
    add("archives", tasks.named("sourcesJar"))
    add("archives", tasks.named("javadocJar"))
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            artifact(tasks.named("sourcesJar"))
            artifact(tasks.named("javadocJar"))
        }
    }

    repositories {
        maven {
            name = "AdrianTodt"
            url = if (project.version.toString().endsWith("-SNAPSHOT")) {
                uri("https://maven.adriantodt.net/snapshots")
            } else {
                uri("https://maven.adriantodt.net/releases")
            }

            credentials {
                username = System.getenv("MAVEN_USERNAME")
                password = System.getenv("MAVEN_PASSWORD")
            }
            authentication {
                create("basic", BasicAuthentication::class)
            }
        }
        mavenLocal()
    }
}
