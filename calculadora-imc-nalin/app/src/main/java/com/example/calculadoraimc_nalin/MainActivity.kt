package com.example.calculadoraimc_nalin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPeso = findViewById<EditText>(R.id.edtPeso)
        val edtAltura = findViewById<EditText>(R.id.edtAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnCalcular.setOnClickListener {
            val pesoStr = edtPeso.text.toString()
            val alturaStr = edtAltura.text.toString()

            // Validações
            if (pesoStr.isEmpty() || alturaStr.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val peso = pesoStr.toFloatOrNull()
            val altura = alturaStr.toFloatOrNull()

            if (peso == null || altura == null || altura == 0f) {
                Toast.makeText(this, "Valores inválidos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val imc = peso / (altura * altura)
            val classificacao: String
            val cor: Int

            when {
                imc < 18.5 -> {
                    classificacao = "Abaixo do peso"
                    cor = android.R.color.holo_orange_light
                }
                imc in 18.5..24.9 -> {
                    classificacao = "Peso normal"
                    cor = android.R.color.holo_green_dark
                }
                imc in 25.0..29.9 -> {
                    classificacao = "Sobrepeso"
                    cor = android.R.color.holo_orange_dark
                }
                imc in 30.0..39.9 -> {
                    classificacao = "Obesidade"
                    cor = android.R.color.holo_red_light
                }
                else -> {
                    classificacao = "Obesidade Grave"
                    cor = android.R.color.holo_red_dark
                }
            }

            txtResultado.text = "IMC: %.2f\nClassificação: %s".format(imc, classificacao)
            txtResultado.setTextColor(ContextCompat.getColor(this, cor))
        }
    }
}