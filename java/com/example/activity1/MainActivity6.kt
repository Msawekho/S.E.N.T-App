package com.example.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

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
        val btnTicket = findViewById<Button>(R.id.button_ticket)
        btnTicket.setOnClickListener{
            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)

        }
        val btnCategory = findViewById<Button>(R.id.button_category)
        btnCategory.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)

        }
        val btnClothes = findViewById<Button>(R.id.button_AddClothes)
        btnClothes.setOnClickListener{
            val intent = Intent(this,MainActivity9::class.java)
            startActivity(intent)

        }
    }
}