package com.example.pract12suhih

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.content.edit
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


var Account : MutableList<Accounting> = mutableListOf()
private lateinit var day: EditText
private lateinit var time: EditText
private lateinit var cat: EditText
private lateinit var sum: EditText
private lateinit var btn: Button
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        getAccount()
        day = findViewById(R.id.editTextDate)
        time = findViewById(R.id.editTextTime)
        cat = findViewById(R.id.editTextTextPersonName)
        sum = findViewById(R.id.editTextNumber)
        btn = findViewById(R.id.button3)
        btn.setOnClickListener{
            addAccount(day.text.toString(),time.text.toString(),cat.text.toString(),sum.text.toString())
        }
    }
    private fun getAccount()
    {
        val preferences = getSharedPreferences("pref", MODE_PRIVATE)
        var json: String= ""
        if(!preferences.contains("json"))
        {
            return
        }
        else
        {
            json = preferences.getString("json","why?").toString()
        }
        val accountList= Gson().fromJson<List<Accounting>>(json, object :TypeToken<List<Accounting>>(){}.type)
        Account.addAll(accountList)

    }
    private fun addAccount(day:String,time:String,cat:String,sum:String) {
        val acc = Accounting(day, time, cat, sum)
        Account.add(acc)
        val preferences = getSharedPreferences("pref", MODE_PRIVATE)
        preferences.edit {
            this.putString("json", Gson().toJson(Account).toString())
        }
    }
}