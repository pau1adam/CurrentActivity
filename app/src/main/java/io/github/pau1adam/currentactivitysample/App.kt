package io.github.pau1adam.currentactivitysample

import android.app.Application

/**
 * Created by Paul Adam on 14/9/2018.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        CurrentActivity.init(this)
    }
}