package com.example.demoapplication.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.demoapplication.fragments.CameraFragment
import com.example.demoapplication.fragments.dashboardmaincamera

class CameraAdapter(fm:FragmentManager,val totalcount:Int):FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        var fragment = Fragment()
        if(position==0) {
            fragment = CameraFragment()
            return fragment
        } else if (position==1) {
            fragment = dashboardmaincamera()
        }
            return fragment

    }

    override fun getCount(): Int {
        return totalcount
    }
}