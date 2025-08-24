package com.example.layouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class ScrollViewActivity : AppCompatActivity() {

    // Declarando os campos de entrada
    private lateinit var editTextName: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPhone: EditText
    private lateinit var editTextAddress: EditText
    private lateinit var editTextCPF: EditText
    private lateinit var editTextBirthday: EditText
    private lateinit var editTextGender: EditText
    private lateinit var editTextOccupation: EditText
    private lateinit var editTextCity: EditText
    private lateinit var editTextZipCode: EditText
    private lateinit var editTextMaritalStatus: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view)

        // Inicializando os campos EditText
        editTextName = findViewById(R.id.editTextName)
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPhone = findViewById(R.id.editTextPhone)
        editTextAddress = findViewById(R.id.editTextAddress)
        editTextCPF = findViewById(R.id.editTextCPF)
        editTextBirthday = findViewById(R.id.editTextBirthday)
        editTextGender = findViewById(R.id.editTextGender)
        editTextOccupation = findViewById(R.id.editTextOccupation)
        editTextCity = findViewById(R.id.editTextCity)
        editTextZipCode = findViewById(R.id.editTextZipCode)
        editTextMaritalStatus = findViewById(R.id.editTextMaritalStatus)

        // Inicializando o botão de enviar
        submitButton = findViewById(R.id.submitButton)

        // Configurando o clique do botão para mostrar os dados
        submitButton.setOnClickListener {
            // Pegando os valores inseridos nos campos
            val name = editTextName.text.toString()
            val email = editTextEmail.text.toString()
            val phone = editTextPhone.text.toString()
            val address = editTextAddress.text.toString()
            val cpf = editTextCPF.text.toString()
            val birthday = editTextBirthday.text.toString()
            val gender = editTextGender.text.toString()
            val occupation = editTextOccupation.text.toString()
            val city = editTextCity.text.toString()
            val zipCode = editTextZipCode.text.toString()
            val maritalStatus = editTextMaritalStatus.text.toString()

            // Exibindo um resumo com os dados inseridos
            val message = """
                Nome: $name
                Email: $email
                Telefone: $phone
                Endereço: $address
                CPF: $cpf
                Data de Nascimento: $birthday
                Sexo: $gender
                Profissão: $occupation
                Cidade: $city
                CEP: $zipCode
                Estado Civil: $maritalStatus
            """.trimIndent()

            // Exibindo a mensagem usando um Toast
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}