package com.example.pract12suhih

import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

data class Accounting(var date:String, var time:String,var category:String,var Summ:String)
class Accounts
{
    fun getAccounts(preferences: SharedPreferences): MutableList<Accounting>{

        if (!preferences.contains("json")){
            return mutableListOf()
        } else {
            var json: String = ""
            json = preferences.getString("json", "NOT_JSON").toString()
        }
        val tempList = Gson().fromJson<MutableList<Accounting>>(json, object: TypeToken<MutableList<Accounting>>(){}.type)
        return tempList
    }

}