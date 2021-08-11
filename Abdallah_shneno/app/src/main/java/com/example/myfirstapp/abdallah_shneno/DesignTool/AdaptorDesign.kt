package com.example.myfirstapp.abdallah_shneno.DesignTool

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.myfirstapp.abdallah_shneno.R
import kotlinx.android.synthetic.main.des.view.*

class AdaptorDesign ( var activity: Activity , var array : ArrayList<Recipes>)
    : BaseAdapter ()
{
    override fun getCount(): Int {
        return array.size
    }

    override fun getItem(position: Int): Any {
        return array[position]
    }

    override fun getItemId(position: Int): Long {
       return array[position].has_number.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var root  = convertView
        if ( convertView == null )
             root = LayoutInflater.from(activity).inflate( R.layout.des , null , false )

        root!!.image.setImageResource(array[position].image)
        root.desc1.text = array[position].desc_1
        root.title.text = array[position].title
        root.desc2.text = array[position].seson
        root.num.text = array[position].has_number
        return root


    }
}