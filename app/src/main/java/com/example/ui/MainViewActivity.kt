package com.example.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_view)
        val userToken = intent.getStringExtra("userToken")
        val myPage = findViewById<ImageView>(R.id.myPage)
        val fragmentImage = FragmentImage()
        val fragmentClient = FragmentClient()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout, fragmentImage)
            .commit()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_view, fragmentClient)
            .commit()
    }
}