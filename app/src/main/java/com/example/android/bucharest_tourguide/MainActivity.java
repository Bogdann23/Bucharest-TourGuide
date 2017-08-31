package com.example.android.bucharest_tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// onclick listener for the first category1111111111111111111111111111111111111111111111111111111111
        // Find the View that shows the Main Attractions category
        TextView attractions = (TextView) findViewById(R.id.attractionsId);

        // Set a click listener on that View
        attractions.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the category Main Attractions is clicked by the user
            @Override
            public void onClick(View view) {
                Intent attractionsIntent = new Intent(MainActivity.this, MainAttractions.class);// intent de la main la mainAtrac..
                //start the new activity
                startActivity(attractionsIntent);
            }
        });
// onclick listener for the second category222222222222222222222222222222222222222222222222222222222

        //// Find the View that shows the Restaurants and Cafes category
        TextView restaurants = (TextView) findViewById(R.id.restaurantsId);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the Restaurants and Cafes category is clicked by the user
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, TraditionalRestaurants.class);// intent de la main la mainAtrac..
                //start the new activity
                startActivity(restaurantsIntent);
            }
        });


        // onclick listener for the third category33333333333333333333333333333333333333333333333333

        //// Find the View that shows the Shopping category
        TextView shopping = (TextView) findViewById(R.id.shoppingId);

        // Set a click listener on that View
        shopping.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the Shopping category is clicked by the user
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this, Shopping.class);// intent de la main la mainAtrac..
                //start the new activity
                startActivity(shoppingIntent);
            }
        });

        // onclick listener for the fourth category4444444444444444444444444444444444444444444444444

        //// Find the View that shows the Free Time Activities category
        TextView freeTime = (TextView) findViewById(R.id.freeTimeId);

        // Set a click listener on that View
        freeTime.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the Free Time Activities category is clicked by the user
            @Override
            public void onClick(View view) {
                Intent freeTimeIntent = new Intent(MainActivity.this, FreeTimeActivities.class);// intent de la main la mainAtrac..
                //start the new activity
                startActivity(freeTimeIntent);
            }
        });
    }


}

