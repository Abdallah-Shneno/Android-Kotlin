package com.example.myfirstapp.zhecr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.customadaptor.AdaptorC
import com.example.myfirstapp.customadaptor.ItemCounter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array =  ArrayList<ItemCounter>()
        array.add(ItemCounter(1,R.drawable.a ,
                "Nashville Armchair" ,21 , "Color: Royal Blue" ,  "₹1,895"))
        array.add(ItemCounter(2,R.drawable.b ,
                "Elisa Wingback Chair" ,1 , "Color: Blossom Pink" ,  "₹1,512"))
        array.add(ItemCounter(3,R.drawable.c ,
                "Ellington Office Chair" ,150 , "Color: Royal blue" ,  "₹13,834"))
        array.add(ItemCounter(4,R.drawable.d ,
                "Chaise Corner Sofa" ,50 , "Color: Royal blue" ,  "₹28,895"))

        var adaptor = AdaptorC( this , array )
        list.adapter = adaptor

      //  var array1 = resources.getStringArray(R.array.array1)



    }
}