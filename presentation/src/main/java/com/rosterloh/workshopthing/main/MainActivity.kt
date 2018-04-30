package com.rosterloh.workshopthing.main

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.google.android.things.device.TimeManager
import com.rosterloh.workshopthing.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import timber.log.Timber
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var viewModelFactory : ViewModelProvider.Factory
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)

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