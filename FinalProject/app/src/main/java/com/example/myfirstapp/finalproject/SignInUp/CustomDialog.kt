package com.example.myfirstapp.finalproject.SignInUp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.myfirstapp.finalproject.DataBaseUsers.DataBaseHelper
import com.example.myfirstapp.finalproject.R
import kotlinx.android.synthetic.main.forget_pass.view.*
import kotlinx.android.synthetic.main.fragment_log_in.*

class CustomDialog () : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root : View = inflater.inflate(R.layout.forget_pass , container , false)
        root.done.setOnClickListener {
            var a = DataBaseHelper(it.context)
            var userName = root.userNameChange.text.toString()
            var pass = root.passwordb.text.toString()
            var  res = a.changePass( userName , pass)
            if (res){
                Log.d("kkkk" , res.toString())

            }else{
                Log.d("kkkk" , res.toString())

            }
            Toast.makeText(activity!!.applicationContext , "${res.toString()}" , Toast.LENGTH_SHORT).show()
        }
        return root
    }

}