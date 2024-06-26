package com.example.baru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.FullyDrawnReporter

class Web : AppCompatActivity() {

    lateinit var webv : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        supportActionBar?.hide()

        webv = findViewById(R.id.webv)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        webv.webViewClient = WebViewClient()
        webv.loadUrl("https://google.com")

        var webSettings = webv.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (webv.canGoBack()){
            webv.goBack()
        }
        else{
            super.onBackPressed()
        }
    }
}