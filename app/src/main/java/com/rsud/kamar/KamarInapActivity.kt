package com.rsud.kamar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rsud.R
import com.rsud.daftar.DaftarInapActivity
import com.rsud.item.GridItem
import com.rsud.item.GridKamar
import com.rsud.item.KamarAdapter

class KamarInapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kamar_inap)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val gridKamar = listOf(
            GridKamar("VIP", "Kosong : 0", "Tempat Tidur : 2"),
            GridKamar("Bedah", "Kosong : 0", "Tempat Tidur : 1"),
            GridKamar("Anak", "Kosong : 2", "Tempat Tidur : 7"),
            GridKamar("Dewasa", "Kosong : 4", "Tempat Tidur : 17"),
            GridKamar("ICU", "Kosong : 3", "Tempat Tidur : 6"),
            GridKamar("NICU", "Kosong : 1", "Tempat Tidur : 1"),
            GridKamar("PICU", "Kosong : 0", "Tempat Tidur : 1"),
            GridKamar("ISOLASI", "Kosong : 1", "Tempat Tidur : 3"),
            GridKamar("Bayi", "Kosong : 0", "Tempat Tidur : 1"),
        )

        val adapter = KamarAdapter(gridKamar)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        adapter.setOnItemClickListener { position ->
            // Handle item click here
            val selectedItem = gridKamar[position]
            if (selectedItem.t1 == "VIP") {
                // If the clicked item is VIP, navigate to the next activity and pass the ID
                val intent = Intent(this, DaftarInapActivity::class.java)
                intent.putExtra("t1", selectedItem.t1) // Assuming you have an "id" property in GridKamar
                startActivity(intent)
            }
        }
    }
}