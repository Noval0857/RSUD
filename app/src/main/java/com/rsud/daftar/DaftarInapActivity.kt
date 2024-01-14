package com.rsud.daftar

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.google.android.material.textfield.TextInputEditText
import com.rsud.HasilDaftarActivity
import com.rsud.MainActivity
import com.rsud.R

class DaftarInapActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_inap)

        val t1 = intent.getStringExtra("t1")

        val backButton: ImageButton = findViewById(R.id.backButton)

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val daftar: Button = findViewById(R.id.daftarInap)
        daftar.setOnClickListener {
            val nama = findViewById<TextInputEditText>(R.id.nama).text.toString()
            val nik = findViewById<TextInputEditText>(R.id.nik).text.toString()
            val ttl = findViewById<TextInputEditText>(R.id.ttl).text.toString()
            val noTelp = findViewById<TextInputEditText>(R.id.noTelp).text.toString()
            val noBpjs = findViewById<TextInputEditText>(R.id.noBpjs).text.toString()

            val intent = Intent(this, HasilDaftarActivity::class.java).apply {
                putExtra("nama", nama)
                putExtra("nik", nik)
                putExtra("ttl", ttl)
                putExtra("noTelp", noTelp)
                putExtra("noBpjs", noBpjs)
                putExtra("t1", t1)
            }
            startActivity(intent)
            finish()
        }
    }
}
