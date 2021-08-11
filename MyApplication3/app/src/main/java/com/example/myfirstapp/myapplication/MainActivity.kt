package com.example.myfirstapp.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private var bb: Button? = null
    private var tt: TextView? = null
    private var n = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bb = findViewById<Button>(R.id.bb)
        tt = findViewById<TextView>(R.id.dddd)

//        bb?.setOnClickListener {
//            tt?.text = ""
//            n++
//            tt?.append("\n $n times")
//
//        }
        tt?.movementMethod = ScrollingMovementMethod()

    }
}