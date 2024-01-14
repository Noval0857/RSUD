package com.rsud

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HasilDaftarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_daftar)

        // Retrieve data from Intent
        val nama = intent.getStringExtra("nama")
        val nik = intent.getStringExtra("nik")
        val ttl = intent.getStringExtra("ttl")
        val noTelp = intent.getStringExtra("noTelp")
        val noBpjs = intent.getStringExtra("noBpjs")
        val t1 = intent.getStringExtra("t1")

        // Update TextViews in the layout
        val namaTextView: TextView = findViewById(R.id.nama)
        val nikTextView: TextView = findViewById(R.id.nik)
        val ttlTextView: TextView = findViewById(R.id.ttl)
        val noTelpTextView: TextView = findViewById(R.id.noTelp)
        val noBpjsTextView: TextView = findViewById(R.id.noBpjs)
        val t1text: TextView = findViewById(R.id.ruangan)

        namaTextView.text = "Nama: $nama"
        nikTextView.text = "NIK: $nik"
        ttlTextView.text = "Tempat Tanggal Lahir: $ttl"
        noTelpTextView.text = "Nomor Telpon: $noTelp"
        noBpjsTextView.text = "No BPJS: $noBpjs"
        t1text.text = "Ruangan: $t1"
    }
}
