package com.example.myfirstapp.finalproject.AppPages

import android.R.attr.defaultValue
import android.R.attr.key
import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myfirstapp.customadaptor.ItemAdaptor
import com.example.myfirstapp.customadaptor.ItemCounter
import com.example.myfirstapp.finalproject.R
import kotlinx.android.synthetic.main.fragment_items.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "oo"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Items.newInstance] factory method to
 * create an instance of this fragment.
 */
class Items : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: ItemCounter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getParcelable(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var v = inflater.inflate(R.layout.fragment_items, container, false)
        array =  ArrayList<ItemCounter>()
    //  Toast.makeText(activity, param2?.title.toString(), Toast.LENGTH_LONG).show()
        param2?.let { array.add(it) }


        array.add(
            ItemCounter(
                1, R.drawable.a,
                "Nashville Armchair", 21, "Color: Royal Blue", "₹78"
            )
        )
        array.add(
            ItemCounter(
                2, R.drawable.b,
                "Elisa Wingback Chair", 1, "Color: Blossom Pink", "₹80"
            )
        )
        array.add(
            ItemCounter(
                3, R.drawable.c,
                "Ellington Office Chair", 150, "Color: Royal blue", "₹19"
            )
        )
        array.add(
            ItemCounter(
                4, R.drawable.d,
                "Chaise Corner Sofa", 50, "Color: Royal blue", "₹28"
            )
        )
        array.add(
            ItemCounter(
                1, R.drawable.a,
                "Nashville Armchair", 21, "Color: Royal Blue", "₹40"
            )
        )
        array.add(
            ItemCounter(
                2, R.drawable.b,
                "Elisa Wingback Chair", 1, "Color: Blossom Pink", "₹100"
            )
        )
        array.add(
            ItemCounter(
                3, R.drawable.c,
                "Ellington Office Chair", 150, "Color: Royal blue", "₹13"
            )
        )
        array.add(
            ItemCounter(
                4, R.drawable.d,
                "Chaise Corner Sofa", 50, "Color: Royal blue", "₹28"
            )
        )

        v.clothes.setOnClickListener {
            for ( i in 0 until 7){
                array.removeAll(array)
                }
            array.add(
                ItemCounter(
                    1, R.drawable.c1,
                    "otton fleece hoodie", 21, "Color: Royal Blue", "₹61"
                )
            )
            array.add(
                ItemCounter(
                    2, R.drawable.c2,
                    "DZ.ICAN", 1, "Color: white Pink", "₹90,8"
                )
            )
            array.add(
                ItemCounter(
                    3, R.drawable.c3,
                    "Piece/Pieces ", 150, "Color: Royal blue", "₹13,9"
                )
            )
            array.add(
                ItemCounter(
                    4, R.drawable.c4,
                    "Pullover", 50, "Color: Royal white", "₹28,5"
                )
            )
            array.add(
                ItemCounter(
                    1, R.drawable.c1,
                    "Fele(OEM Service)\n", 21, "Color: Royal Blue", "₹19,8"
                )
            )
            array.add(
                ItemCounter(
                    2, R.drawable.c2,
                    "Elisa Wingback ", 1, "Color: Blossom white", "₹10,51"
                )
            )
            array.add(
                ItemCounter(
                    3, R.drawable.c6,
                    "Ellington ", 150, "Color: Royal blue", "₹13,8"
                )
            )
            array.add(
                ItemCounter(
                    4, R.drawable.c3,
                    "Pullover", 50, "Color: Royal blue", "₹28"
                )
            )
            var adaptor = ItemAdaptor(context!! as Activity, array)
            v.list.adapter = adaptor



        }
        v.computer.setOnClickListener {
            for ( i in 0 until 7){
                array.removeAll(array)
            }
            array.add(
                ItemCounter(
                    1, R.drawable.lap1,
                    "Apple", 34, "Color: Royal Blue", "₹1500,8"
                )
            )
            array.add(
                ItemCounter(
                    2, R.drawable.lap2,
                    "Dell", 11, "Color: Blossom white", "₹1100,512"
                )
            )
            array.add(
                ItemCounter(
                    3, R.drawable.lap3,
                    "Apple", 64, "Color: Royal blue", "₹1309,834"
                )
            )
            array.add(
                ItemCounter(
                    4, R.drawable.lap4,
                    "HP", 5, "Color: white blue", "₹900,895"
                )
            )
            array.add(
                ItemCounter(
                    1, R.drawable.lap5,
                    "HP", 19, "Color: Royal Blue", "₹710,895"
                )
            )
            array.add(
                ItemCounter(
                    2, R.drawable.lap6,
                    "HP", 67, "Color: Blossom white", "₹771,512"
                )
            )
            array.add(
                ItemCounter(
                    3, R.drawable.lap1,
                    "Apple ", 37, "Color: Royal blue", "₹1013,834"
                )
            )
            array.add(
                ItemCounter(
                    4, R.drawable.lap2,
                    "HP", 53, "Color: Royal white", "₹1518,895"
                )
            )
            var adaptor = ItemAdaptor(context!! as Activity, array)
            v.list.adapter = adaptor



        }

        v.machine.setOnClickListener {
            for ( i in 0 until 7){
                array.removeAll(array)
            }
            array.add(
                ItemCounter(
                    1, R.drawable.m5,
                    "washing", 68, "Color: Royal Blue", "₹500"
                )
            )
            array.add(
                ItemCounter(
                    2, R.drawable.m1,
                    "television", 100, "Color: Blossom Pink", "₹450"
                )
            )
            array.add(
                ItemCounter(
                    3, R.drawable.m6,
                    "washing", 110, "Color: Royal blue", "₹13,834"
                )
            )
            array.add(
                ItemCounter(
                    4, R.drawable.m7,
                    "washing", 60, "Color: white blue", "₹450"
                )
            )
            array.add(
                ItemCounter(
                    1, R.drawable.m2,
                    "television", 41, "Color: Royal white", "₹550"
                )
            )
            array.add(
                ItemCounter(
                    2, R.drawable.m3,
                    "television", 10, "Color: Blossom Pink", "₹650"
                )
            )
            array.add(
                ItemCounter(
                    3, R.drawable.m7,
                    "washing ", 160, "Color: white blue", "₹701"
                )
            )
            array.add(
                ItemCounter(
                    4, R.drawable.m4,
                    "television", 70, "Color: Royal white", "₹350"
                )
            )
            var adaptor = ItemAdaptor(context!! as Activity, array)
            v.list.adapter = adaptor



        }

        v.all.setOnClickListener {
            for ( i in 0 until 7){
                array.removeAll(array)
            }
            array.add(
                ItemCounter(
                    1, R.drawable.a,
                    "Nashville Armchair", 21, "Color: Royal Blue", "₹78"
                )
            )
            array.add(
                ItemCounter(
                    2, R.drawable.b,
                    "Elisa Wingback Chair", 1, "Color: Blossom Pink", "₹80"
                )
            )
            array.add(
                ItemCounter(
                    3, R.drawable.c,
                    "Ellington Office Chair", 150, "Color: Royal blue", "₹19"
                )
            )
            array.add(
                ItemCounter(
                    4, R.drawable.d,
                    "Chaise Corner Sofa", 50, "Color: Royal blue", "₹28"
                )
            )
            array.add(
                ItemCounter(
                    1, R.drawable.a,
                    "Nashville Armchair", 21, "Color: Royal Blue", "₹40"
                )
            )
            array.add(
                ItemCounter(
                    2, R.drawable.b,
                    "Elisa Wingback Chair", 1, "Color: Blossom Pink", "₹100"
                )
            )
            array.add(
                ItemCounter(
                    3, R.drawable.c,
                    "Ellington Office Chair", 150, "Color: Royal blue", "₹13"
                )
            )
            array.add(
                ItemCounter(
                    4, R.drawable.d,
                    "Chaise Corner Sofa", 50, "Color: Royal blue", "₹28"
                )
            )

            var adaptor = ItemAdaptor(context!! as Activity, array)
            v.list.adapter = adaptor



        }




        var adaptor = ItemAdaptor(context!! as Activity, array)
        v.list.adapter = adaptor

        return v
    }

    companion object {
        lateinit var array : ArrayList<ItemCounter>
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: ItemCounter) =
            Items().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putParcelable(ARG_PARAM2, param2)
                }
            }
    }
}