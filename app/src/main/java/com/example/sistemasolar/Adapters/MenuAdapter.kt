package com.example.sistemasolar.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sistemasolar.DetalleActivity
import com.example.sistemasolar.R

class MenuAdapter(var menu: List<MenuData>) : RecyclerView.Adapter<MenuAdapter.myViewHolder>() {
    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var titulo = view.findViewById<TextView>(R.id.tvTitleMain)
        var subtitulo = view.findViewById<TextView>(R.id.tvSubtitleMain)
        var distancia = view.findViewById<TextView>(R.id.tvDistanceMain)
        var img = view.findViewById<ImageView>(R.id.ivImgMain)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.menu_item, parent, false)
        return myViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.titulo.text = menu[position].titulo
        holder.subtitulo.text = menu[position].subtitulo
        holder.distancia.text = menu[position].distancia
        holder.img.setImageResource(menu[position].images)

        //Vista Menu Detalles
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetalleActivity::class.java)
            intent.putExtra("detalles", menu[position])
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return menu.size

    }
}