package com.example.myfirstapp.indecator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var array =  ArrayList<String>()
        array.add("aaaa")
        array.add("bbbb")
        array.add("cccc")
        array.add("dddd")

        aaaaa.adapter = Rec(this , array)
    }
}