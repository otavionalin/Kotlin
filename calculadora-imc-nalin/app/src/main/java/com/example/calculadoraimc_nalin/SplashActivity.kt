package com.example.calculadoraimc_nalin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // sem setContentView: deixa o splash nativo aparecer

        window.decorView.postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, 600)
    }
}
