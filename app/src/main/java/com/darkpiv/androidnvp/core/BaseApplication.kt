package com.darkpiv.androidnvp.core

import android.app.Application
import android.content.Context

class BaseApplication : Application() {

  override fun onCreate() {
    super.onCreate()
  }

  override fun attachBaseContext(base: Context?) {
    super.attachBaseContext(base)
  }

  override fun onLowMemory() {
    super.onLowMemory()
  }
}