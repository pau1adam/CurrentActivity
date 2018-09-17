package io.github.pau1adam.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import io.github.pau1adam.currentactivitysample.CurrentActivity

class SecondaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        Log.d(TAG, "onCreate ${CurrentActivity.get()}")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart ${CurrentActivity.get()}")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume ${CurrentActivity.get()}")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause ${CurrentActivity.get()}")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(TAG, "onSaveInstanceState ${CurrentActivity.get()}")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop ${CurrentActivity.get()}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy ${CurrentActivity.get()}")
    }
}
