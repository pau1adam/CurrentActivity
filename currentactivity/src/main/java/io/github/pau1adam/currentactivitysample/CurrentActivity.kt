package io.github.pau1adam.currentactivitysample

import android.app.Activity
import android.app.Application
import android.os.Bundle

/**
 * Created by Paul Adam on 14/9/2018.
 */
object CurrentActivity {

    /** Register to the applications lifecycle callbacks. */
    @JvmStatic fun init(app: Application) {
        app.registerActivityLifecycleCallbacks(lifecycleCallbacks)
    }

    /** Get current activity. */
    @JvmStatic fun get(): Activity? = lifecycleCallbacks.currentActivity

    /** Cache activity when it appears and release the reference when it goes away. */
    private val lifecycleCallbacks = object : Application.ActivityLifecycleCallbacks {
        var currentActivity: Activity? = null
            private set

        override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
            currentActivity = activity
        }

        override fun onActivityStarted(activity: Activity?) {
            currentActivity = activity
        }

        override fun onActivityResumed(activity: Activity?) {
            currentActivity = activity
        }

        override fun onActivityPaused(activity: Activity?) {
            currentActivity = null
        }

        override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
            if (currentActivity == activity) currentActivity = null
        }

        override fun onActivityStopped(activity: Activity?) {
            if (currentActivity == activity) currentActivity = null
        }

        override fun onActivityDestroyed(activity: Activity?) {
            if (currentActivity == activity) currentActivity = null
        }
    }

}