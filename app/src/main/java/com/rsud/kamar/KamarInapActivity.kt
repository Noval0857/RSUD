package com.rsud.kamar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rsud.R
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
        )

        val adapter = KamarAdapter(gridKamar)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}