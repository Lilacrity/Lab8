plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.listcity"
    compileSdk = 34
    tasks.withType<Test>{
        useJUnitPlatform()
    }


    defaultConfig {
        applicationId = "com.example.listcity"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    //testImplementation(libs.junit)
    //androidTestImplementation(libs.ext.junit)
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.0.1")
    testImplementation(libs.junit.junit)
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.0.1")
    androidTestImplementation(libs.espresso.core)

}