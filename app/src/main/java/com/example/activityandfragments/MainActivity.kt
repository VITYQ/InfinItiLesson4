package com.example.activityandfragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager
            .replace(R.id.container_main, Fragment1())
            .commit()

        val mBottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        mBottomNav.setOnItemSelectedListener {
            val fragmentManager = supportFragmentManager.beginTransaction()

            when(it.itemId){
                R.id.page1 ->{
                    fragmentManager
                        .replace(R.id.container_main, Fragment1())
                        .commit()
                    true
                }
                R.id.page2 -> {
                    fragmentManager
                        .replace(R.id.container_main, Fragment1())
                        .commit()
                    true
                }
                R.id.page3 -> {
                    true
                }
                else -> false
            }
        }


    }



}