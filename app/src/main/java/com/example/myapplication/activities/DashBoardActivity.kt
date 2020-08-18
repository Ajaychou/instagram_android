package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.demoapplication.adapter.CameraAdapter
import com.example.demoapplication.adapter.DashBoardAdapter
import com.example.myapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.dashboard.*

class DashBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
        //    camera()
        drawerData()
    }

    //    private fun camera(){
//        val cameraadapter = CameraAdapter(supportFragmentManager,2)
//        viewpagerdashboard.adapter = cameraadapter
//        viewpagerdashboard.setCurrentItem(1)
//
//    }
//
    private fun drawerData() {

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_search, R.id.navigation_like, R.id.navigation_plus,
                R.id.navigation_circle
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        nav_view.setupWithNavController(navController)

    }
}