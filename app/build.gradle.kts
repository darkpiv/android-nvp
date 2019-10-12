plugins {
  id(BuildPlugins.androidApplication)
  id(BuildPlugins.kotlinAndroid)
  id(BuildPlugins.kotlinAndroidExtensions)
  id(BuildPlugins.kotlinKAPT)
}

android {
  compileSdkVersion(AndroidSdk.compile)
  defaultConfig {
    applicationId = "com.darkpiv.androidnvp"
    minSdkVersion(AndroidSdk.min)
    targetSdkVersion(AndroidSdk.target)
    versionCode = 1
    versionName = "1.0"
    testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
  }
  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
}

dependencies {

  implementation(Libraries.kotlinStdLib)
  implementation(Libraries.appCompat)
  implementation(Libraries.ktxCore)
  implementation(Libraries.constraintLayout)
  implementation(Libraries.materialUI)
  implementation(Libraries.navigationFragment)
  implementation(Libraries.navigationUI)
  implementation(Libraries.lifeCycle)
  implementation(Libraries.navigationFragmentKtx)
  implementation(Libraries.navigationUIKtx)

  testImplementation(TestLibraries.junit4)
  androidTestImplementation(TestLibraries.testRunner)
  androidTestImplementation(TestLibraries.espresso)
}


