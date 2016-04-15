package com.example.aduilio.nativemethods;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String info = new MyJavaClass().getInfo();

        TextView textView = (TextView) findViewById(R.id.tv_show_info);
        textView.setText(info);
    }
}
