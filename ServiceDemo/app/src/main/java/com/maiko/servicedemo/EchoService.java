package com.maiko.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;


public class EchoService extends Service {

    public final String TAG = "EchoService";

    class EchoServiceBinder extends Binder {

    }

    private final EchoServiceBinder echoServiceBinder = new EchoServiceBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind");
        return echoServiceBinder;
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate");
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy");
    }
}
