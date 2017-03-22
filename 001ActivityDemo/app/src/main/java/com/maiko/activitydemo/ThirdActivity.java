package com.maiko.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        final Intent intent = getIntent();
        Button button = (Button) findViewById(R.id.button_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(ThirdActivity.this, intent.getStringExtra("extra data"), Toast.LENGTH_SHORT).show();
                Toast.makeText(ThirdActivity.this, intent.getStringExtra("extra data 2"), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
