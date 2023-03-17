package com.example.locationtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LocationServicesActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_services);
        Bundle extras = getIntent().getExtras();
        String street_add = extras.getString("Address");
        double longitude = extras.getDouble("Longitude");
        double latitude = extras.getDouble("Latitude");

        TextView tvlat = findViewById(R.id.textView_latitude);
        tvlat.setText("Latitude: " + latitude);

        TextView tvlng = findViewById(R.id.textView_longitude);
        tvlng.setText("Longitude: " + longitude);

        TextView tvaddr = findViewById(R.id.textView_street_add);
        tvaddr.setText("Address: " + street_add);

    }




}