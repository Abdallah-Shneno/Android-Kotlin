package com.example.myfirstapp.recyclerviewandcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupMenu
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfirstapp.recyclerviewandcardview.Adaptor.ItemAdaptor
import com.example.myfirstapp.recyclerviewandcardview.Model.Item
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var array = ArrayList<Item>()
        array.add(
            Item(R.drawable.a ,"Hip_Hop_Rab" , "3 Songs"
            )
        )
        array.add(
            Item(R.drawable.b ,"Houses" , "2 Songs"
            )
        )
        array.add(
            Item(R.drawable.c ,"India" , "1 Songs"
            )
        )
        array.add(
            Item(R.drawable.d ,"Arab Songs" , "4 Songs"
            )
        )
        array.add(
            Item(R.drawable.e ,"India Rock" , "5 Songs"
            )
        )
        array.add(
            Item(R.drawable.a ,"anerican chair" , "1 Songs"
            )
        )

        var adaptor = ItemAdaptor( this , array)
        rvItem.adapter = adaptor
      //  rvItem.layoutManager = LinearLayoutManager(this)
        rvItem.layoutManager = GridLayoutManager(this , 2)


    }
    fun showPopup(v: View) {
        val popup = PopupMenu(this, v)
        val inflater: MenuInflater = popup.menuInflater
        inflater.inflate(R.menu.pop, popup.menu)
        popup.show()
    }
}