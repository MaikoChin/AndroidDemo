package com.maiko.broadcastreceiverdemo;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final MyBroadcastReceiver myBroadcastReceiver = new MyBroadcastReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSendReceiver = (Button) findViewById(R.id.btn_send_broadcast);
        btnSendReceiver.setOnClickListener(this);

        Button btnBroadcastRegister = (Button) findViewById(R.id.btn_broatcast_register);
        btnBroadcastRegister.setOnClickListener(this);

        Button btnBroadcastUnregister = (Button) findViewById(R.id.btn_broatcast_unreg);
        btnBroadcastUnregister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_send_broadcast:
//                Intent intent = new Intent(MainActivity.this, MyBroadcastReceiver.class);
                Intent intent = new Intent(MyBroadcastReceiver.ACTION);
                intent.putExtra("data", "Hello World");
                sendBroadcast(intent);
                break;
            case R.id.btn_broatcast_register:
                registerReceiver(myBroadcastReceiver, new IntentFilter(MyBroadcastReceiver.ACTION));
                break;
            case R.id.btn_broatcast_unreg:
                unregisterReceiver(myBroadcastReceiver);
                break;
            default:
                break;
        }
    }
}
