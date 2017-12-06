package edu.umd.scavengerhunt.scavengerhunt.utilities;

import java.nio.file.*;
import java.util.HashMap;

/**
 * Class to package game data and information.
 */
public class Game {

    // game title
    String title;

    // path to game cover image
    Path imgPath;

    //
    HashMap<Integer,String> clues;


    public Game(String title, final String imgPath, final HashMap<Integer,String> clues) {
        this.title = title;
        this.imgPath = Paths.get(imgPath);
        this.clues = new HashMap<>(clues);
    }
}
