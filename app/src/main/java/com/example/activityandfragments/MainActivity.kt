package com.example.activityandfragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mButton = findViewById<Button>(R.id.button)

        mButton.setOnClickListener {
//            Toast.makeText(this, "Ура, у меня работает кнопочка", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }



}