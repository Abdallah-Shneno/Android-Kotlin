package com.example.myfirstapp.finalproject

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.myfirstapp.finalproject.Onboarding.Starting
import com.example.myfirstapp.finalproject.Onboarding.onboarding_one
import com.example.myfirstapp.finalproject.SignInUp.SignIn
import com.example.myfirstapp.finalproject.SignInUp.logIn

class MainActivity : AppCompatActivity() {
    lateinit var fragment : logIn
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragment = logIn()
        addFragment()

     //        if (result == false){
//            Log.d("ddd" , "done")
//            addFragment()
//
//        }else{
//            var sh = getSharedPreferences("Shared", MODE_PRIVATE)
//            sh.edit().putBoolean("seen", true).apply()
//            Log.d("ddd" , "not")
//            goToMain()
//        }
    }


    fun goToMain(){
        var i = Intent( applicationContext , MainActivity::class.java)
        startActivity(i)
    }


    fun  addFragment (){
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add( R.id.container , fragment)
        fragmentTransaction.commit()
        var sh = getSharedPreferences("Shared", MODE_PRIVATE)
        var save = sh.edit()
        save.putBoolean("seen", true)
        save.apply()
        var result = sh.getBoolean("seen" , false)


    }
}