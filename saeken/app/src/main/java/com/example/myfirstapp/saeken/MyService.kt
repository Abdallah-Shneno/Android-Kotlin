package com.example.myfirstapp.saeken

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onStart(intent: Intent?, startId: Int) {
        Toast.makeText(applicationContext,"onStart",Toast.LENGTH_LONG).show()
     }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(applicationContext,"onStartCommand",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        Toast.makeText(applicationContext,"onDestroy",Toast.LENGTH_LONG).show()
    }
}