package com.rsud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import com.rsud.Daftar.DaftarInapActivity

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
    }
}