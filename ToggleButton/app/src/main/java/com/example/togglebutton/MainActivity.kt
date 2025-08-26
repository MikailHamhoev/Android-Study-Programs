package com.example.togglebutton

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var toggleButton: ToggleButton
    private lateinit var message: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        message = findViewById(R.id.message)
        toggleButton = findViewById(R.id.toggleButton)

        toggleButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                message.visibility = View.VISIBLE
            } else {
                message.visibility = View.INVISIBLE
            }
        }
    }
}