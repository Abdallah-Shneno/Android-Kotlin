package com.example.myfirstapp.indecator


import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.indecator.R
import com.example.myfirstapp.indecator.R.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.cv.view.*


class Rec (var activity: Activity , var array :ArrayList<String>): RecyclerView.Adapter<Rec.ItemHolder>() {
    class ItemHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title = itemView.textView1
        var b = itemView.button2

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        var root = LayoutInflater.from(activity).inflate(R.layout.cv , parent , false)
        return ItemHolder(root)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

       // button2
        var r = position
        holder.b.setOnClickListener {
            position+1
            holder.title.text = array[position]

        }


    }

    override fun getItemCount(): Int {
        return array.size
    }
}


