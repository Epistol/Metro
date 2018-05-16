package com.example.mikal.metro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 1 - On le charge
        // 2 - On le lie à l'activité
        // 3 - On charge la content view
        setContentView(R.layout.activity_main)

        // Couleur :
        // R.color.colorAccent

        // Accès a une string depuis le code
        // R.string.app_name
    }
}
