package com.rosterloh.workshopthing.main

import android.os.Bundle
import com.google.android.things.device.TimeManager
import com.rosterloh.workshopthing.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import timber.log.Timber

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment(), "main")
                    .commitNow()
        }
    }

    override fun onStart() {
        super.onStart()
        launch {
            delay(1000)
            setSystemInformation()
        }
    }

    private fun setSystemInformation() {
        try {
            TimeManager.getInstance().setTimeZone("Europe/London")
        } catch (e: IllegalStateException) {
            Timber.e(e.message)
        }
    }
}