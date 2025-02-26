package com.example.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val buttonAdd = findViewById<Button>(R.id.button_AddTicket)
        buttonAdd.setOnClickListener{
            val intent = Intent(this,MainActivity8::class.java)
            startActivity(intent)

        }
        val buttonViewEvents = findViewById<Button>(R.id.button_viewTickets)
        buttonViewEvents.setOnClickListener{
            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
    }
}