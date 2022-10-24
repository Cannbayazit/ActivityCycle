package com.canbayazit.anotheractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("onCreate çagrıldı")
    }

    override fun onStart() {
        super.onStart()
        println("onStart çagrıldı")

    }

    override fun onResume() {
        super.onResume()
        println("onResume çagrıldı")

    }

    override fun onPause() {
        super.onPause()
        println("onPause çagrıldı")

    }

    override fun onStop() {
        super.onStop()
        println("onStop çagrıldı")

    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy çagrıldı")

    }


    fun aktiviteDegistir(view : View){

        val kullaniciVerisi = editText.text.toString()



        val intent = Intent(applicationContext,SecondActivity::class.java)
        intent.putExtra("yollananVeri",kullaniciVerisi)
        startActivity(intent)
        finish()
    }
}