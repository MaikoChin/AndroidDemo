package com.maiko.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Button button = (Button) findViewById(R.id.button_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("extra data", "A string was transported");
                intent.putExtra("extra data 2", "extra");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Log.d("SecondActivity", "Back Button pressed");
        Intent intent = new Intent();
        intent.putExtra("data_return", "return to First Activity");
        setResult(RESULT_OK, intent);
        Log.d("SecondActivity", "setResult success");
        finish();
    }
}
