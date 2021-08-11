package com.example.ass_4_xml_design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import com.example.ass_4_xml_design.adaptoe.customAdaptor
import com.example.ass_4_xml_design.model.data
import kotlinx.android.synthetic.main.listview.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview)
        var l = ArrayList<data>( )
        l.add( data(R.drawable.ic_baseline_cloud_upload_24, "ahmed ali" , "Students" , 1) )
        l.add( data(R.drawable.ic_baseline_create_24 , "ahmed mohammed" , "Doctor" , 2) )
        l.add( data(R.drawable.ic_baseline_create_24 , "Salah ali" , "Teacher" , 3) )
        var c = customAdaptor(this , l)
        list.adapter = c
        var a = PopupMenu( this , button2)
       a.menuInflater.inflate(R.menu.menu_one , a.menu )
        button2.setOnClickListener {
            a.setOnMenuItemClickListener { it
                when( it.itemId ){
                    R.id.share -> Toast.makeText(this , "Shate then" , Toast.LENGTH_SHORT).show()
                }
                true
            }
            a.show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_one , menu )
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when ( item.itemId ) {
            R.id.share -> Toast.makeText(this ,"Share" , Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}