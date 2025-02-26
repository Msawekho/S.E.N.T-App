package com.example.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.activity1.databinding.ActivityMain7Binding

class MainActivity7 : AppCompatActivity() {

    private lateinit var binding: ActivityMain7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val buttonAdd = findViewById<Button>(R.id.button_AddEvent)
        buttonAdd.setOnClickListener{
            val intent = Intent(this,MainActivity7::class.java)
            startActivity(intent)

        }
        val buttonViewEvents = findViewById<Button>(R.id.button_viewEvents)
        buttonViewEvents.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }

}