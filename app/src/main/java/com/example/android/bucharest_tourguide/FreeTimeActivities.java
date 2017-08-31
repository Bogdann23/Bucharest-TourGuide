package com.example.android.bucharest_tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FreeTimeActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> freeTime = new ArrayList<Location>();
        freeTime.add(new Location(getString(R.string.Walk_in_Herastrau_Park), R.drawable.herastrau));
        freeTime.add(new Location(getString(R.string.Walk_in_Cismigiu_Gardens), R.drawable.cismigiu));
        freeTime.add(new Location(getString(R.string.Visit_Museum_of_Natural_History), R.drawable.antipa));

        LocationAdapter itemsAdapter = new LocationAdapter(this, freeTime);

        ListView listView = (ListView) findViewById(R.id.listID);

        listView.setAdapter(itemsAdapter);

        //from here I implement the on item click for the list view Traditional Restaurants
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {

                    case 0:
                        Intent herastrauIntent = new Intent(FreeTimeActivities.this, AllLocations.class);
                        herastrauIntent.putExtra("one", "From_Activity_4A");
                        startActivity(herastrauIntent);
                        break;

                    case 1:
                        Intent cismigiuIntent = new Intent(FreeTimeActivities.this, AllLocations.class);
                        cismigiuIntent.putExtra("one", "From_Activity_4B");
                        startActivity(cismigiuIntent);
                        break;

                    case 2:
                        Intent museumIntent = new Intent(FreeTimeActivities.this, AllLocations.class);
                        museumIntent.putExtra("one", "From_Activity_4C");
                        startActivity(museumIntent);
                        break;
                }
            }
        });


    }
}
