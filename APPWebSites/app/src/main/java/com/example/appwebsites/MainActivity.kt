package com.example.appwebsites

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URL
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btmercadolivre.setOnClickListener { v: View? ->

            saveClickLoja("clickMercadoLivre")


            acessarURL("https://www.mercadolivre.com.br/")

        }
        btbuscape.setOnClickListener { v: View? ->

            saveClickLoja("clickBuscaPe")

            acessarURL("https://www.buscape.com.br/")

        }
        bteBay.setOnClickListener { v: View? ->

            saveClickLoja("clickeBay")

            acessarURL("https://www.ebay.com/")

        }
        btwebmotors.setOnClickListener { v: View? ->

            saveClickLoja("clickWebMotors")

            acessarURL("https://www.webmotors.com.br/")

        }
        btmagalu.setOnClickListener { v: View? ->

            saveClickLoja("clickMagalu")

            acessarURL("https://www.magazineluiza.com.br/")

        }
        btnetShoes.setOnClickListener { v: View? ->

            saveClickLoja("clickNetshoes")

            acessarURL("https://www.netshoes.com.br/")

        }
        btamericanas.setOnClickListener { v: View? ->

            saveClickLoja("clickAmericanas")

            acessarURL("https://www.americanas.com.br/")

        }
        btsubmarino.setOnClickListener { v: View? ->

            saveClickLoja("clickSubmarino")

            acessarURL("https://www.submarino.com.br/")

        }
        btsobre.setOnClickListener { v: View? ->

            var intent = Intent(this, SobreActivity::class.java)

            startActivity(intent);

        }

    }

    fun acessarURL(site: String){
        val intent = Intent(this, WebActivity::class.java)
        intent.putExtra("url",site)
        startActivity(intent)
    }

    fun saveClickLoja(clickName: String){
        val sharedPreferences = getSharedPreferences("statics", Context.MODE_PRIVATE)

        val contador = sharedPreferences.getInt(clickName,0)

        sharedPreferences.edit().putInt(clickName, contador + 1).apply()


    }

}