package com.example.practica9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var cal:CalendarView
    private lateinit var btn:Button
    private var date:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        date = cal.date.toInt()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("data", date)
            startActivity(intent)

        }
    }
}