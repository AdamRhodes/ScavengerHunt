package edu.umd.scavengerhunt.scavengerhunt.utilities;

import java.util.*;

/**
 * Created by merlinlevine on 12/7/17.
 */

public abstract class UserProfile {

    String username;
    int id;
    List<Integer> savedHunts;

    public UserProfile(String username, int id) {
        this.username = username;
        this.id = id;
        this.savedHunts = new ArrayList<>();
    }
}
