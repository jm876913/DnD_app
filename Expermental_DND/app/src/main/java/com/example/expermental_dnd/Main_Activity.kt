package com.example.expermental_dnd

//package com.example.expermental_dnd

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RollButton = findViewById<Button>(R.id.RollButton)
        val resultsTextView = findViewById<TextView>(R.id.ResultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        RollButton.setOnClickListener {
           val rand = Random().nextInt(seekBar.progress)
            resultsTextView.text = rand.toString()
        }
    }
}
