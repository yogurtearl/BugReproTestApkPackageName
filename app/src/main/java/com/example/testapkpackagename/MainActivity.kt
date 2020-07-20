package com.example.testapkpackagename

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import some.other.app.id.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}