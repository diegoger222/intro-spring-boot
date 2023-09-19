package com.example.introspringboot.models;

public class GeoPoint2D {
    private double lon;
    private double lat;

    
    public GeoPoint2D(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }
    public double getLon() {
        return lon;
    }
    public void setLon(double lon) {
        this.lon = lon;
    }
    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }
    
}
