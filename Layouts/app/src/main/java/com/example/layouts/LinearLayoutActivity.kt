package com.example.layouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LinearLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)
        title = "LinearLayout"
    }
}
