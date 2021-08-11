package com.example.myfirstapp.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_.*

class Activity_A : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_)
        var array = ArrayList<Fruit>()
        array.add(Fruit(1,"Panana" , "15110 $" , R.drawable.ic_launcher_background))
        array.add(Fruit(1,"aaaaa" , "15210 $" , R.drawable.ic_launcher_foreground))
        array.add(Fruit(1,"sssss" , "11250 $" , R.drawable.ic_launcher_background))
        array.add(Fruit(1,"ddddd" , "15s0 $" , R.drawable.ic_launcher_background))
        array.add(Fruit(1,"fffff" , "150 $" , R.drawable.ic_launcher_background))
        var adapter = MyAdpater( this , array)
        list.adapter = adapter

    }
}