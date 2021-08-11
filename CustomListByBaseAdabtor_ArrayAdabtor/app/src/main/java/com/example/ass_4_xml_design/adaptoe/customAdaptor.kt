package com.example.ass_4_xml_design.adaptoe
import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.ass_4_xml_design.R
import com.example.ass_4_xml_design.model.data
import com.example.ass_4_xml_design.reseve
import kotlinx.android.synthetic.main.item.view.*
import kotlin.collections.ArrayList

class customAdaptor (var activity : Activity, var array : ArrayList<data>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var file = convertView
        if (file == null)
             file = LayoutInflater.from(activity).inflate(R.layout.item , null , false)

        file!!.image.setImageResource(array[position].image)
        file.title.text = array[position].title
        file.desc.text = array[position].desc

        file.button.setOnClickListener {
            val i = Intent(activity , reseve::class.java)
            i.putExtra("a" , array[position])
            activity.startActivity(i)
        }
        return file
    }

    override fun getItem(position: Int): Any {
      return array[position]
    }

    override fun getItemId(position: Int): Long {
        return array[position].id
    }

    override fun getCount(): Int {
        return array.size

    }
}



