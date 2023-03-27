package com.julurin.simple_kotlin_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Toast

class BlogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        Toast.makeText(this, "Silahkan Tunggu ...", Toast.LENGTH_SHORT).show()

        val webview = findViewById<WebView>(R.id.webview)
        webview.loadUrl("https://www.google.com/")
        webview.settings.javaScriptEnabled
    }
}