plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
//    id("com.google.devtools.ksp")
//    id("com.google.dagger.hilt.android")

   // id("org.jetbrains.kotlin.plugin.serialization") version "2.4.20"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.2.10"
}

android {
    namespace = "com.example.myrecipeapp"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.myrecipeapp"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.crashlytics.buildtools)
    testImplementation(libs.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    debugImplementation(libs.androidx.compose.ui.tooling)




// for roomdatabase
//    implementation("androidx.room:room-runtime:2.8.5")
//
//    ksp("androidx.room:room-compiler:2.8.4")
//
//    // for corotines
//    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.11.0")
//
    // for extra icon
    implementation("androidx.compose.material:material-icons-extended")
//
//    // for DI (hilt)
//    implementation("com.google.dagger:hilt-android:2.60.1")
//    ksp("com.google.dagger:hilt-android-compiler:2.57.1")
//
//    // for navigation
//    implementation("androidx.hilt:hilt-lifecycle-viewmodel-compose:1.4.0")
//    ksp("androidx.hilt:hilt-compiler:1.4.0")


// Ktor
    implementation("io.ktor:ktor-client-core:3.5.0")
    implementation("io.ktor:ktor-client-android:3.6.0")
    implementation("io.ktor:ktor-client-content-negotiation:3.6.0")
    implementation("io.ktor:ktor-serialization-kotlinx-json:3.6.0")

// Kotlin Serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.11.0")

// Navigation
    implementation("androidx.navigation:navigation-compose:2.9.8")

// ViewModel Compose
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.11.0")

// Coil
    implementation("io.coil-kt.coil3:coil-compose:3.6.3")

}