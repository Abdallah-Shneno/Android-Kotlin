package com.example.myfirstapp.recyclerviewandcardview.Adaptor

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.recyclerviewandcardview.Model.Item
import com.example.myfirstapp.recyclerviewandcardview.R
import com.example.myfirstapp.recyclerviewandcardview.R.*
import kotlinx.android.synthetic.main.card_item.view.*


class ItemAdaptor (var activity: Activity , var array :ArrayList<Item>): RecyclerView.Adapter<ItemAdaptor.ItemHolder>() {
    class ItemHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image = itemView.image
        var title = itemView.title
        var desc = itemView.desc

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
       var root = LayoutInflater.from(activity).inflate(R.layout.card_item , parent , false)
        return ItemHolder(root)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.image.setImageResource(array[position].image)
        holder.title.text = array[position].title
        holder.desc.text = array[position].desc


    }

    override fun getItemCount(): Int {
       return array.size
    }
}


