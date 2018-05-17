package com.example.mikal.metro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val metros = arrayListOf<Metro>()

        metros.add(Metro("1", "Ligne 1", "La defense / Vincennes", "62"))
        metros.add(Metro("2", "Ligne 2", "Porte dauphine", "63"))
        metros.add(Metro("3", "Ligne 3", "Gallieni", "64"))
    }





}
