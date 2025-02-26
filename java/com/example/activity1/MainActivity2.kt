package com.example.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.activity1.databinding.ActivityMain2Binding
import com.google.firebase.auth.FirebaseAuth

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.buttonSignUp.setOnClickListener() {
            val email = binding.editTextTextPersonName4.text.toString()
            val pass = binding.editTextTextPassword2.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty()) {
                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val buttonClick = findViewById<Button>(R.id.button_click)
                        buttonClick.setOnClickListener {
                            val intent = Intent(this, MainActivity3::class.java)
                            startActivity(intent)

                        }
                    }
                }
            } else {
                Toast.makeText(this, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()
            }
        }
        val buttonCheck = findViewById<Button>(R.id.buttonSign_Up)
        buttonCheck.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

        val buttonClick = findViewById<Button>(R.id.button_LogIn)
        buttonClick.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)

        }
    }
}