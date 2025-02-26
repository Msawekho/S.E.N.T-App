package com.example.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.activity1.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.buttonClick.setOnClickListener{
            val name = binding.editTextTextPersonName.text.toString()
            val surname = binding.editTextTextPersonName2.text.toString()
            val email = binding.editTextTextPersonName3.text.toString()
            val pass = binding.editTextTextPassword.text.toString()

            if(name.isNotEmpty() && surname.isNotEmpty() && email.isNotEmpty() && pass.isNotEmpty()){
                firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener{
                    if(it.isSuccessful){
                        val intent =Intent( this, MainActivity2::class.java )
                        startActivity(intent)

                    }
                }
            }
            else {
                Toast.makeText( this, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()
            }
        }





        val buttonClick = findViewById<Button>(R.id.button_click)
        buttonClick.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        val buttonSignUp = findViewById<Button>(R.id.button_SIGNUP)
        buttonSignUp.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
}
}