package io.github.pau1adam.sample

import android.app.Application
import io.github.pau1adam.currentactivitysample.CurrentActivity

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        CurrentActivity.init(this)
    }
}