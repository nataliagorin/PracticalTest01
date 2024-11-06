package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var count1 = 0
    private var count2 = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val textField1 = findViewById<TextView>(R.id.textField1)
        val textField2 = findViewById<TextView>(R.id.textField2)

        button1.setOnClickListener {
            count1++
            textField1.text = count1.toString()
        }

        button2.setOnClickListener {
            count2++
            textField2.text = count2.toString()
        }
    }
}