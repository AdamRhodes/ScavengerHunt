package edu.umd.scavengerhunt.scavengerhunt;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Explore extends AppCompatActivity implements Nav_Bar_frag.OnFragmentInteractionListener{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

//        MainApplication mainApp = (MainApplication)getApplicationContext();
//        String firstDest = mainApp.destinationsByName.firstKey();
//
//        System.out.println(firstDest);
    }




    @Override
    public void onFragmentInteraction(Uri uri)
    {
        //TO DO
    }

}
