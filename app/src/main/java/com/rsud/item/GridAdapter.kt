import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rsud.R
import com.rsud.apotek.ApotekActivity
import com.rsud.daftar.DaftarJalanActivity
import com.rsud.daftar.DaftarPoliKlinikActivity
import com.rsud.item.GridItem
import com.rsud.kamar.KamarInapActivity

class GridAdapter(private val gridItems: List<GridItem>) :
    RecyclerView.Adapter<GridAdapter.GridViewHolder>() {

    class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layout: LinearLayout = itemView.findViewById(R.id.layout_grid)
        val imageView: ImageView = itemView.findViewById(R.id.image_grid)
        val textView: TextView = itemView.findViewById(R.id.text_grid)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_item, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val currentItem = gridItems[position]
        holder.layout.setBackgroundResource(currentItem.backgroundColorResId)
        holder.imageView.setImageResource(currentItem.imageResId)
        holder.textView.text = currentItem.title

        holder.itemView.setOnClickListener {
            // Handle the click event
            val context = holder.itemView.context
            when (currentItem.title) {
                "Rawat Inap" -> context.startActivity(Intent(context, KamarInapActivity::class.java))
                "Rawat Jalan" -> context.startActivity(Intent(context, DaftarJalanActivity::class.java))
                "Poli Klinik" -> context.startActivity(Intent(context, DaftarPoliKlinikActivity::class.java))
                "Apotik" -> context.startActivity(Intent(context, ApotekActivity::class.java))
            }
        }
    }

    override fun getItemCount(): Int {
        return gridItems.size
    }
}
