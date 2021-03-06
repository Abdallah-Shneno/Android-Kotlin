package com.example.myfirstapp.finalproject.Onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.finalproject.R
import kotlinx.android.synthetic.main.fragment_onboarding_one.*
import kotlinx.android.synthetic.main.fragment_onboarding_one.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [onboarding_one.newInstance] factory method to
 * create an instance of this fragment.
 */
class onboarding_one : Fragment() {
    private lateinit var onb_2 : onboarding_two
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        onb_2 = onboarding_two()
         var v =  inflater.inflate(R.layout.fragment_onboarding_one, container, false)

        isClicked(v)

         return v
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment onboarding_one.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                onboarding_one().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }

    fun isClicked ( v : View) {
        v.next.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace( R.id.containerA ,
                onb_2).addToBackStack(null).commit()

        }
    }
}