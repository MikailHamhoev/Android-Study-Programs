package com.example.checkbox

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var checkBoxPascal: CheckBox
    private lateinit var checkBoxJava: CheckBox
    private lateinit var checkBoxKotlin: CheckBox
    private lateinit var buttonShow: Button
    private lateinit var textMessage: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        checkBoxPascal = findViewById(R.id.checkBox1)
        checkBoxJava = findViewById(R.id.checkBox2)
        checkBoxKotlin = findViewById(R.id.checkBox3)

        buttonShow = findViewById(R.id.button)
        textMessage = findViewById(R.id.textViewMessage)

        buttonShow.setOnClickListener {
            val sb = StringBuilder()
            sb.append(checkBoxPascal.text.toString() + " status is: " +
                    checkBoxPascal.isChecked + "\n")
            sb.append(checkBoxJava.text.toString() + " status is: " +
                    checkBoxJava.isChecked + "\n")
            sb.append(checkBoxKotlin.text.toString() + " status is: " +
                    checkBoxKotlin.isChecked + "\n")

            textMessage.text = sb.toString()
        }

    }
}