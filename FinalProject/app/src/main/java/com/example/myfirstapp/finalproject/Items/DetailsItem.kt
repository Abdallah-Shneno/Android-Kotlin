package com.example.myfirstapp.finalproject.Items

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.myfirstapp.customadaptor.ItemCounter
import com.example.myfirstapp.finalproject.R
import kotlinx.android.synthetic.main.activity_details_item.*
import java.io.Serializable
import kotlin.math.log

class DetailsItem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_item)

        var i = intent
        var obj  = i.getParcelableExtra<ItemCounter>("scann")
        if (obj != null) {

            img.setImageResource(obj.image)
            title_item.text = obj.title
            pr.text = obj.price
        }else{
            Toast.makeText(applicationContext,"null index",Toast.LENGTH_LONG).show()

        }



        var v = 1
        plus.setOnClickListener {
            v++
            value.text = v.toString()
        }
        minus.setOnClickListener {
           if (v > 0){
               value.text =  v--.toString()
            }

        }


    }

}