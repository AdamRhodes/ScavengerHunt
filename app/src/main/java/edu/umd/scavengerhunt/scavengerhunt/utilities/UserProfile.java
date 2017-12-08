package edu.umd.scavengerhunt.scavengerhunt.utilities;

import java.util.*;

/**
 * Class to store data and information about a particular user.
 */
public abstract class UserProfile {

    /* name of user */
    String username;

    /* id of user */
    int id;

    /* list of scavenger hunts created by the user */
    List<Integer> savedHunts;

    /**
     * UserProfile constructor.
     * @param username
     * @param id
     */
    public UserProfile(String username, int id) {
        this.username = username;
        this.id = id;
        this.savedHunts = new ArrayList<>();
    }

    /**
     * Adds the given scavenger hunt to the list of hunts created by the user.
     * @param hunt
     */
    public void addHunt(ScavengerHunt hunt) {
        //TODO
    }
}
