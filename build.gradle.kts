plugins {
    kotlin("js") version "1.4.32"
    id("org.jetbrains.compose") version "0.0.0-web-dev-12"
}

group = "com.yt8492"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(compose.web.web)
    implementation(compose.runtime)
}

kotlin {
    js(IR) {
        browser {
            webpackTask {
                outputFileName = "main.js"
                cssSupport.enabled = true
            }

            runTask {
                outputFileName = "main.js"
                cssSupport.enabled = true
            }
        }
        binaries.executable()
    }
}