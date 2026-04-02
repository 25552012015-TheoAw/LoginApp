package com.example.loginapp // Sesuaikan dengan package kamu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Pastikan mengarah ke activity_home, bukan R.main
        setContentView(R.layout.activity_home)
    }
}