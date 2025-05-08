package com.example.utsadrian

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)

        val etNama = findViewById<EditText>(R.id.etNama)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val nama = etNama.text.toString()

            // Menampilkan log dan toast
            Log.d("Register", "Nama: $nama")
            Toast.makeText(this, "Berhasil daftar sebagai $nama", Toast.LENGTH_SHORT).show()

            // Intent ke GalleryActivity
            val intent = Intent(this, GalleryActivity::class.java)
            startActivity(intent)

            // (Opsional) Selesaikan activity ini agar tidak bisa kembali ke Register
            finish()
        }
    }
}
