package com.yernarkt.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "${javaClass.simpleName} onCreate()")
    }

    private companion object {
        val TAG = BaseActivity::class.java.simpleName
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "${javaClass.simpleName} onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "${javaClass.simpleName} onResume()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "${javaClass.simpleName} onRestart()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "${javaClass.simpleName} onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "${javaClass.simpleName} onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "${javaClass.simpleName} onDestroy()")
    }
}
