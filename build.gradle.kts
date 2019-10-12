import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
  repositories {
    google()
    jcenter()

  }
  dependencies {
    classpath(BuildPlugins.androidGradlePlugin)
    classpath(BuildPlugins.kotlinGradlePlugin)
    // NOTE: Do not place your application dependencies here; they belong
    // in the individual module build.gradle files
  }
}

allprojects {
  repositories {
    google()
    jcenter()

  }
}

tasks.register("clean").configure {
  delete("build")
}
subprojects {
  tasks.withType<KotlinCompile>().configureEach {
    println("Configuring $name in project ${project.name}...")
    kotlinOptions {
      suppressWarnings = true
      jvmTarget = "1.8"
    }
  }
}