package com.example.myfirstapp.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private const val TEXT : String = "hi"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scanning)
        var v = findViewById<Button>(R.id.bb)
        var t = findViewById<TextView>(R.id.tt)
        var e = findViewById<EditText>(R.id.ee)

//        v.setOnClickListener {
//
//            t.append(e.text.toString()+"\n")
//
//        }




    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        var t = findViewById<TextView>(R.id.tt)
 //       outState?.putString(TEXT , t.text.toString() )
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        var t = findViewById<TextView>(R.id.tt)
    //    var my_text = savedInstanceState?.getString(TEXT , "")
    //    t.text = my_text
    }
}