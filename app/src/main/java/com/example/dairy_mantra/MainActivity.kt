package com.example.dairy_mantra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.newAnimalbutton)
        button.setOnClickListener{
            val intent = Intent(this, SecondScreen_BasicDetail::class.java)
            startActivity(intent)
        }


    }
}

