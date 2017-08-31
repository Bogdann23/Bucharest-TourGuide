package com.example.android.bucharest_tourguide;

/**
 This is the custom Object to create a custom list instead of string list we will have a
 location list that will contain besides String images also
 **/


public class Location {

    private String mLocation;

    //IMAGE RESOURCE iD FOR THE LOCATION
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Constant value that represents no image was provided for this LOCATION
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String location, int ImageResourceId) {
        mLocation = location;
        mImageResourceId = ImageResourceId;

    }
    //get location name
    public String getListItem() {
        return mLocation;
    };

    //Get LOCATION image
    public int getImageResourceId() {
        return mImageResourceId;
    };
    //returns whether or not there is an image for this location
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    };
}

