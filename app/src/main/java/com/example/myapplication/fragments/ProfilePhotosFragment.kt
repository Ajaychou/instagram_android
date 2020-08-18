package com.example.demoapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapter.SharePhotoAdapter
import kotlinx.android.synthetic.main.shareprofilephotos.*

class ProfilePhotosFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.shareprofilephotos,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        share()
    }
    private fun share(){
        val linearmanager = GridLayoutManager(context,2)
        val sharephotoadapter = SharePhotoAdapter()
        photesrecycleview.layoutManager = linearmanager
        photesrecycleview.adapter = sharephotoadapter
    }

}