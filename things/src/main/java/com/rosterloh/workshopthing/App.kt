package com.rosterloh.workshopthing

import com.rosterloh.workshopthing.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class App : DaggerApplication() {
    override fun applicationInjector(): @JvmSuppressWildcards AndroidInjector<out DaggerApplication> =
            DaggerAppComponent.builder().create(this)
}