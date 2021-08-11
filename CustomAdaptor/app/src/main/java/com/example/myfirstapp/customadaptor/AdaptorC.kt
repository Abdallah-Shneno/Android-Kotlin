package com.example.myfirstapp.customadaptor

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item.view.*


class AdaptorC(var activity: Activity, var array: ArrayList<ItemCounter>) : BaseAdapter() {
    override fun getCount(): Int {
        return array.size
    }

    override fun getItem(position: Int): Any {
        return array[position]
    }

    override fun getItemId(position: Int): Long {
        return array[position].id.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var root1 = convertView
            if ( root1 == null)
            root1 = LayoutInflater.from(activity).inflate(R.layout.item, null, false)


            root1!!.title.text = array[position].title


            root1.image.setImageResource(array[position].image)


            root1.quantity.text = array[position].quantity.toString()


            root1.desc.text = array[position].desc
            root1.price.text = array[position].price
            return root1


    }


}