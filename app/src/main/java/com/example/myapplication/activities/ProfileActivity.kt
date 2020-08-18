package com.example.myapplication.activities

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.InstagramActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.layoutdemo.*

class ProfileActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutdemo)
    }

    override fun onClick(p0: View?) {
    }
}
