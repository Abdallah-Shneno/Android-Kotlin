package com.example.myfirstapp.zhecr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.customadaptor.ItemCounter

class act : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act)
        var i = Intent()
        //var o =  i.getSerializableExtra("o") as ItemCounter
        var o = i.getParcelableExtra<ItemCounter>("o")
        i.getParcelableArrayListExtra<ItemCounter>("a")

        }
}