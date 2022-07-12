package com.example.howlstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.howlstagram.navigation.AlarmFragment
import com.example.howlstagram.navigation.DetailViewFragment
import com.example.howlstagram.navigation.GridFragment
import com.example.howlstagram.navigation.UserFragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_navigation.setOnItemSelectedListener { it ->
            when (it.itemId) {
                R.id.action_home -> {
                    var detailViewFragment = DetailViewFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_content, detailViewFragment).commit()
                    true
                }
                R.id.action_search -> {
                    var gridFragment = GridFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_content, gridFragment).commit()
                    true
                }
                R.id.action_add_photo -> {
                    true
                }
                R.id.action_favorite_alarm -> {
                    var alarmFragment = AlarmFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_content, alarmFragment).commit()
                    true
                }
                R.id.action_account -> {
                    var userFragment = UserFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_content, userFragment).commit()
                    true
                }
                else -> false
            }
        }
    }
}