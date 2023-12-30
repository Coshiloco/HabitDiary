plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
    id("org.jlleitschuh.gradle.ktlint")
    kotlin("plugin.serialization") version "1.9.21"
}

android {
    namespace = "com.example.habitdiary"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.habitdiary"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
    buildFeatures {
        buildConfig = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.7"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Androidx
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.2")

    // Splash
    implementation("androidx.core:core-splashscreen:1.0.1")

    // Swipe
    implementation("me.saket.swipe:swipe:1.2.0")

    // Navigation
    implementation("androidx.hilt:hilt-navigation-compose:1.1.0")

    // Compose
    implementation(platform("androidx.compose:compose-bom:2023.10.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-extended")
    implementation("androidx.compose.runtime:runtime-livedata")
    implementation("androidx.compose.animation:animation:1.5.4")

    // Google auth
    implementation("com.google.android.gms:play-services-auth:20.7.0")

    // Retrofit
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation("com.google.code.gson:gson:2.10.1")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.49")
    ksp("com.google.dagger:hilt-android-compiler:2.49")
    kspTest("com.google.dagger:hilt-android-compiler:2.49")

    // Navigation Con Safe Arguments
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("androidx.navigation:navigation-compose:2.7.6")
    implementation("io.github.dilrajsingh1997:compose-annotation:1.0.3")
    ksp("io.github.dilrajsingh1997:compose-annotation-processor:1.0.6")

    // Supabase
    implementation(platform("io.github.jan-tennert.supabase:bom:2.0.1"))
    implementation("io.github.jan-tennert.supabase:postgrest-kt")
    implementation("io.github.jan-tennert.supabase:realtime-kt")
    implementation("io.ktor:ktor-client-android:2.3.7")


    // Timber
    implementation("com.jakewharton.timber:timber:5.0.1")

    // Coil
    implementation("io.coil-kt:coil:2.5.0")
    implementation("io.coil-kt:coil-compose:2.5.0")

    // Ktlint Ruleset
    ktlintRuleset("io.nlopez.compose.rules:ktlint:0.3.5")

    // Test
    testImplementation("junit:junit:4.13.2")
    testImplementation("com.google.truth:truth:1.1.5")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testImplementation("androidx.test:core-ktx:1.5.0")
    testImplementation("androidx.test.ext:junit-ktx:1.1.5")
    testImplementation("androidx.test:rules:1.5.0")

    testImplementation("io.mockk:mockk:1.13.8")

    testImplementation("org.mockito:mockito-core:5.8.0")
    testImplementation("org.mockito.kotlin:mockito-kotlin:5.2.1")
    testImplementation("org.mockito:mockito-inline:5.2.0")
    testImplementation("org.mockito.kotlin:mockito-kotlin:5.2.1")

    testImplementation("app.cash.turbine:turbine:1.0.0")

    // Android Test
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.10.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}