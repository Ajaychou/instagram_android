package com.example.demoapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.demoapplication.adapter.SignupAdapter
import com.example.myapplication.R
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragmentlayout.*

class FragmentSignUp : Fragment(), TabLayout.BaseOnTabSelectedListener<TabLayout.Tab> {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragmentlayout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        tabLayout.addTab(tabLayout.newTab().setText("Phone Number"))
        tabLayout.addTab(tabLayout.newTab().setText("Email Address"))
        val signUpAdapter = SignupAdapter(
            fragmentManager!!,
            tabLayout.tabCount
        )
        viewPager_signUp.adapter = signUpAdapter
        viewPager_signUp.setCurrentItem(0)
        tabLayout.addOnTabSelectedListener(this)
    }

    override fun onTabReselected(p0: TabLayout.Tab?) {
    }

    override fun onTabUnselected(p0: TabLayout.Tab?) {
    }

    override fun onTabSelected(p0: TabLayout.Tab?) {
        viewPager_signUp.setCurrentItem(p0?.position!!)
    }
}
