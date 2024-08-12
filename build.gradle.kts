plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    // Save args
    id("androidx.navigation.safeargs.kotlin") version "2.7.7" apply false
    //Ksp
    id("com.google.devtools.ksp") version "2.0.10-1.0.24" apply false
}