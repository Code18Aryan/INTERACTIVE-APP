package com.example.interactiveuiapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.linearLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val dark = findViewById<Button>(R.id.btnDark)
        val light = findViewById<Button>(R.id.btnLight)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)


        dark.setOnClickListener {

            layout.setBackgroundResource(R.color.black)
        }

        light.setOnClickListener {

             layout.setBackgroundResource(R.color.white)
        }





    }
}