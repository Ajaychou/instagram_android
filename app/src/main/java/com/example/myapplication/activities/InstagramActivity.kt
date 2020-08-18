package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.demoapplication.fragments.FragmentSignUp
import com.example.myapplication.R
import kotlinx.android.synthetic.main.instagramlayout.*

class InstagramActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.instagramlayout)
        userSign()
    }

    public fun userSign() {
        tvsign.setOnClickListener(this)
        but.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tvsign -> {
                framelayout_signup.visibility = View.VISIBLE
                supportFragmentManager.beginTransaction()
                    .add(
                        R.id.framelayout_signup,
                        FragmentSignUp(), "SignUp").addToBackStack(null)
                    .commit()
            }
            R.id.but -> {
                val intent = Intent(this@InstagramActivity, DashBoardActivity::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        framelayout_signup.visibility = View.GONE
        supportFragmentManager.beginTransaction().remove(FragmentSignUp());
        supportFragmentManager.popBackStack()

    }
}