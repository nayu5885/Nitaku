package com.example.nitaku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView :TextView=findViewById(R.id.textView)
       val button:Button =findViewById(R.id.button)

        button.setOnClickListener{
            val intent = Intent(this,ResultActivity::class.java)
            startActivity(intent)
        }

    }



}