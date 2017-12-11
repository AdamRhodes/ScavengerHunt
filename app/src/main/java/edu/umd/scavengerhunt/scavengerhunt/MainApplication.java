package edu.umd.scavengerhunt.scavengerhunt;

import android.app.Application;

import java.util.List;
import java.util.TreeMap;

import edu.umd.scavengerhunt.scavengerhunt.utilities.Destination;
import edu.umd.scavengerhunt.scavengerhunt.utilities.ScavengerHunt;

/**
 * Singleton Application class to access global ScavengerHunt and Destination objects.
 */
public class MainApplication extends Application {

    private static MainApplication singleton;

    public TreeMap<String, Destination> destinationsByName;

    public TreeMap<String, ScavengerHunt> huntsByName;

    public static MainApplication getInstance(){
        return singleton;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;

        destinationsByName = new TreeMap<>();
        destinationsByName.put("McKeldin Library", new Destination("McKeldin Library",
                "The only time I'm full is when you're stressed.",
                2,38.987188,-76.944959));
        destinationsByName.put("Stamp", new Destination("Stamp",
                "You've probably spent many lunches here.",
                2,38.987852,-76.944882));

        huntsByName = new TreeMap<>();
        huntsByName.put("Explore Campus!", new ScavengerHunt("Explore Campus!",
                "See how well you know campus.",
                "res/drawable/profile.png", 1, 1,
                (List<Destination>)destinationsByName.values()));


    }

}
