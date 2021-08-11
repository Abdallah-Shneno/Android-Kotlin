package com.example.myfirstapp.abdallah_shneno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import com.example.myfirstapp.abdallah_shneno.DesignTool.AdaptorDesign
import com.example.myfirstapp.abdallah_shneno.DesignTool.Recipes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var array = ArrayList<Recipes>()
        array.add(Recipes(R.drawable.aa , "ushed himself slowly" ,"The resulting wave" ,"by misfortune" ,"01"  ))
        array.add(Recipes(R.drawable.b , "destroyed another" ,"remembered " ,"as a senator," ,"02'"  ))
        array.add(Recipes(R.drawable.c , "brewery and swept" ,"some freight " ,"communication " ,"03"  ))
        array.add(Recipes(R.drawable.d , "brewing industry " ,"Bulletin board" ,"resources and activities" , "04" ))
        array.add(Recipes(R.drawable.e , "ushed himself slowly" ,"The resulting wave" ,"by misfortune" ,"01"  ))
        array.add(Recipes(R.drawable.b , "destroyed another" ,"remembered " ,"as a senator," ,"02'"  ))
        var adapter = AdaptorDesign(this , array)
        list.adapter = adapter
        button.setOnClickListener {
            val bob = PopupMenu(this , button)
            bob.menuInflater.inflate(R.menu.main_menu , bob.menu)
            bob.setOnMenuItemClickListener { item -> // or it
                when ( item.itemId ){
                    R.id.saveItem -> Toast.makeText(this,"save",Toast.LENGTH_SHORT).show()
                    R.id.shareItem -> Toast.makeText(this,"save",Toast.LENGTH_SHORT).show()
                }
                true
            }
            bob.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu , menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when ( item.itemId ){
            R.id.saveItem -> Toast.makeText(this,"save",Toast.LENGTH_SHORT).show()
            R.id.shareItem -> Toast.makeText(this,"save",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}