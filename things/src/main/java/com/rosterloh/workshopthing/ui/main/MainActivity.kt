package com.rosterloh.workshopthing.ui.main

import android.content.Context
import android.os.Bundle
import com.rosterloh.workshopthing.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        assert(context != null)
    }
}