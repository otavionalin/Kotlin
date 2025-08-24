package com.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLinear = findViewById<Button>(R.id.btnLinear)
        val btnConstraint = findViewById<Button>(R.id.btnConstraint)
        val btnFrame = findViewById<Button>(R.id.btnFrame)
        val btnTable = findViewById<Button>(R.id.btnTable)
        val btnGrid = findViewById<Button>(R.id.btnGrid)
        val btnScroll = findViewById<Button>(R.id.btnScroll)


        btnLinear.setOnClickListener {
            startActivity(Intent(this, LinearLayoutActivity::class.java))
        }
        btnConstraint.setOnClickListener {
            startActivity(Intent(this, ConstraintLayoutActivity::class.java))
        }
        btnFrame.setOnClickListener {
            startActivity(Intent(this, FrameLayoutActivity::class.java))
        }
        btnTable.setOnClickListener {
            startActivity(Intent(this, TableLayoutActivity::class.java))
        }
        btnGrid.setOnClickListener {
            startActivity(Intent(this, GridLayoutActivity::class.java))
        }
        btnScroll.setOnClickListener {
            startActivity(Intent(this, ScrollViewActivity::class.java))
        }
    }
}
