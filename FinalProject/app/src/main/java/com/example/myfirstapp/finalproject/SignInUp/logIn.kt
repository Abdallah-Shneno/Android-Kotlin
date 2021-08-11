package com.example.myfirstapp.finalproject.SignInUp

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myfirstapp.finalproject.AppPages.Beginning
import com.example.myfirstapp.finalproject.DataBaseUsers.DataBaseHelper
import com.example.myfirstapp.finalproject.R
import kotlinx.android.synthetic.main.fragment_log_in.*
import kotlinx.android.synthetic.main.fragment_log_in.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class logIn : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var signIn: SignIn

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        signIn = SignIn()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var v = inflater.inflate(R.layout.fragment_log_in, container, false)
        v.log_In.setOnClickListener {
            goToSignInAgain()

        }
        v.Cancel.setOnClickListener {
            conform(v)
        }
        v.changePass.setOnClickListener {
            var dialog = CustomDialog()
            dialog.show(activity!!.supportFragmentManager, "change")
        }



        return v
    }

    fun goToSignInAgain() {
        var transaction = activity!!.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, signIn)
        transaction.commit()
    }

    fun conform(v: View) {
        var username = v.username.text.toString()
        var password = v.password.text.toString()

        if (username.isNotEmpty() && password.isNotEmpty()) {

            var db = DataBaseHelper(context!!)
            var array = db.readAll()
            var bool = false
            for (i in array) {
                //  Toast.makeText(context, "${i.toString()}", Toast.LENGTH_SHORT).show()


                if (i.userName.toString() == username && i.password.toString() == password) {
                    var transaction = activity!!.supportFragmentManager.beginTransaction()
             //       transaction.replace(R.id.container, MainLayout())
             //       transaction.commit()
                    usernameProfile = username

                    val intent = Intent(activity, Beginning::class.java)

                    activity!!.startActivity(intent)

                    bool = true
                    break
                }

            }
            if (bool == false) {
                var alertDialog = AlertDialog.Builder(context)
                alertDialog.setTitle(R.string.tryMore)
                alertDialog.setMessage(R.string.tryAgain)
                alertDialog.setIcon(R.drawable.ic_cancel)
                alertDialog.setPositiveButton(R.string.ok, { a, _ -> a.dismiss() })
                alertDialog.show()
            }
        } else {
            var alertDialog = AlertDialog.Builder(context)
            alertDialog.setTitle(R.string.fill_all_inputs)
            alertDialog.setMessage(R.string.to_complete_regeteration)
            alertDialog.setIcon(R.drawable.ic_cancel)
            alertDialog.setPositiveButton(R.string.ok, { a, _ -> a.dismiss() })
            alertDialog.show()

        }


    }




    companion object {
        var usernameProfile = "TODO()"

      //  var phoneProfile = "TODO()"

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            logIn().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}