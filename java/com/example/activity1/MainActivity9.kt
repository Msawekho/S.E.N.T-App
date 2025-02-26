package com.example.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        val buttonAdd = findViewById<Button>(R.id.button_AddFit)
        buttonAdd.setOnClickListener{
            val intent = Intent(this,MainActivity9::class.java)
            startActivity(intent)

        }
        val buttonViewEvents = findViewById<Button>(R.id.button_viewFit)
        buttonViewEvents.setOnClickListener{
            val intent = Intent(this,MainActivity6::class.java)
            startActivity(intent)
        }
    }
}