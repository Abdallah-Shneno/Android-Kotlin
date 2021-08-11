package com.example.myfirstapp.finalproject.AppPages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.myfirstapp.finalproject.DataBaseUsers.DataBaseHelper
import com.example.myfirstapp.finalproject.R
import com.example.myfirstapp.finalproject.SignInUp.SignIn
import com.example.myfirstapp.finalproject.SignInUp.logIn
import kotlinx.android.synthetic.main.fragment_account.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Account : Fragment() {
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v =  inflater.inflate(R.layout.fragment_account, container, false)

        var  name =  logIn.usernameProfile
        var db = DataBaseHelper(context!!)
        var array = db.readAll()

        var s = ""
        for ( i in array){
            if (i.userName.toString() == name){
                s = i.userName.toString()
     //           Toast.makeText(activity!!.applicationContext , "${" n $name e ${i.email} p ${SignIn.mm}"}"  , Toast.LENGTH_LONG).show()
                v.tvName.setText(i.userName.toString())
                v.tvEmail.setText(i.email.toString())
                v.tvMobileNumber.setText(SignIn.mm)
            }
        }





        v.edit.setOnClickListener {
           if ( v.edit.text.toString() == "Edit"){
     //          Toast.makeText(activity!!.applicationContext , "convert to save" , Toast.LENGTH_LONG).show()
               v.edit.text = "Save"
               enableAll(v)
      //         editDataBaeInfo(v,s)

           }else{
                Toast.makeText(activity!!.applicationContext , "convert to Edit" , Toast.LENGTH_LONG).show()
                v.edit.text = "Edit"
                disable(v)
            }
        }

        return v
    }

    companion object {

        fun newInstance(param1: String, param2: String) =
            Account().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    fun enableAll ( v : View) {
        v.tvName.isEnabled = true
        v.tvEmail.isEnabled = true
        v.tvMobileNumber.isEnabled = true
        v.tvOldPass.isEnabled = true
        v.tvNewPass.isEnabled = true
    }
    fun disable ( v : View) {
        v.tvName.isEnabled = false
        v.tvEmail.isEnabled = false
        v.tvMobileNumber.isEnabled = false
        v.tvOldPass.isEnabled = false
        v.tvNewPass.isEnabled = false
    }
//    fun editDataBaeInfo (v: View, s: String) {
//        var db = DataBaseHelper(context!!)
//        var array = db.readAll()
//        for ( i in array){
//            if (i.userName.toString() == s){
//                //           Toast.makeText(activity!!.applicationContext , "${" n $name e ${i.email} p ${SignIn.mm}"}"  , Toast.LENGTH_LONG).show()
//                var name : String = v.tvName.text.toString()
//                var email : String = v.tvEmail.text.toString()
//                var mobile : String = v.tvMobileNumber.text.toString()
//                var tvOldPass : String = v.tvOldPass.text.toString()
//                var tvNewPass : String = v.tvNewPass.text.toString()
//
//                v.tvMobileNumber.setText(SignIn.mm)
//                db.changeProfileData(name,email,mobile,tvOldPass,tvNewPass)
//            }
//        }
//
//    }
}