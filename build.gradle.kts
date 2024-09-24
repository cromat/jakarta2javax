import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("java-library")
    id("com.vanniktech.maven.publish") version "0.28.0"
}

group = "io.github.cromat"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("javax.servlet:javax.servlet-api:4.0.1")
    compileOnly("jakarta.servlet:jakarta.servlet-api:6.1.0")
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
    }

    // Configure publishing to Maven Central
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    // Enable GPG signing for all publications
    signAllPublications()
}