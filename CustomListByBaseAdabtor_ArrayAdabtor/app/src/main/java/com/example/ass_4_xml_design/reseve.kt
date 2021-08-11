
package com.example.ass_4_xml_design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ass_4_xml_design.model.data

class reseve : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reseve)
        val i = intent.getParcelableExtra<data>("a")
        if (i != null) {
            Toast.makeText(this,"${i.title}" , Toast.LENGTH_SHORT).show()
        }
    }
}