package edu.umd.scavengerhunt.scavengerhunt;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity implements Nav_Bar_frag.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    @Override
    public void onFragmentInteraction(Uri uri)
    {
        //TO DO
    }
}
