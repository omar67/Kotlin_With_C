package com.omar67.kotlinwithc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.text).text = getText()

    }

    private external fun getText(): String

    companion object {
        init {
            System.loadLibrary("test_code")
        }
    }
}