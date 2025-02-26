package com.example.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.activity1.databinding.ActivityMain4Binding
import com.google.firebase.auth.FirebaseAuth

class MainActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityMain4Binding
    private lateinit var firebaseAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_main4)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.buttonCategories.setOnClickListener {
            val CatName = binding.editTextTextPersonName5.text.toString()
            val CatType = binding.editTextTextPersonName6.text.toString()
            val location = binding.editTextTextPersonName7.text.toString()


            var info = CategoryInfo(CatName,CatType,location)

            if(CatName.isNotEmpty() && CatType.isNotEmpty() && location.isNotEmpty()){
              //  firebaseAuth.child(CatName).setValue(info)
                fun saveInfo(CatName: String, CatType:String, location:String) {
                    val db = FirebaseAuth.getInstance()
                    val info: MutableMap<String, Any> = HashMap()
                    info["CatName"] = CatName
                    info["CatType"] = CatType
                    info["location"] = location



                }

               }
            }

        val buttonCategory = findViewById<Button>(R.id.button_Categories)
        buttonCategory.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)

        }
        val buttonView = findViewById<Button>(R.id.button_view)
        buttonView.setOnClickListener{
            val intent = Intent(this,MainActivity7::class.java)
            startActivity(intent)
        }
}
}