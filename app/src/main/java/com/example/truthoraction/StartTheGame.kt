package com.example.truthoraction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StartTheGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_the_game)
    }
    fun tryeClick(view: View){
        val intent = Intent(this@StartTheGame,True_Game::class.java)
        startActivity(intent)}

    fun actionClick(view: View){
        val intent = Intent(this@StartTheGame,ActionGame::class.java)
        startActivity(intent)
    }
}