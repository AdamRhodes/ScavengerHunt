package edu.umd.scavengerhunt.scavengerhunt.utilities;

/**
 * Created by merlinlevine on 12/7/17.
 */

public abstract class Destination {

    GeoPoint location;
    String clue;
    int id;

    public Destination(double latitude, double longitude, String clue, int id) {
        this.location = new GeoPoint(latitude, longitude);
        this.clue = clue;
        this.id = id;
    }

    public abstract double getDistance(GeoPoint coordinate);
}
