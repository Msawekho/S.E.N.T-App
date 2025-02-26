package com.example.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.provider.MediaStore
import android.widget.ImageView
import android.graphics.Bitmap
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity3 : AppCompatActivity() {

    private val REQUEST_IMAGE_CAPTURE = 1
    private lateinit var photoImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val cameraButton: Button = findViewById(R.id.button_TakePhoto)
        photoImageView = findViewById(R.id.button_TakePhoto)

        cameraButton.setOnClickListener {
            dispatchTakePictureIntent()
        }
    }

        private fun dispatchTakePictureIntent() {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (takePictureIntent.resolveActivity(packageManager) != null) {

                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }


        val buttonEvents = findViewById<Button>(R.id.button_TakePhoto)
        buttonEvents.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val buttonClothes = findViewById<Button>(R.id.button_Clothes)
        buttonClothes.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        val buttonTickets = findViewById<Button>(R.id.button_tickets)
        buttonTickets.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)

        }
        val buttonCategory = findViewById<Button>(R.id.button_Category)
        buttonCategory.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)

        }
            val buttonAddEvent = findViewById<Button>(R.id.button_AddEvent)
            buttonCategory.setOnClickListener {
                val intent = Intent(this, MainActivity8::class.java)
                startActivity(intent)

            }
    }
    override fun
            onActivityResult(requestCode: Int,
                             resultCode: Int,
                             data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK){
            val imageBitmap = data?.extras?.get("data") as Bitmap
            photoImageView.setImageBitmap(imageBitmap)
        }
    }
}
