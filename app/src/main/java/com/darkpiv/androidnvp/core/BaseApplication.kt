package com.darkpiv.androidnvp.core

import android.app.Application
import android.content.Context
import dagger.android.DaggerApplication

class BaseApplication : DaggerApplication() {

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