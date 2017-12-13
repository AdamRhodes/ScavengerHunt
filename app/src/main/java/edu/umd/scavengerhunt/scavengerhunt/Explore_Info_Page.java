package edu.umd.scavengerhunt.scavengerhunt;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import edu.umd.scavengerhunt.scavengerhunt.utilities.ScavengerHunt;

public class Explore_Info_Page extends AppCompatActivity implements Nav_Bar_frag.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore__info__page);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        MainApplication mainApp = (MainApplication)getApplicationContext();

        final ArrayList<ScavengerHunt> hunts = new ArrayList<>(mainApp.huntsByName.values());


        LayoutInflater mInflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // get hunt that was passed through explore selection
        String huntTitle = getIntent().getExtras().getString("title");

        ScavengerHunt hunt = mainApp.huntsByName.get(huntTitle);

        // Get title element
        TextView titleTextView = (TextView) this.findViewById(R.id.explore_info_title);

        // Get thumbnail element
        ImageView thumbnailImageView = (ImageView) this.findViewById(R.id.explore_info_thumbnail);

        // Get distance element
        RatingBar ratingRatingBar = (RatingBar) this.findViewById(R.id.explore_info_ratingBar);

        // Get title element
        TextView numRatingsTextView = (TextView) this.findViewById(R.id.explore_info_numRating);

        // Get title element
        TextView gameDescriptionTextView = (TextView) this.findViewById(R.id.explore_info_gameDescription);

        titleTextView.setText(hunt.title);
        Picasso.with(this).load(hunt.imgId).placeholder(R.mipmap.ic_launcher).into(thumbnailImageView);
        numRatingsTextView.setText(hunt.numRatings + " Ratings");
        ratingRatingBar.setRating(4.5f);
        gameDescriptionTextView.setText(hunt.description);


        ImageButton playButton = (ImageButton) this.findViewById(R.id.explore_info_playButton);

    }

    public void gotoMapsActivity(View view) {

        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        //TODO
    }
}
