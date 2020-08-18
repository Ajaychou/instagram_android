package com.example.demoapplication.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demoapplication.Interfaces.DashBoardItemClickListener
import com.example.demoapplication.activities.StatusAdapter
import com.example.demoapplication.adapter.DashBoardAdapter
import com.example.myapplication.R
import com.example.myapplication.activities.ProfileActivity
import kotlinx.android.synthetic.main.dashboardmaincameralayout.*

class dashboardmaincamera : Fragment(), DashBoardItemClickListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.dashboardmaincameralayout, container, false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        status()

    }

    private fun init() {
        val linearLayoutManager = LinearLayoutManager(context)
        val dashboardAdapter = DashBoardAdapter(this)
        recyclerview.layoutManager = linearLayoutManager;
        recyclerview.adapter = dashboardAdapter;
    }

    private fun status() {
        val status = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)
        val statuadapter = StatusAdapter()
        statusrecyclerviewid.layoutManager = status
        statusrecyclerviewid.adapter = statuadapter

    }

    override fun onItemClick() {
        val intent =Intent(context ,ProfileActivity::class.java)
        startActivity(intent)

    }
}