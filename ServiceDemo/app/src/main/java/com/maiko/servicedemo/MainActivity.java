package com.maiko.servicedemo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ServiceConnection {

    private final String TAG = "MainActivity";

    private Button btnStartService, btnStopService, btnBindService, btnUnbindService;
    private Intent serviceIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceIntent = new Intent(MainActivity.this, EchoService.class);

        btnStartService = (Button) findViewById(R.id.btnStartService);
        btnStopService = (Button) findViewById(R.id.btnStopService);
        btnBindService = (Button) findViewById(R.id.btnBindService);
        btnUnbindService = (Button) findViewById(R.id.btnUnbindService);

        btnStartService.setOnClickListener(this);
        btnStopService.setOnClickListener(this);
        btnBindService.setOnClickListener(this);
        btnUnbindService.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnStartService:
                startService(serviceIntent);
                break;
            case R.id.btnStopService:
                stopService(serviceIntent);
                break;
            case R.id.btnBindService:
                bindService(serviceIntent, this, Context.BIND_AUTO_CREATE);
                break;
            case R.id.btnUnbindService:
                unbindService(this);
                break;
            default:
                break;
        }
    }

    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {
        Log.d(TAG, "onServiceConnected");
    }

    @Override
    public void onServiceDisconnected(ComponentName name) {
        Log.d(TAG, "onServiceDisconnected");
    }

}
