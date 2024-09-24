import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("java-library")
    id("com.vanniktech.maven.publish") version "0.28.0"
}

group = "io.github.cromat"
version = "1.1"

repositories {
    mavenCentral()
}

dependencies {
    api("javax.servlet:javax.servlet-api:4.0.1")
    api("jakarta.servlet:jakarta.servlet-api:6.1.0")
}

mavenPublishing {
    coordinates(
        groupId = group as String,
        artifactId = name,
        version = version as String
    )

    pom {
        name = "jakarta2javax"
        description = "Backward compatibility tool for libraries like Okta Auth0 Java SDK that still require Javax servlet API."
        url = "https://github.com/cromat/jakarta2javax"

        licenses {
            license {
                name = "MIT License"
            }
        }

        developers {
            developer {
                id = "cromat"
                name = "Cromat"
                email = "cromat.dev@gmail.com"
                url = "https://cromat.github.io/"
            }
        }

        scm {
            url = "https://github.com/cromat/jakarta2javax"
            connection = "scm:git:https://github.com/cromat/jakarta2javax.git"
            developerConnection = "scm:git:git@github.com:cromat/jakarta2javax.git"
        }
    }

    // Configure publishing to Maven Central
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    // Enable GPG signing for all publications
    signAllPublications()
}