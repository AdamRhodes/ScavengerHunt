package edu.umd.scavengerhunt.scavengerhunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Helper class to provide nav bar support for all pages within the scavenge app.
 */
public abstract class NavBar extends AppCompatActivity {

    //Navbar
    public void gotoExplore(View view) {

        Intent intent = new Intent(this, Explore.class);
        startActivity(intent);

    }

    public void gotoCreate(View view) {

        Intent intent = new Intent(this, Create.class);
        startActivity(intent);

    }

    public void gotoProfile(View view) {

        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);

    }

    public void gotoSearch(View view) {

        Intent intent = new Intent(this, Search.class);
        startActivity(intent);

    }

}
