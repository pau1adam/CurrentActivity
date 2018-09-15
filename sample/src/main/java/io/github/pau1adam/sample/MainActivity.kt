package io.github.pau1adam.sample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import io.github.pau1adam.currentactivitysample.CurrentActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layout.setOnClickListener {
            startActivity(Intent(this, SecondaryActivity::class.java))
        }
        Log.d(io.github.pau1adam.currentactivitysample.TAG, "onCreate")
        Log.d(io.github.pau1adam.currentactivitysample.TAG, CurrentActivity.get().toString())
    }

    override fun onStart() {
        super.onStart()
        Log.d(io.github.pau1adam.currentactivitysample.TAG, "onCreate")
        Log.d(io.github.pau1adam.currentactivitysample.TAG, CurrentActivity.get().toString())
    }

    override fun onResume() {
        super.onResume()
        Log.d(io.github.pau1adam.currentactivitysample.TAG, "onResume")
        Log.d(io.github.pau1adam.currentactivitysample.TAG, CurrentActivity.get().toString())
    }

    override fun onPause() {
        super.onPause()
        Log.d(io.github.pau1adam.currentactivitysample.TAG, "onPause")
        Log.d(io.github.pau1adam.currentactivitysample.TAG, CurrentActivity.get().toString())
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(io.github.pau1adam.currentactivitysample.TAG, "onSaveInstanceState")
        Log.d(io.github.pau1adam.currentactivitysample.TAG, CurrentActivity.get().toString())
    }

    override fun onStop() {
        super.onStop()
        Log.d(io.github.pau1adam.currentactivitysample.TAG, "onStop")
        Log.d(io.github.pau1adam.currentactivitysample.TAG, CurrentActivity.get().toString())
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(io.github.pau1adam.currentactivitysample.TAG, "onDestroy")
        Log.d(io.github.pau1adam.currentactivitysample.TAG, CurrentActivity.get().toString())
    }
}
