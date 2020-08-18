package com.example.myapplication.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class SharePhotoAdapter():RecyclerView.Adapter<SharePhotoAdapter.Photoholder>() {
    class Photoholder(photo:View):RecyclerView.ViewHolder(photo) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Photoholder {
        return Photoholder(LayoutInflater.from(parent.context).inflate(R.layout.photos,parent,false))

    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: Photoholder, position: Int) {

    }

}