package com.example.dynamicbroadcastreceiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class DynamicBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(p0: Context?, p1: Intent?) {
        if(p1!=null && ConnectivityManager.CONNECTIVITY_ACTION.equals(p1.action)){
            //getting connectivity info from intent
            var noConnectivity : Boolean = p1.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY , false)

            if(noConnectivity){
                Toast.makeText(p0 , " No Connectivity " , Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(p0 , " Connected " , Toast.LENGTH_LONG).show()
            }
        }

    }


}