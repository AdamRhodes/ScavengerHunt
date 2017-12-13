package edu.umd.scavengerhunt.scavengerhunt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;

import edu.umd.scavengerhunt.scavengerhunt.utilities.ScavengerHunt;

/**
 * Created by merlinlevine on 12/11/17.
 */

public class ScavengerHuntAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<ScavengerHunt> mDataSource;

    public ScavengerHuntAdapter(Context context, ArrayList<ScavengerHunt> items) {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get view for row item
        View rowView = mInflater.inflate(R.layout.list_item_scavenger_hunt, parent, false);

        // Get title element
        TextView titleTextView = (TextView) rowView.findViewById(R.id.scavenger_hunt_list_title);

        // Get subtitle element
        TextView subtitleTextView = (TextView) rowView.findViewById(R.id.scavenger_hunt_list_subtitle);

        // Get distance element
        TextView distanceTextView = (TextView) rowView.findViewById(R.id.scavenger_hunt_list_distance);

        // Get distance element
        RatingBar ratingRatingBar = (RatingBar) rowView.findViewById(R.id.scavenger_hunt_list_rating);

        // Get detail element
        TextView numRatingTextView = (TextView) rowView.findViewById(R.id.scavenger_hunt_list_numRating);

        // Get detail element
        TextView detailTextView = (TextView) rowView.findViewById(R.id.scavenger_hunt_list_detail);

        // Get thumbnail element
        ImageView thumbnailImageView = (ImageView) rowView.findViewById(R.id.scavenger_hunt_list_thumbnail);

        ScavengerHunt hunt = (ScavengerHunt) getItem(position);

        titleTextView.setText(hunt.title);
        subtitleTextView.setText(hunt.description);
        distanceTextView.setText("Distance to start " + hunt.creatorId + " mi");
        ratingRatingBar.setRating(4.5f);
        numRatingTextView.setText(hunt.numRatings + " Ratings");
//        detailTextView.setText(hunt.label);

        Picasso.with(mContext).load(hunt.imgId).placeholder(R.mipmap.ic_launcher).into(thumbnailImageView);

//        Log.d("image path: ", "" + hunt.imgId);

//        // updating fonts
//        Typeface titleTypeFace = Typeface.createFromAsset(mContext.getAssets(), "fonts/JosefinSans-Bold.ttf");
//        titleTextView.setTypeface(titleTypeFace);
//
//        Typeface subtitleTypeFace =
//                Typeface.createFromAsset(mContext.getAssets(), "fonts/JosefinSans-SemiBoldItalic.ttf");
//        subtitleTextView.setTypeface(subtitleTypeFace);
//
//        Typeface detailTypeFace = Typeface.createFromAsset(mContext.getAssets(), "fonts/Quicksand-Bold.otf");
//        detailTextView.setTypeface(detailTypeFace);
//
//        // update colors
//        detailTextView.setTextColor(ContextCompat.getColor(mContext, LABEL_COLORS.get(recipe.label)));

        return rowView;
    }
}
