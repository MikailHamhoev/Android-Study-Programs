package com.example.greetings

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var myButton: Button
    private lateinit var myTextView: TextView
    private lateinit var myEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        myButton = findViewById(R.id.button)
        myTextView = findViewById(R.id.textView)
        myEditText = findViewById(R.id.editText)

        myButton.text = getString(R.string.button)
        myEditText.hint = getString(R.string.hint)

        myButton.setOnClickListener {
            myTextView.visibility = View.VISIBLE
            val input = myEditText.text.toString().replaceFirstChar { it.uppercase() }

            if (input.isNotEmpty()) {
                myTextView.text = getString(R.string.greetings, input)
            } else {
                myTextView.text = getString(R.string.empty_input_message)
            }
        }
    }
}