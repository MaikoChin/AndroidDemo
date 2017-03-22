package com.maiko.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;


public class MyBroadcastReceiver extends BroadcastReceiver {
    public static final String ACTION = "com.maiko.broadcastreceiverdemo.intent.action.MyBC";
    private final String TAG = "MyBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "Received");
        Toast.makeText(context, "Received: " + intent.getStringExtra("data"), Toast.LENGTH_SHORT).show();
    }


}
