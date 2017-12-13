package edu.umd.scavengerhunt.scavengerhunt;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

import edu.umd.scavengerhunt.scavengerhunt.utilities.ScavengerHunt;

public class Explore extends AppCompatActivity implements Nav_Bar_frag.OnFragmentInteractionListener{

    private ListView mListView;
    private String[] arraySpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        this.arraySpinner = new String[] {"Proximity", "Popularity", "Saved"};
        Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> spinAdapter = new ArrayAdapter<String>(this,
                R.layout.spinner_item, arraySpinner);
        s.setAdapter(spinAdapter);

        mListView = (ListView) findViewById(R.id.scavenger_hunt_list_view);

        MainApplication mainApp = (MainApplication)getApplicationContext();
//        String firstDest = mainApp.destinationsByName.firstKey();
////
////        System.out.println(firstDest);
//        Log.d("data", firstDest);

        final ArrayList<ScavengerHunt> hunts = new ArrayList<>(mainApp.huntsByName.values());

        ScavengerHuntAdapter huntAdapter = new ScavengerHuntAdapter(this, hunts);
        mListView.setAdapter(huntAdapter);

        // info to display recipe details
        final Context context = this;
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ScavengerHunt selectedHunt = hunts.get(position);

                Intent detailIntent = new Intent(context, Explore_Info_Page.class);

                detailIntent.putExtra("title", selectedHunt.title);
//                detailIntent.putExtra("url", selectedRecipe.instructionUrl);

                startActivity(detailIntent);
            }

        });
    }




    @Override
    public void onFragmentInteraction(Uri uri)
    {
        //TO DO
    }

}
