package com.example.myfirstapp.myapplication

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.fruitl_ayout.view.*

class MyAdpater ( var activity: Activity , var array : ArrayList<Fruit>) : BaseAdapter() {
    override fun getCount(): Int {
        return array.size
    }

    override fun getItem(position: Int): Any {
        return array[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var root = convertView
        if (root == null)
            root = LayoutInflater.from(activity).inflate(R.layout.fruitl_ayout , null , false)

        root!!.name.text = array[position].name
        root.price.text = array[position].price
        root.imageView.setImageResource(array[position].photo)
        return  root
    }


}