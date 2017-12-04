package edu.umd.scavengerhunt.scavengerhunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    //Navbar
    public void gotoExplore(View view)
    {

        Intent intent = new Intent(this, Explore.class);
        startActivity(intent);

    }

    public void gotoCreate(View view)
    {

        Intent intent = new Intent(this, Create.class);
        startActivity(intent);

    }

    public void gotoProfile(View view)
    {

        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);

    }

    public void gotoSearch(View view)
    {

        Intent intent = new Intent(this, Search.class);
        startActivity(intent);

    }
}
