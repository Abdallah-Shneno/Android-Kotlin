package com.example.myfirstapp.finalproject.AppPages

import android.R.attr.key
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myfirstapp.customadaptor.ItemCounter
import com.example.myfirstapp.finalproject.R
import kotlinx.android.synthetic.main.activity_details_item.*
import kotlinx.android.synthetic.main.fragment_add_item.*
import kotlinx.android.synthetic.main.fragment_add_item.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AddItem.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddItem : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v = inflater.inflate(R.layout.fragment_add_item, container, false)
        var g = R.drawable.pik
        v.imageItem.setOnClickListener {
            var g = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(g, 100)
        }
        v.save.setOnClickListener {


            var r =   ItemCounter(
                3, g,
                titleitemname.text.toString(), quan.text.toString().toInt(), "no desc", "₹"+priceitem.text.toString()
            )
            activity!!.supportFragmentManager.beginTransaction().add(R.id.navigation, Items.newInstance("oo",r)).commit()
      //      Toast.makeText(context!!,"done", Toast.LENGTH_LONG).show()

        }
        return v
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if ( resultCode == Activity.RESULT_OK && requestCode == 100)
            this.imageItem.setImageURI(data!!.data)
    }




}