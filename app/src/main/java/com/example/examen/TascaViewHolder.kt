package com.example.examen

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TascaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val nom: TextView = itemView.findViewById(R.id.tvNom)
    private val categoria: TextView = itemView.findViewById(R.id.tvCategoria)
    private val data: TextView = itemView.findViewById(R.id.tvData)
    private val estat: TextView = itemView.findViewById(R.id.tvEstat)

    fun bind(tasca: Tasca) {
        nom.text = tasca.nom
        categoria.text = tasca.categoria
        data.text = tasca.data
        estat.text = tasca.estat


        itemView.setOnClickListener {
            onItemClick(tasca)
        }
    }
}