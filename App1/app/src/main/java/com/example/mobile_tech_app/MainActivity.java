package com.example.mobile_tech_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this is not the app name this is the title. The app name is in the activity_main.xml
        setTitle("Mobile Tech App");
    }
}