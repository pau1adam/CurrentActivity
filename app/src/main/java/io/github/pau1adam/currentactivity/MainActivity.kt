package io.github.pau1adam.currentactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layout.setOnClickListener {
            startActivity(Intent(this, SecondaryActivity::class.java))
        }
        Log.d(TAG, "onCreate")
        Log.d(TAG, CurrentActivity.get().toString())
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onCreate")
        Log.d(TAG, CurrentActivity.get().toString())
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
        Log.d(TAG, CurrentActivity.get().toString())
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
        Log.d(TAG, CurrentActivity.get().toString())
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(TAG, "onSaveInstanceState")
        Log.d(TAG, CurrentActivity.get().toString())
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
        Log.d(TAG, CurrentActivity.get().toString())
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
        Log.d(TAG, CurrentActivity.get().toString())
    }
}
