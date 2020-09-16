package com.example.example.tp4;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button B1;  int b1 = -1;  TextView bb1;
    Button B2;   int b2 = -1;  TextView bb2;
    Button B3;   int b3 = -1;  TextView bb3;
    Button B4;   int b4 = -1;  TextView bb4;
    Button B5;   int b5 = -1;  TextView bb5;
    Button B6;   int b6 = -1;  TextView bb6;
    Button B7;   int b7 = -1;  TextView bb7;
    Button B8;   int b8 = -1;  TextView bb8;
    Button B9;   int b9 = -1;  TextView bb9;
    int cursor = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = (Button)findViewById(R.id.B1);
        bb1 = (TextView)findViewById(R.id.textView1);
        B2 = (Button)findViewById(R.id.B2);
        bb2 = (TextView)findViewById(R.id.textView2);
        B3 = (Button)findViewById(R.id.B3);
        bb3 = (TextView)findViewById(R.id.textView3);

    }
    public void click1(View view) {
        if (cursor == 1 ) { bb1.setText("X"); b1=0; }
        if (cursor == 0 ) { bb1.setText("O"); b1=1; }
        if (cursor == 0) cursor = 1;
        else  cursor = 0;
        B1.setVisibility(View.INVISIBLE);
    }
    public void click2(View view) {
        if (cursor == 1 ) { bb2.setText("X"); b2=0; }
        if (cursor == 0 ) { bb2.setText("O"); b2=1; }
        if (cursor == 0) cursor = 1;
        else  cursor = 0;
        B2.setVisibility(View.INVISIBLE);

    }
    public void click3(View view) {
        if (cursor == 1 ) { bb3.setText("X"); b3=0; }
        if (cursor == 0 ) { bb3.setText("O"); b3=1; }
        if (cursor == 0) cursor = 1;
        else  cursor = 0;
        B3.setVisibility(View.INVISIBLE);
    }
}
