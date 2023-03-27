package com.julurin.simple_kotlin_2

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tv_blog = findViewById<TextView>(R.id.tv_blog)
        tv_blog.setOnClickListener {
            startActivity(Intent(this, BlogActivity::class.java))
        }
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Konfirmasi")
            .setMessage("Apakah Anda ingin keluar dari aplikasi?")
            .setPositiveButton("Ya", DialogInterface.OnClickListener{dialogInterface, i ->
                Toast.makeText(this, "Terimakasih telah menggunakan aplikasi My Finance",
                    Toast.LENGTH_SHORT).show()
                finish()
            })
            .setNegativeButton("Batal", DialogInterface.OnClickListener{dialogInterface, i ->

            }).show()


    }
}