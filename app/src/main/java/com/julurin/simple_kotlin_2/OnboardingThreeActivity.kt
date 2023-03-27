package com.julurin.simple_kotlin_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardingThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_three)

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            finish()
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}