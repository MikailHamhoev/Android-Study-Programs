package com.example.fahrenheittocelsius

import android.os.Bundle
import android.text.InputFilter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var enterKelvin: EditText
    private lateinit var viewCelsius: TextView
    private lateinit var convertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        enterKelvin = findViewById(R.id.editTextFahrenheit)
        viewCelsius = findViewById(R.id.textViewCelsius)
        convertButton = findViewById(R.id.buttonConvert)

        enterKelvin.filters = arrayOf(InputFilter.LengthFilter(6))

        convertButton.setOnClickListener {

            if(enterKelvin.text.toString().isNotEmpty()) {
                viewCelsius.textSize = 48.0f
                viewCelsius.text = (enterKelvin.text.toString().toInt() + 273).toString()
            } else {
                viewCelsius.textSize = 24.0f
                viewCelsius.text = getString(R.string.empty_input_message)
            }
        }
    }
}