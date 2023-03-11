package com.example.mobile_tech_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void openMainActivity(View view){
        // the Intent class is used to create an instance with current activity (this)
        //and the main activity.
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}