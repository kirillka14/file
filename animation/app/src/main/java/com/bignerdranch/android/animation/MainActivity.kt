package com.bignerdranch.android.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

private lateinit var sceneView: View
private lateinit var sunView: View
private lateinit var skyView: View
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}