package com.example.practica10suhih

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.practica10suhih.R.id.editTextTextPersonName


class MainActivity2 : AppCompatActivity() {
    private lateinit var tw:TextView
    private lateinit var ts:EditText
    private lateinit var tv:EditText
    private lateinit var but:Button
    private var s: Double = 0.0
    private var d:Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val data = intent.getStringExtra("pre")

        if(data=="kvadrat")
        {
            ts=findViewById(R.id.editTextTextPersonName2)
            tv= findViewById(R.id.editTextTextPersonName3)

            but =findViewById(R.id.button2)
            but.setOnClickListener {tw =findViewById(R.id.textView)
                s = ts.text.toString().toDouble()
                s=tv.text.toString().toDouble()
                s=s*4
                tw.text="периметр квадрата равен\n$s" }

        }
        else
        {
            if (data=="pramoygolnik")
            {
                ts = findViewById(R.id.editTextTextPersonName2)
                tv = findViewById(R.id.editTextTextPersonName3)

                but = findViewById(R.id.button2)
                but.setOnClickListener {
                    tw = findViewById(R.id.textView)
                    s = ts.text.toString().toDouble()
                    d=tv.text.toString().toDouble()
                    s = 2*(s+d)
                    tw.text = "периметр прямоугольника равен\n$s"
                }
            }
            else
            {
                if(data=="krug")
                { ts = findViewById(R.id.editTextTextPersonName2)
                    tv = findViewById(R.id.editTextTextPersonName3)

                    but = findViewById(R.id.button2)
                    but.setOnClickListener {
                        tw = findViewById(R.id.textView)
                        s = ts.text.toString().toDouble()
                        s=tv.text.toString().toDouble()
                        s = 2*s*3.14
                        tw.text = "периметр круга равен\n$s"
                    }


                }

            }

        }


    }
}