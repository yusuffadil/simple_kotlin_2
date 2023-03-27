package com.julurin.simple_kotlin_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            finish()
            startActivity(Intent(this, OnboardingOneActivity::class.java))
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            finish()
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}