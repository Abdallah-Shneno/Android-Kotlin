package com.example.myfirstapp.finalproject.Onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myfirstapp.finalproject.MainActivity
import com.example.myfirstapp.finalproject.R
import kotlinx.android.synthetic.main.fragment_onboarding_one.*

class Starting : AppCompatActivity() {
    lateinit var onboarding : onboarding_one
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starting)
        onboarding = onboarding_one()
        var sh = getSharedPreferences("Shared", MODE_PRIVATE)
        var result = sh.getBoolean("seen" , false)
        if (result == true){
            goToMain()
        }else{
            addFragment ()
        }
    }
    fun goToMain(){
        var i = Intent( applicationContext , MainActivity::class.java)
        startActivity(i)


    }
    fun  addFragment (){
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add( R.id.containerA , onboarding)
        fragmentTransaction.commit()
    }

}