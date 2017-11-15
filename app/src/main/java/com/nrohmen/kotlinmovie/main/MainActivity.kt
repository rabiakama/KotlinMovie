package com.nrohmen.kotlinmovie.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nrohmen.kotlinmovie.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setToolbar()
        loadListingFragment(savedInstanceState)
    }

    private fun setToolbar() {
        supportActionBar?.title = getString(R.string.app_name)
    }

    private fun loadListingFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.main_container, MainFragment(), MainFragment::class.simpleName)
                    .commit()
        }
    }
}
