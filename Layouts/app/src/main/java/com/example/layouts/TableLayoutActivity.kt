package com.example.layouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class TableLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_layout)
        title = "TableLayout"
    }
}
