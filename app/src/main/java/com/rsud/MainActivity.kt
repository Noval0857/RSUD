package com.rsud

import GridAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rsud.item.GridItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val gridItems = listOf(
            GridItem("Rawat Inap", R.drawable.rawatinap, R.color.rawat_inap),
            GridItem("Rawat Jalan", R.drawable.docter, R.color.rawat_jalan),
            GridItem("Poli Klinik", R.drawable.poliklinik, R.color.poli_klinik),
            GridItem("Apotik", R.drawable.apotik, R.color.apotik)
        )

        val adapter = GridAdapter(gridItems)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}