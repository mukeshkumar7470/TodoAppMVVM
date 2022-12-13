package com.example.todoapp.presentations.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.example.todoapp.R

class SplashScreenActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}