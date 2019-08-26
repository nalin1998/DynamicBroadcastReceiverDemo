package com.example.dynamicbroadcastreceiverdemo

import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //we will listen to broadcasts as long as our app is in foreground (stop listening broadcasts when our app goes to background)

    val dynamicBroadcastReceiver : DynamicBroadcastReceiver = DynamicBroadcastReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val intentFilter : IntentFilter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        registerReceiver(dynamicBroadcastReceiver , intentFilter)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(dynamicBroadcastReceiver)
    }

}
