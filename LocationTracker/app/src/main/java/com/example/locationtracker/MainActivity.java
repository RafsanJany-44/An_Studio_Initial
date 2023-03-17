package com.example.locationtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MyLocationPlaceMap myLocationPlaceMap;
    ArrayList<MyLocationPlace> myLocations = new ArrayList<>();
    MyLocationPlace myLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLocationPlaceMap = new MyLocationPlaceMap(getApplicationContext(), MainActivity.this);
        myLocationPlaceMap.requestPermissions();
        myLocationPlaceMap.getLatLngAddress(myLocations);
    }

    public void viewMap(View view) {

        Intent intent = new Intent(this, MapsActivity.class);

        startActivity(intent);
    }

    public void viewLocationServices(View view) {
        myLocationPlaceMap.getLatLngAddress(myLocations);
        Intent intent = new Intent(this, LocationServicesActivity.class);
        if (myLocations.size() > 0) {
            myLocation = myLocations.get(0);
            myLocations.clear();
            //System.out.println(myLocation.getAddress());
            //System.out.println(myLocation.getLatitude());
            //System.out.println(myLocation.getLongitude());
            intent.putExtra("Latitude",myLocation.getLatitude());
            intent.putExtra("Longitude",myLocation.getLongitude());
            intent.putExtra("Address",myLocation.getAddress());
        }
        startActivity(intent);
    }



}