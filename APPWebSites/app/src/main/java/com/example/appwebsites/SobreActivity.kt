package com.example.appwebsites

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sobre.*

class SobreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        btvoltar.setOnClickListener { v: View ->

            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent);

        }
        val sharedPreferences = getSharedPreferences("statics", Context.MODE_PRIVATE)

        mercadoLivre.text = "MercadoLivre: ${sharedPreferences.getInt("clickMercadoLivre",0)}"
        buscaPe.text = "BusacaPe: ${sharedPreferences.getInt("clickBuscaPe",0)}"
        eBay.text = "eBay: ${sharedPreferences.getInt("clickeBay",0)}"
        webMotors.text = "WebMotors: ${sharedPreferences.getInt("clickWebMotors",0)}"
        magalu.text = "Magalu: ${sharedPreferences.getInt("clickMagalu",0)}"
        netShoes.text = "Netshoes: ${sharedPreferences.getInt("clickNetshoes",0)}"
        americanas.text = "Americanas: ${sharedPreferences.getInt("clickAmericanas",0)}"
        subMarino.text = "Subamrino: ${sharedPreferences.getInt("clickSubmarino",0)}"


        btApagar.setOnClickListener { v: View? ->
            sharedPreferences.edit().clear().apply()

            recreate()
        }
    }
}

