package com.example.mikal.metro

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

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

        // Avec kotlin inutile depuis une activity
//        val button = findViewById<Button>(R.id.button_login)


        button_login.setOnClickListener {
            val login = editText_Texte.text.toString()
            val password = editTextPassword.text.toString()

            if(login.isNotEmpty()&&password.isNotEmpty()){
                val alertDialog = AlertDialog.Builder(this)
                        .setTitle(R.string.login_success_title)
                        .setMessage(R.string.login_success_message)
                        .setPositiveButton(android.R.string.ok,
                                { dialogInterface: DialogInterface, buttonIndex: Int ->
                                    //callback du clic sur le bouton Ok
                                }).create()

                alertDialog.show()
            }

//            -> Afficher le nouvel écran

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

            finish()




        }


    }
}
