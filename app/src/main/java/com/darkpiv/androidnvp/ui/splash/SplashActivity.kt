package com.darkpiv.androidnvp.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.darkpiv.androidnvp.GlideApp
import com.darkpiv.androidnvp.R
import com.darkpiv.androidnvp.ui.MainActivity
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {
  private val job = Job()

  private val uiScope = CoroutineScope(Dispatchers.Main + job)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash)
    GlideApp.with(this)
      .load(R.drawable.loading)
      .into(loading)
    go()
  }

  fun go() {
    uiScope.launch {
      delay(2000)
      startActivity(Intent(this@SplashActivity, MainActivity::class.java))
    }
  }
}
