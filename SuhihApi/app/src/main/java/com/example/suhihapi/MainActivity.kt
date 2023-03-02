package com.example.suhihapi

import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.edit
import com.google.gson.Gson
import com.google.gson.JsonParseException
import com.google.gson.reflect.TypeToken
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import kotlin.jvm.Throws

var String :MutableList<string> = mutableListOf()
class MainActivity : AppCompatActivity() {
    private lateinit var tv: TextView
    private lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val executor: ExecutorService = Executors.newSingleThreadExecutor()
        tv = findViewById(R.id.textView)
        btn = findViewById(R.id.button)
        btn.setOnClickListener {
            tv.text = executor.submit(Callable { httpRequest("https://favqs.com/api/qotd") }).get()

        }
        }
    }

    @Throws(IOException::class)
    fun httpRequest(strURL: String): String {
        val url = URL(strURL)
        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "GET"
        var data: Int = connection.inputStream.read()
        var str = ""
        while (data != -1) {

            data = connection.inputStream.read()
            str += data.toChar()
        }
        return str
    }


