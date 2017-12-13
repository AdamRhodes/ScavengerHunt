package edu.umd.scavengerhunt.scavengerhunt;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

import edu.umd.scavengerhunt.scavengerhunt.utilities.Destination;
import edu.umd.scavengerhunt.scavengerhunt.utilities.ScavengerHunt;
import edu.umd.scavengerhunt.scavengerhunt.utilities.UserProfile;

/**
 * Singleton Application class to access global ScavengerHunt and Destination objects.
 */
public class MainApplication extends Application {

    private static MainApplication singleton;

    public TreeMap<String, Destination> destinationsByName;

    public TreeMap<String, ScavengerHunt> huntsByName;

    public TreeMap<String, UserProfile> profilesByName;

    public static MainApplication getInstance(){
        return singleton;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;

        profilesByName = new TreeMap<>();
        profilesByName.put("@theriddler", new UserProfile("@theriddler", 1));

        destinationsByName = new TreeMap<>();
        destinationsByName.put("McKeldin Library", new Destination("McKeldin Library",
                "The only time I'm full is when you're stressed.",
                2,38.987188,-76.944959));
        destinationsByName.put("Stamp", new Destination("Stamp",
                "You've probably spent many lunches here.",
                2,38.987852,-76.944882));

        huntsByName = new TreeMap<>();
        huntsByName.put("Testudo's Challenge", new ScavengerHunt("Testudo's Challenge",
                "Testudo wants to test your school spirit!",
                R.drawable.testudo, 1, 1,
                new ArrayList<Destination>(destinationsByName.values())));

        huntsByName.put("Explore Campus", new ScavengerHunt("Explore Campus",
                "See how well you know campus.",
                R.drawable.campus, 1, 1,
                new ArrayList<Destination>(destinationsByName.values())));

        huntsByName.put("Long Walk on the Beach", new ScavengerHunt("Long Walk on the Beach",
                "July in Christmas.",
                R.drawable.beach, 1, 1,
                new ArrayList<Destination>(destinationsByName.values())));

        huntsByName.put("Explore Campus 4!", new ScavengerHunt("Explore Campus 4!",
                "See how well you know campus.",
                1, 1, 1,
                new ArrayList<Destination>(destinationsByName.values())));

        huntsByName.put("Explore Campus 5!", new ScavengerHunt("Explore Campus 5!",
                "See how well you know campus.",
                1, 1, 1,
                new ArrayList<Destination>(destinationsByName.values())));

        huntsByName.put("Explore Campus 6!", new ScavengerHunt("Explore Campus 6!",
                "See how well you know campus.",
                1, 1, 1,
                new ArrayList<Destination>(destinationsByName.values())));

        huntsByName.put("Explore Campus 7!", new ScavengerHunt("Explore Campus 7!",
                "See how well you know campus.",
                1, 1, 1,
                new ArrayList<Destination>(destinationsByName.values())));


    }

}
