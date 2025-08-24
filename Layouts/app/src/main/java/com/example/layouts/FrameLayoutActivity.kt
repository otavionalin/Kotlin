package com.example.layouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FrameLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout)
        title = "FrameLayout"
    }
}
