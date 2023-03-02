package com.example.pract11suhih

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity3 : AppCompatActivity() {
    val Account : MutableList<Accounting> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        getAccount()
        Account.forEach{
          Log.d("fff",it.toString())

        }

    }
    private fun getAccount()
    {
        val preferences = getSharedPreferences("pref", MODE_PRIVATE)
        var json:String=""
        if(!preferences.contains("json"))
        {
            return
        }
        else
        { json = preferences.getString("json","why?").toString()
            val accountList= Gson().fromJson<List<Accounting>>(json, object: TypeToken<List<Accounting>>(){}.type)
            Account.addAll(accountList)
        }
    }
}