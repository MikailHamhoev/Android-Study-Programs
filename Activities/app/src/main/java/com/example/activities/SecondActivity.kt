package com.example.activities

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    private lateinit var textViewDataIntent: TextView
    private lateinit var button_go_back: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        textViewDataIntent = findViewById(R.id.view_data)
        button_go_back = findViewById(R.id.button_go_back)

        button_go_back.setOnClickListener {
            val intent = intent
            intent.putExtra(Constants.INTENT_MESSAGE2_KEY, "Hello from the second Activity!")
            setResult(Constants.RESULT_CODE, intent)
            finish()
        }

        val data = intent.extras

        data?.let {
            val message = data.getString(Constants.INTENT_MESSAGE_KEY)
            val message2 = data.getString(Constants.INTENT_MESSAGE2_KEY)
            val number = data.getDouble(Constants.INTENT_DATA_NUMBER)

            textViewDataIntent.text = message + "\n" + message2 + "\n" + number
        }
    }
}