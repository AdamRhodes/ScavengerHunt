package edu.umd.scavengerhunt.scavengerhunt.utilities;

import java.io.File;
import java.util.*;

/**
 * Class to store data and information about a particular scavenger hunt game.
 */
public abstract class ScavengerHunt {

    /* name of the hunt */
    String title;

    /* description of the hunt */
    String description;

    /* file path to cover image */
    File coverImg;

    /* unique id of the hunt */
    int id;

    /* rating out of 5 */
    double starRating;

    /* number of total ratings */
    int numRatings;

    /* id of the hunt creator */
    int creatorId;

    /* list of target destinations throughout the hunt */
    List<Destination> destinations;

    public ScavengerHunt(String title, String description, File coverImg, int id, int creatorId) {
        this.title = title;
        this.description = description;
        this.coverImg = coverImg;
        this.id = id;
        this.starRating = 5;
        this.numRatings = 0;
        this.creatorId = creatorId;
        this.destinations = new ArrayList<>();
    }

    public void addDestination(Destination dest) {
        // TODO
    }

    public double getRating() {
        // TODO
        return 0;
    }

    public double getDistanceToStart(GeoPoint coordinate) {
        // TODO
        return 0;
    }

    public double getTotalDistance() {
        // TODO
        return 0;
    }

}
