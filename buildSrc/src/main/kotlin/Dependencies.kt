const val kotlinVersion = "1.3.50"

object BuildPlugins {

  object Versions {
    const val buildToolsVersion = "3.3.1"
  }

  const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
  const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
  const val androidApplication = "com.android.application"
  const val kotlinAndroid = "kotlin-android"
  const val kotlinAndroidExtensions = "kotlin-android-extensions"
  const val kotlinKAPT = "kotlin-kapt"

}

object AndroidSdk {
  const val min = 15
  const val compile = 28
  const val target = compile
}

object Libraries {
  private object Versions {
    const val jetpack = "1.1.0"
    const val constraintLayout = "1.1.3"
    const val ktx = "1.1.0"
    const val ktx_varios = "2.1.0"
    const val material_ui = "1.0.0"
    const val koin = "2.0.1"
  }

  const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
  const val appCompat = "androidx.appcompat:appcompat:${Versions.jetpack}"
  const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
  const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
  const val materialUI = "com.google.android.material:material:${Versions.material_ui}"
  const val navigationFragment = "androidx.navigation:navigation-fragment:2.1.0"
  const val navigationUI = "androidx.navigation:navigation-ui:2.1.0"
  const val lifeCycle = "androidx.lifecycle:lifecycle-extensions:2.1.0"
  const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:2.1.0"
  const val navigationUIKtx = "androidx.navigation:navigation-ui-ktx:2.1.0"
  const val koinCore = "org.koin:koin-core:${Versions.koin}"
  const val koinScope = "org.koin:koin-androidx-scope:2.0.1"
  const val koinVM = "org.koin:koin-androidx-viewmodel:2.0.1"
  const val koinAndroidExt = "org.koin:koin-androidx-ext:2.0.1"
}

object TestLibraries {
  private object Versions {
    const val junit4 = "4.12"
    const val testRunner = "1.1.1"
    const val espresso = "3.2.0"
  }

  const val junit4 = "junit:junit:${Versions.junit4}"
  const val testRunner = "androidx.test:runner:${Versions.testRunner}"
  const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}