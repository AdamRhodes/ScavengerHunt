package edu.umd.scavengerhunt.scavengerhunt.utilities;

import java.io.File;
import java.util.*;
//import com.google.android.gms.location


/**
 * Class to store data and information about a particular scavenger hunt game.
 */
public class ScavengerHunt {

    /* name of the hunt */
    public String title;

    /* description of the hunt */
    public String description;

    /* file path to cover image */
    public int imgId;

    /* unique id of the hunt */
    public int id;

    /* rating out of 5 */
    public double starRating;

    /* number of total ratings */
    public int numRatings;

    /* id of the hunt creator */
    public int creatorId;

    /* list of target destinations throughout the hunt */
    public List<Destination> destinations;

    /**
     * ScavengerHunt constructor.
     * @param title
     * @param description
     * @param imgId
     * @param id
     * @param creatorId
     */
    public ScavengerHunt(String title, String description, int imgId, int id, int creatorId, List<Destination> destinations) {
        this.title = title;
        this.description = description;
        this.imgId = imgId; //new File(coverImg);
        this.id = id;
        this.starRating = 5;
        this.numRatings = 0;
        this.creatorId = creatorId;
        this.destinations = (destinations == null) ? new ArrayList<Destination>() : destinations;
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
    public double getDistanceToStart(String coord) {//GeoPoint coordinate) {
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
