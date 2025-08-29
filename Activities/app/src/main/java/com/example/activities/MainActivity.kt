package com.example.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var goToButton: Button
    private lateinit var textViewResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val getResult =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                if (it.resultCode == Constants.RESULT_CODE) {
                    val message = it.data!!.getStringExtra(Constants.INTENT_MESSAGE2_KEY)
                    textViewResult.text = message
                }
            }

        textViewResult = findViewById(R.id.textView)
        goToButton = findViewById(R.id.button_go_to_act)
        goToButton.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra(Constants.INTENT_MESSAGE_KEY, "Hello from the first Activity!")
            intent.putExtra(Constants.INTENT_MESSAGE2_KEY, "How was your day?")
            intent.putExtra(Constants.INTENT_DATA_NUMBER, 3.14)
            getResult.launch(intent)
        }
    }
}