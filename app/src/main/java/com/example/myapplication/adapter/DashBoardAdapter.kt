package com.example.demoapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demoapplication.Interfaces.DashBoardItemClickListener
import com.example.myapplication.R

class DashBoardAdapter(val dashBoardItemClickListener: DashBoardItemClickListener): RecyclerView.Adapter<DashBoardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(
           LayoutInflater.from(parent.context).inflate(
               R.layout.dashboardadapter,
               parent,
               false
           )
       )
    }

    override fun getItemCount(): Int {
       return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
holder.itemView.setOnClickListener { dashBoardItemClickListener.onItemClick() }
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
}