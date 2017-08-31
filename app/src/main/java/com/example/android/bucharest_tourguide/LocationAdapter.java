package com.example.android.bucharest_tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bogdan on 21.05.2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

//Resource ID for the backround color of the list of words

    //private int  mColorResourceId;

    public LocationAdapter(Context context, ArrayList<Location> mainAttractions) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, mainAttractions);
        //mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        locationTextView.setText(currentLocation.getListItem());


        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            //Set the ImageView to the image resource specified in the current Word
            iconView.setImageResource(currentLocation.getImageResourceId());

            //Make sure the view is visible
            iconView.setVisibility(View.VISIBLE);
        } else {
            //otherwise hide the ImageView (set visibility to GONE)
            iconView.setVisibility(View.GONE);
        }


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}

