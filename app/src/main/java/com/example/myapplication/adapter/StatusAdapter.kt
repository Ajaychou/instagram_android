package com.example.demoapplication.activities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class StatusAdapter : RecyclerView.Adapter<StatusAdapter.StatusHolder>(){
    class StatusHolder (statusview : View) :RecyclerView.ViewHolder(statusview) {

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        return StatusHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.statusimageadapterlayout,parent,false)
        )

    }

    override fun getItemCount(): Int {
        return 10

    }

    override fun onBindViewHolder(holder: StatusHolder, position: Int) {

    }


}