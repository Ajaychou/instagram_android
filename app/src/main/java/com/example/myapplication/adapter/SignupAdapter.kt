package com.example.demoapplication.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.demoapplication.fragments.EmailAdress
import com.example.demoapplication.fragments.PhoneNumberSignUpFragment

class SignupAdapter(fm: FragmentManager, val totalCount: Int) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        var fragment = Fragment()
        if (position == 0) {
            fragment =
                PhoneNumberSignUpFragment()
            return fragment
        } else if (position == 1) {
            fragment= EmailAdress()
        }
        return fragment
    }


    override fun getCount(): Int {
        return totalCount
    }

}
