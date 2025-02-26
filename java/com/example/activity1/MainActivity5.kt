package com.example.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val buttonEvents = findViewById<Button>(R.id.button_Events)
        buttonEvents.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        val buttonClothes = findViewById<Button>(R.id.button_Clothes)
        buttonClothes.setOnClickListener{
            val intent = Intent(this,MainActivity6::class.java)
            startActivity(intent)
        }
        val buttonTickets = findViewById<Button>(R.id.button_Tickets)
        buttonTickets.setOnClickListener{
            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)

        }
        val buttonCategory = findViewById<Button>(R.id.button_category)
        buttonCategory.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)

        }
        val buttonAddTick = findViewById<Button>(R.id.button_AddTickets)
        buttonAddTick.setOnClickListener{
            val intent = Intent(this,MainActivity8::class.java)
            startActivity(intent)

        }
    }
}