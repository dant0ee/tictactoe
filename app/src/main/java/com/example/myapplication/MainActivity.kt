package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pl1 = findViewById<EditText>(R.id.player1)
        var pl2 = findViewById<EditText>(R.id.player2)
        var button =findViewById<Button>(R.id.button)
        button.setOnClickListener{
            if (pl1.text.toString().length==0){
                pl1.setText("player1")
            }
            if (pl2.text.toString().length==0){
                pl2.setText("player2")
            }
            val saxeli1= pl1.text.toString()
            val saxeli2= pl2.text.toString()
            val intent= Intent(this@MainActivity, MainActivity2 :: class.java)
            intent.putExtra("saxeli1", saxeli1)
            intent.putExtra("saxeli2", saxeli2)
            startActivity(intent)
        }


    }
}