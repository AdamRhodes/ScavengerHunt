package edu.umd.scavengerhunt.scavengerhunt.utilities;

/**
 * Class to store data and information about a particular scavenger hunt destination.
 */
public class Destination {

    /* google maps coordinate of target destination */
//    GeoPoint location;

    /* title of destination */
    String title;

    /* clue for destination */
    String clue;

    /* id of destination */
    int id;

    /**
     * Destination constructor.
     * @param latitude
     * @param longitude
     * @param title
     * @param clue
     * @param id
     */
    public Destination(String title, String clue, int id, double latitude, double longitude) {
//        this.location = new GeoPoint(latitude, longitude);
        this.title = title;
        this.clue = clue;
        this.id = id;
    }

    /**
     * Returns the distance from the given coordinate to the current destination.
     * @param coordinate
     * @return
     */
//    public double getDistance(GeoPoint coordinate) {
//        //TODO
//        return 0;
//    }
}
