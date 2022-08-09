package com.example.appproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.appproject.ui.home.HomeFragment
import com.example.appproject.ui.project.ProjectFragment
import com.example.appproject.ui.square.SquareFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class AppActivity : AppCompatActivity() {

    private val squareFragment = SquareFragment()
    private val homeFragment = HomeFragment()
    private val projectFragment = ProjectFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onActivityNavigation()
    }


    private fun onActivityNavigation() {
        onReplace(homeFragment)
        findViewById<BottomNavigationView>(R.id.bottom_navigation).setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navi_button_home -> onReplace(homeFragment)
                R.id.navi_button_square -> onReplace(squareFragment)
                R.id.navi_button_project -> onReplace(projectFragment)
            }
            true
        }
    }


    private fun onReplace(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_activity_fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}