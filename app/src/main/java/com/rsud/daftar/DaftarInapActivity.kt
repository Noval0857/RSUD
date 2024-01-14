package com.rsud.daftar

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.rsud.MainActivity
import com.rsud.R
import com.rsud.kamar.KamarInapActivity

class DaftarInapActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_inap)


        val backButton: ImageButton = findViewById(R.id.backButton)


        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val daftar : Button = findViewById(R.id.daftarInap)
        daftar.setOnClickListener {
            val intent = Intent(this, KamarInapActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}