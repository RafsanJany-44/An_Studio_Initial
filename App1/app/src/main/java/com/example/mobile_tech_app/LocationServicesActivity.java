package com.example.mobile_tech_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public class LocationServicesActivity extends AppCompatActivity {

    MyLocationPlaceMap myLocationPlaceMap;
    ArrayList<MyLocationPlace> myLocations = new ArrayList<>();
    MyLocationPlace myLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_services);
        myLocationPlaceMap = new MyLocationPlaceMap(getApplicationContext(),LocationServicesActivity.this);
        myLocationPlaceMap.requestPermissions();
        myLocationPlaceMap.getLatLngAddress(myLocations);


    }

    public void viewMap(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
    public void showCurrentLocation(View view) {
        myLocationPlaceMap.getLatLngAddress(myLocations);
        TextView tvlat = findViewById(R.id.take_latitude);
        TextView tvlng = findViewById(R.id.teke_longitude);
        TextView tvaddr = findViewById(R.id.take_st_add);
        if (myLocations.size() > 0) {
            myLocation = myLocations.get(0);
            myLocations.clear();
            tvlat.setText("Latitude: " + myLocation.getLatitude());
            tvlng.setText("Longitude: " + myLocation.getLongitude());
            tvaddr.setText("Address: " + myLocation.getAddress());

        }
    }


}