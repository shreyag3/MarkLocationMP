package com.example.cs125finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.view.View;

import android.widget.Button;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView latitude;
    private TextView longitude;
    private double actualLat;
    private double actualLong;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_call);

        latitude = findViewById(R.id.editText2);

        longitude = findViewById(R.id.longitude);



        final Button Search = findViewById(R.id.button);
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lat = latitude.getText().toString();
                String longi = longitude.getText().toString();
                Log.d("asdf", lat);
                Log.d("asdf", longi);
                actualLat = Double.parseDouble(lat);
                actualLong = Double.parseDouble(longi);
                Log.d(TAG, "what");



                Intent next = new Intent(MainActivity.this, MapsActivity.class);
                next.putExtra("latitude", actualLat);
                next.putExtra("longitude", actualLong);
                startActivity(next);
            }
            });
    }
}
