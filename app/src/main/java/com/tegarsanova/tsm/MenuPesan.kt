package com.tegarsanova.tsm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MenuPesan : AppCompatActivity(){
    override fun onCreate (savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var imgProfil = findViewById(R.id.imgProfil) as ImageView

        imgProfil.setOnClickListener {
            startActivity(Intent(this, Profil::class.java))
        }

        var imgHistory = findViewById(R.id.imgKalkulator) as ImageView

        imgHistory.setOnClickListener {
            Toast.makeText(this@MenuPesan,"Mohon maaf, fitur Riwayat sedang dalam pengembangan", Toast.LENGTH_LONG).show()
        }

        var imgCatatan = findViewById(R.id.imgCatatan) as ImageView

        imgCatatan.setOnClickListener {
            startActivity(Intent(this, Catatan::class.java))
        }


        var btnSignOut = findViewById(R.id.sign_out) as Button

        btnSignOut.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            Toast.makeText(this@MenuPesan,"Sign Out Berhasil", Toast.LENGTH_LONG).show()
        }
    }
}