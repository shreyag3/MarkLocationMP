package com.example.cs125finalproject;

public class LocationActivity {
    private double Longitude = 0;
    private double Latitude = 0;
    public LocationActivity(double x, double y) {
        if (x >= -180 && x <= 180) {
            Longitude = x;
        }
        if (y >= -90 && y <= 90) {
            Latitude = y;
        }

    }

    public double getLatitude() {
        return Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }
}
