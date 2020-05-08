package com.example.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends Activity {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn1 = findViewById(R.id.btn1);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btn1.requestFocus();
    }
}
