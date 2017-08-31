package com.example.android.bucharest_tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> shopping = new ArrayList<Location>();
        shopping.add(new Location(getString(R.string.Baneasa), R.drawable.baneasa));
        shopping.add(new Location(getString(R.string.Afi_Pallace_Mall),R.drawable.afi));
        shopping.add(new Location(getString(R.string.Promenada_Mall),R.drawable.promenada));

        LocationAdapter itemsAdapter = new LocationAdapter(this, shopping);

        ListView listView = (ListView) findViewById(R.id.listID);

        listView.setAdapter(itemsAdapter);
        //from here I implement the on item click for the list view Traditional Restaurants !!!!!!!!
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {

                    case 0:
                        Intent baneasaIntent = new Intent(Shopping.this, AllLocations.class);
                        baneasaIntent.putExtra("one", "From_Activity_3A");
                        startActivity(baneasaIntent);
                        break;

                    case 1:
                        Intent afiIntent = new Intent(Shopping.this, AllLocations.class);
                        afiIntent.putExtra("one", "From_Activity_3B");
                        startActivity(afiIntent);
                        break;

                    case 2:
                        Intent promenadaIntent = new Intent(Shopping.this, AllLocations.class);
                        promenadaIntent.putExtra("one", "From_Activity_3C");
                        startActivity(promenadaIntent);
                        break;
                }
            }
        });


    }
}
