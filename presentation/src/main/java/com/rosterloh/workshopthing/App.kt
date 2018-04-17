package com.rosterloh.workshopthing

import com.crashlytics.android.Crashlytics
import com.rosterloh.workshopthing.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import io.fabric.sdk.android.Fabric
import timber.log.Timber

class App : DaggerApplication() {

    override fun applicationInjector(): @JvmSuppressWildcards AndroidInjector<out DaggerApplication> =
            DaggerAppComponent.builder().create(this)

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Fabric.with(this, Crashlytics())
        }
    }
}