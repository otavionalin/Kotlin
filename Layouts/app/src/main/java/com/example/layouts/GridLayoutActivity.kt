package com.example.layouts


import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GridLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)
        title = "GridLayout"

        // Lista de botões e mensagens correspondentes
        val buttonsMap = mapOf(
            R.id.button1 to "Você pressionou 1",
            R.id.button2 to "Você pressionou 2",
            R.id.button3 to "Você pressionou 3",
            R.id.button4 to "Você pressionou 4",
            R.id.button5 to "Você pressionou 5",
            R.id.button6 to "Você pressionou 6",
            R.id.button7 to "Você pressionou 7",
            R.id.button8 to "Você pressionou 8",
            R.id.button9 to "Você pressionou 9",
            R.id.button0 to "Você pressionou 0",
            R.id.buttonDot to "Você pressionou .",
            R.id.buttonOk to "Você pressionou OK"
        )

        // Configurar os listeners
        buttonsMap.forEach { (id, message) ->
            findViewById<Button>(id).setOnClickListener {
                showToast(message)
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}