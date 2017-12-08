package edu.umd.scavengerhunt.scavengerhunt;

import java.util.*;
import edu.umd.scavengerhunt.scavengerhunt.utilities.ScavengerHunt;

/**
 * Class that keeps track of current game progression.
 */
public class Game {

    /* scavenger hunt associated with the current game */
    ScavengerHunt hunt;

    /* timestamp at start of game */
    long startTimestamp;

    /* list of timestamps for each solved clue */
    List<Long> timestamps;

    /* number of current clue and next open slot in timestamps */
    int nextIdx;

    /**
     * Game constructor.
     * @param hunt
     */
    public Game(ScavengerHunt hunt) {
        this.hunt = hunt;
        this.startTimestamp = System.currentTimeMillis();
        this.timestamps = new ArrayList<>();
        this.timestamps.add(this.startTimestamp);
        this.nextIdx = 1;
    }

    /**
     * Returns the nth clue in the scavenger hunt.
     * @param n
     * @return
     */
    public String getClue(int n) {
        //TODO
        return null;
    }

    /**
     * Returns the timestamp of the nth solved clue.
     * @param n
     * @return
     */
    public int getTimeStamp(int n) {
        //TODO
        return 0;
    }

    /**
     * A workhorse method that is triggered when the location of the user intersects with
     * the geofence of the current target destination, indicating that the current clue
     * is solved. Updates state fields accordingly.
     */
    public void visitNextDestination() {
        //TODO
    }

    /**
     * Returns the next unsolved clue.
     * @return
     */
    public String getNextClue() {
        //TODO
        return null;
    }

    /**
     * Returns the current progress (the current clue number) of the player.
     * @return
     */
    public int getProgress() {
        //TODO
        return 0;
    }

}
