package com.example.practica10suhih

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    private lateinit var btn:Button
    private lateinit var editText: EditText
    private lateinit var ss: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editTextTextPersonName)
        ss=editText.text.toString()
        val sharedPreferences = getSharedPreferences("pre", Context.MODE_PRIVATE)
        val editor= sharedPreferences.edit()
        editor.putString("pre", ss)
        editor.apply()
        if(sharedPreferences.contains("pre"))
        {ss = sharedPreferences.getString("pre",ss).toString()
            editText.setText(ss)
        }

        btn = findViewById(R.id.button)
        btn.setOnClickListener { val  intent=Intent(this,MainActivity2::class.java)
        intent.putExtra("pre",editText.text.toString())
        startActivity(intent)


        }


    }
}