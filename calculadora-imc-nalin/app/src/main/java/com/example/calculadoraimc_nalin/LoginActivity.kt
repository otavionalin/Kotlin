package com.example.calculadoraimc_nalin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val edtUser = findViewById<EditText>(R.id.edtUser)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val user = edtUser.text.toString()
            val pass = edtPassword.text.toString()

            if (user == "admin" && pass == "1234") {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Usuário ou senha incorretos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}