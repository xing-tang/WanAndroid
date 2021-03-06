package com.open.home.mvp.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.open.home.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportFragmentManager
            .beginTransaction()
            .replace(
                R.id.home_fl_layout,
                HomeFragment.newInstance()
            )
            .commit()
    }

    companion object {

        @JvmStatic
        fun getIntent(activity: Activity) =
            Intent(activity, HomeActivity::class.java).apply {

            }
    }
}
