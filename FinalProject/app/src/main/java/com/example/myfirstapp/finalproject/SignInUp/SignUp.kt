package com.example.myfirstapp.finalproject.SignInUp

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myfirstapp.finalproject.DataBaseUsers.DataBaseHelper
import com.example.myfirstapp.finalproject.R
import kotlinx.android.synthetic.main.fragment_sign_up.view.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class SignIn : Fragment() {
    lateinit var login : logIn
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        login = logIn()
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
        var v = inflater.inflate(R.layout.fragment_sign_up, container, false)
   //     (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        v.log_In.setOnClickListener {
            newFragment()
        }
        v.Register.setOnClickListener {
            addNewUserToDataBase(v)

        }

        return v
    }
    fun addNewUserToDataBase(v: View) {
        var username = v.username.text.toString()
        var email = v.email.text.toString()
        var mobilePhone = v.mobile_phone.text.toString()
        var password = v.password.text.toString()
        if (username.isNotEmpty() && email.isNotEmpty() && mobilePhone.isNotEmpty() && password.isNotEmpty()){
            var db = DataBaseHelper(activity!!.applicationContext)
            var respons = db!!.insertion(username, email, mobilePhone, password)
//            if (true){
 //             Toast.makeText(v.context, "$mobilePhone", Toast.LENGTH_SHORT).show()
//
//            }
            newFragment()
            mm = mobilePhone

        }else{
            var alertDialog = AlertDialog.Builder(context)
            alertDialog.setTitle(R.string.fill_all_inputs)
            alertDialog.setMessage(R.string.to_complete_regeteration)
            alertDialog.setIcon(R.drawable.ic_cancel)
            alertDialog.setPositiveButton(R.string.ok , {a,_ -> a.dismiss()  })
            alertDialog.show()
      }




    }
    fun newFragment (){
        var transaction = activity!!.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, login)
        transaction.commit()
    }

    companion object {
        var mm = "mm"
          @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SignIn().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}