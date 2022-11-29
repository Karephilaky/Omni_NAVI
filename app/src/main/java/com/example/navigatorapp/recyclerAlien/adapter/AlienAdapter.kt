package com.example.navigatorapp.recyclerAlien.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navigatorapp.recyclerAlien.alion
import com.example.navigatorapp.R

class AlienAdapter(private val ecPlayersList:List<alion>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_player, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = ecPlayersList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = ecPlayersList.size
}