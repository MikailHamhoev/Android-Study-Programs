package com.example.seekbar

import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var rating: SeekBar
    private lateinit var message: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        rating = findViewById(R.id.seekBar_rating)
        message = findViewById(R.id.text_view_message)

        rating.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                message.text = "Rate = " + rating.progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?){
                // Nothing happens
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                message.text = "Final rate = " + seekBar!!.progress.toString()
            }
        })
    }
}