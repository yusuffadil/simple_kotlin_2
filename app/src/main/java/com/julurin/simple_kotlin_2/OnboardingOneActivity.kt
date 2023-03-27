package com.julurin.simple_kotlin_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardingOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_one)

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            finish()
            startActivity(Intent(this, OnboardingTwoActivity::class.java))
        }
    }
}