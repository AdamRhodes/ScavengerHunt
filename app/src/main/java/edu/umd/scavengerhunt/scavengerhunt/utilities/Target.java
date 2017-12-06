package edu.umd.scavengerhunt.scavengerhunt.utilities;

//import com.google.android.maps.GeoPoint;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Class to package target location information.
 */
public class Target {

    String clue;

    Path imgPath;

    //GeoPoint location;

    public Target(String clue, String imgPath, double latitude, double longitude) {
        this.clue = clue;
        this.imgPath = Paths.get(imgPath);
        //this.location = new GeoPoint(latitude, longitude);
    }
}
