package com.example.android.bucharest_tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TraditionalRestaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> restaurants = new ArrayList<Location>();
        restaurants.add(new Location(getString(R.string.Hanul), R.drawable.manuc));
        restaurants.add(new Location(getString(R.string.Caru_cu_Bere), R.drawable.car));
        restaurants.add(new Location(getString(R.string.Rest_Vatra), R.drawable.vatra));


        // Create an {@link ArrayAdapter}, whose data source is a location_list of Strings. The
        // adapter knows how to create layouts for each item in the location_list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This location_list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        LocationAdapter itemsAdapter = new LocationAdapter(this, restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called location_list, which is declared in the
        // activity_numbers.xml layout file.
        //find the list
        ListView listView = (ListView) findViewById(R.id.listID);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display location_list items for each word in the location_list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);

        //from here I implement the on item click for the list view Traditional Restaurants !!!!!!!!
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {

                    case 0:
                        Intent hanIntent = new Intent(TraditionalRestaurants.this, AllLocations.class);
                        hanIntent.putExtra("one", "From_Activity_2A");
                        startActivity(hanIntent);
                        break;

                    case 1:
                        Intent carIntent = new Intent(TraditionalRestaurants.this, AllLocations.class);
                        carIntent.putExtra("one", "From_Activity_2B");
                        startActivity(carIntent);
                        break;

                    case 2:
                        Intent restaurantIntent = new Intent(TraditionalRestaurants.this, AllLocations.class);
                        restaurantIntent.putExtra("one", "From_Activity_2C");
                        startActivity(restaurantIntent);
                        break;
                }
            }
        });


    }
}
