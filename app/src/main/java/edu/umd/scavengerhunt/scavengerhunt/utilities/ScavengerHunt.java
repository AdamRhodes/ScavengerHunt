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

    /**
     * ScavengerHunt constructor.
     * @param title
     * @param description
     * @param coverImg
     * @param id
     * @param creatorId
     */
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

    /**
     * Adds given destination to list of destinations.
     * @param dest
     */
    public void addDestination(Destination dest) {
        // TODO
    }

    /**
     * Returns the current rating for the scavenger hunt.
     * @return
     */
    public double getRating() {
        // TODO
        return 0;
    }

    /**
     * Returns the distance from the given coordinate to the start location of the scavenger hunt.
     * @param coordinate
     * @return
     */
    public double getDistanceToStart(GeoPoint coordinate) {
        // TODO
        return 0;
    }

    /**
     * Returns the total distance of the scavenger hunt (the length of the path between every
     * destination).
     * @return
     */
    public double getTotalDistance() {
        // TODO
        return 0;
    }

}
