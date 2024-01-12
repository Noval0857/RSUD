package com.rsud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.rsud.Daftar.DaftarInapActivity
import com.rsud.Daftar.DaftarJalanActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pindahButton: AppCompatButton = findViewById(R.id.pindah)

        // Menambahkan listener untuk klik pada tombol
        pindahButton.setOnClickListener {
            // Membuat Intent untuk berpindah ke DaftarInapActivity
            val intent = Intent(this, DaftarInapActivity::class.java)
            // Memulai aktivitas baru
            startActivity(intent)
        }

        val pindahJalanActivity : AppCompatButton = findViewById(R.id.pindah1)

        pindahJalanActivity.setOnClickListener {
            val intent = Intent(this, DaftarJalanActivity::class.java)
            startActivity(intent)
        }
    }
}