package com.example.demoapplication.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.demoapplication.fragments.ProfilePhotoesAndVideos
import com.example.demoapplication.fragments.ProfilePhotosFragment

class ProfileAdapter(fm:FragmentManager,val total:Int):FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        var fragment = Fragment()
        if(position==0){
            fragment =
                ProfilePhotosFragment()
            return fragment
        }
        else if(position==1){
            fragment = ProfilePhotoesAndVideos()
        }
        return fragment
    }

    override fun getCount(): Int {
        return  10
    }
}