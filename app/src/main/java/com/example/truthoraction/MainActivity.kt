package com.example.truthoraction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun infoClick(view: View) {
        val intent = Intent(this@MainActivity,InfoClick::class.java)
        startActivity(intent)

    }
    fun rulesClick(view: View) {
        val intent = Intent(this@MainActivity, RulesOfTheGame::class.java)
        startActivity(intent)
    }

    fun startClick(view: View) {
        val intent = Intent(this@MainActivity,StartTheGame::class.java)
        startActivity(intent)

    }
    fun tryeClick(view: View){
        val intent = Intent(this@MainActivity,True_Game::class.java)
        startActivity(intent)
    }
    fun actionClick(view: View){
        val intent = Intent(this@MainActivity,ActionGame::class.java)
         startActivity(intent)
    }
}