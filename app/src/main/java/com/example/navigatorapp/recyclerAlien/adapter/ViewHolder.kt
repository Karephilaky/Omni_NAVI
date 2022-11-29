package com.example.navigatorapp.recyclerAlien.adapter

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigatorapp.recyclerAlien.alion
import com.example.navigatorapp.databinding.ItemPlayerBinding

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemPlayerBinding.bind(view)
    @SuppressLint("SetTextI18n")
    fun render(alion: alion){
        binding.tvEcPlayerName.text = alion.Name
        binding.tvEcPlayerAge.text = "Especie: " + alion.Especie.toString()
        Glide.with(binding.ivEcPlayer.context).load(alion.photo).into(binding.ivEcPlayer)
    }
}