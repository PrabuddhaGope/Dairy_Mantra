package com.example.dairy_mantra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class SecondScreen_BasicDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen_basic_detail)

        lateinit var spinnerAnimalType : Spinner

        spinnerAnimalType = findViewById(R.id.spinnerAnimalTypeOptions)

        val animalTypeOptions = arrayOf("Cow", "Buffalo")

        spinnerAnimalType.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, animalTypeOptions)

        spinnerAnimalType.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }
}