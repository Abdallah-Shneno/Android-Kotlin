package com.example.myfirstapp.alertdialgo

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.net.ConnectivityManager
import android.os.Build
import android.os.Bundle
import android.text.InputType
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val celender = Calendar.getInstance()
        val day1 = celender.get(Calendar.DAY_OF_MONTH)
        val month1 = celender.get(Calendar.MONTH)
        val year1 = celender.get(Calendar.YEAR)



        val timeNow = Calendar.getInstance()
        var m = timeNow.get(Calendar.MINUTE)
        var h = timeNow.get(Calendar.HOUR_OF_DAY)

        time.setOnClickListener {
            val p = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                    time.setText("$hourOfDay : ${minute} ")


                },
                h,
                m,
                false
            )
          p.show()
      }

//        var t = Dialog(this)
//        t.setContentView(R.layout.activity_main)
//        t.alert.setOnClickListener {
//            t.dismiss()
//        }
//        t.show()











        date.setOnClickListener {
            date.inputType = InputType.TYPE_NULL;

            val d = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                    date.setText("$year / ${month + 1} / $dayOfMonth")

                },
                year1,
                month1,
                day1
            )
            d.show()
        }












        alert.setOnClickListener {
            var d = AlertDialog.Builder(this)
            d.setTitle("Delete Post")
            d.setMessage("Are ou sure")
            d.setIcon(R.drawable.ic_baseline_delete_24)
            d.setCancelable(false)
            d.setPositiveButton("YES"){ d, i -> Toast.makeText(this, "yes", Toast.LENGTH_SHORT).show()
            }
            d.setNegativeButton("NO"){ a, b -> Toast.makeText(this, "no", Toast.LENGTH_SHORT).show()
                a.cancel()
            }
            d.setNeutralButton("Rate Me"){ a, b -> Toast.makeText(
                this,
                "nutral",
                Toast.LENGTH_SHORT
            ).show()
            }
            d.show()

        }
    }


}