package com.example.layouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ConstraintLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)
        title = "ConstraintLayout"
    }
}
