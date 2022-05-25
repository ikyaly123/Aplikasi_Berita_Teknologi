package com.tubesmobile.newsapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.tubesmobile.newsapp.R
import com.tubesmobile.newsapp.fragment.*
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation.setItemSelected(R.id.menuTechnology, true)

        setupFragment(FragmentTechnology())

        //open fragment
        bottomNavigation.setOnItemSelectedListener(object : ChipNavigationBar.OnItemSelectedListener {
            override fun onItemSelected(id: Int) {
                when (id) {
                    R.id.menuTechnology -> setupFragment(FragmentTechnology())
                    R.id.menuSearch -> setupFragment(FragmentSearch())
                }
            }
        })
    }

    private fun setupFragment(fragment : Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentLayout, fragment)
        transaction.commit()
    }

}