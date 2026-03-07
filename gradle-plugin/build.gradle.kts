plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("com.gradleup.shadow") version "9.3.2"
}

group = "dev.ujhhgtg"
version = "unspecified"

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("nameof") {
            id = "dev.ujhhgtg.nameof"
            implementationClass = "dev.ujhhgtg.nameof.NameOfGradlePlugin"
        }
    }
}

dependencies {
    implementation(kotlin("gradle-plugin-api"))
}

kotlin {
    jvmToolchain(21)
}
