package com.example.pract11suhih

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {
    private lateinit var but:Button
    private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        but=findViewById(R.id.button)
        btn = findViewById(R.id.button2)
        but.setOnClickListener{
            val intent= Intent(this,MainActivity2::class.java)
            startActivity((intent))
        }
        btn.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity((intent))
        }


    }
}