package com.rsud.item

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rsud.R

class KamarAdapter(private val gridKamar: List<GridKamar>) :
    RecyclerView.Adapter<KamarAdapter.GridViewHolder>() {

    private var onItemClick: ((Int) -> Unit)? = null

    fun setOnItemClickListener(listener: (Int) -> Unit) {
        onItemClick = listener
    }

    class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val t1: TextView = itemView.findViewById(R.id.t1)
        val t2: TextView = itemView.findViewById(R.id.t2)
        val t3: TextView = itemView.findViewById(R.id.t3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_kamar, parent, false)

        val viewHolder = GridViewHolder(view)

        // Set click listener for the whole item view
        viewHolder.itemView.setOnClickListener {
            onItemClick?.invoke(viewHolder.adapterPosition)
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val currentItem = gridKamar[position]
        holder.t1.text = currentItem.t1
        holder.t2.text = currentItem.t2
        holder.t3.text = currentItem.t3
    }

    override fun getItemCount(): Int {
        return gridKamar.size
    }
}
