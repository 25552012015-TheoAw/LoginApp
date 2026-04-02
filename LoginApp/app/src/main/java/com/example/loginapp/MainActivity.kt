package com.example.loginapp
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            // Validasi Sederhana
            if (username == "admin" && password == "admin123") {

                // 1. Tampilkan Toast (Pesan melayang)
                Toast.makeText(this, "Selamat Datang, $username!", Toast.LENGTH_SHORT).show()

                // 2. Berpindah ke HomeActivity (Intent)
                val pindahHalaman = Intent(this, HomeActivity::class.java)
                startActivity(pindahHalaman)

                // 3. (Opsional) Tutup MainActivity agar user tidak bisa 'Back' ke login lagi
                finish()

            } else {
                // Jika salah, beri peringatan
                etPassword.error = "Password atau Username Salah"
                Toast.makeText(this, "Login Gagal!", Toast.LENGTH_SHORT).show()
            }
        }
    }
    }
