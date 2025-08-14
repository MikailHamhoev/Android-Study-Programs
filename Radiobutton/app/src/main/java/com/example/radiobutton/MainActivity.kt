package com.example.radiobutton

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var radioGroup: RadioGroup
    private lateinit var radioButton: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        radioGroup = findViewById(R.id.rg)
        radioGroup.setOnCheckedChangeListener { radioGroup, id ->
            radioButton = findViewById(id)

            when(radioButton.id) {
                R.id.rb1 -> {
                    Toast.makeText(this@MainActivity, "Wrong! 4 = 2 * 2", Toast.LENGTH_SHORT).show()
                }
                R.id.rb2 -> {
                    Toast.makeText(this@MainActivity, "Wrong! 8 = 2 * 4", Toast.LENGTH_SHORT).show()
                }
                R.id.rb3 -> {
                    Toast.makeText(this@MainActivity, "Right! Your answer is correct!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}