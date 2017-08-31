package com.example.android.bucharest_tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AllLocations extends AppCompatActivity {

    ImageView mImageView;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        mImageView = (ImageView) findViewById(R.id.image);
        mTextView = (TextView) findViewById(R.id.text);

        Intent intent = this.getIntent();
        if (intent != null) {

            String strdata = intent.getExtras().getString("one");

            if (strdata.equals("From_Activity_1A")) {
                mImageView.setImageResource(R.drawable.parliament);
                mTextView.setText(R.string.parliament_palace);

                //set OnClickListener for Directions button in activity
                Button button = (Button) findViewById(R.id.directions);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // doSomeStuff();
                        Intent gps = new Intent(Intent.ACTION_VIEW);
                        gps.setData(Uri.parse("google.navigation:q=Palace of Parliament, Strada Izvor 2-4, București"));
                        startActivity(gps);
                    }
                });
            }

            if (strdata.equals("From_Activity_1B")) {
                mImageView.setImageResource(R.drawable.ateneu);
                mTextView.setText(R.string.romanian_athenaeum);

                //set OnClickListener for Directions button in activity
                Button button = (Button) findViewById(R.id.directions);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // doSomeStuff();
                        Intent gps = new Intent(Intent.ACTION_VIEW);
                        gps.setData(Uri.parse("google.navigation:q=Romanian Athenaeum, Strada Benjamin Franklin 1-3, București 030167"));
                        startActivity(gps);

                    }
                });
            }
            if (strdata.equals("From_Activity_1C")) {
                mImageView.setImageResource(R.drawable.museum);
                mTextView.setText(R.string.village_museum);

                //set OnClickListener for Directions button in activity
                Button button = (Button) findViewById(R.id.directions);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // doSomeStuff();
                        Intent gps = new Intent(Intent.ACTION_VIEW);
                        gps.setData(Uri.parse("google.navigation:q=Muzeul Satului, Șoseaua Pavel Dimitrievici Kiseleff, București"));
                        startActivity(gps);

                    }
                });
            }
            if (strdata.equals("From_Activity_2A")) {
                mImageView.setImageResource(R.drawable.manuc);
                mTextView.setText(R.string.Hanul_lui_Manuc);

                //set OnClickListener for Directions button in activity
                Button button = (Button) findViewById(R.id.directions);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // doSomeStuff();
                        Intent gps = new Intent(Intent.ACTION_VIEW);
                        gps.setData(Uri.parse("google.navigation:q=Hanul lui Manuc, București 030167"));
                        startActivity(gps);

                    }
                });
            }
            if (strdata.equals("From_Activity_2B")) {
                mImageView.setImageResource(R.drawable.car);
                mTextView.setText(R.string.Carul_cu_Bere);

                //set OnClickListener for Directions button in activity
                Button button = (Button) findViewById(R.id.directions);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // doSomeStuff();
                        Intent gps = new Intent(Intent.ACTION_VIEW);
                        gps.setData(Uri.parse("google.navigation:q=Caru' cu Bere, Strada Stavropoleos 5, București 030081"));
                        startActivity(gps);

                    }
                });
            }

            if (strdata.equals("From_Activity_2C")) {
                mImageView.setImageResource(R.drawable.vatra);
                mTextView.setText(R.string.Restaurant_Vatra);

                //set OnClickListener for Directions button in activity
                Button button = (Button) findViewById(R.id.directions);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // doSomeStuff();
                        Intent gps = new Intent(Intent.ACTION_VIEW);
                        gps.setData(Uri.parse("google.navigation:q=Restaurant Vatra, 010131, Strada Actor Ion Brezoianu 19, București 030167"));
                        startActivity(gps);

                    }
                });
            }

            if (strdata.equals("From_Activity_3A")) {
                mImageView.setImageResource(R.drawable.baneasa);
                mTextView.setText(R.string.Baneasa_Shopping);

                //set OnClickListener for Directions button in activity
                Button button = (Button) findViewById(R.id.directions);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // doSomeStuff();
                        Intent gps = new Intent(Intent.ACTION_VIEW);
                        gps.setData(Uri.parse("google.navigation:q=Băneasa Shopping City, Șoseaua București-Ploiești 42D, București 015011"));
                        startActivity(gps);

                    }
                });
            }
            if (strdata.equals("From_Activity_3B")) {
                mImageView.setImageResource(R.drawable.afi);
                mTextView.setText(R.string.Afi_Pallace);

                //set OnClickListener for Directions button in activity
                Button button = (Button) findViewById(R.id.directions);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // doSomeStuff();
                        Intent gps = new Intent(Intent.ACTION_VIEW);
                        gps.setData(Uri.parse("google.navigation:q=AFI Cotroceni, Bulevardul Vasile Milea 4, București 061344"));
                        startActivity(gps);

                    }
                });
            }
            if (strdata.equals("From_Activity_3C")) {
                mImageView.setImageResource(R.drawable.promenada);
                mTextView.setText(R.string.Promenada);

                //set OnClickListener for Directions button in activity
                Button button = (Button) findViewById(R.id.directions);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // doSomeStuff();
                        Intent gps = new Intent(Intent.ACTION_VIEW);
                        gps.setData(Uri.parse("google.navigation:q=Promenada Mall, Calea Floreasca 246B, București"));
                        startActivity(gps);

                    }
                });
            }
            if (strdata.equals("From_Activity_4A")) {
                mImageView.setImageResource(R.drawable.herastrau);
                mTextView.setText(R.string.Herastrau);

                //set OnClickListener for Directions button in activity
                Button button = (Button) findViewById(R.id.directions);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // doSomeStuff();
                        Intent gps = new Intent(Intent.ACTION_VIEW);
                        gps.setData(Uri.parse("google.navigation:q=Herăstrău Park, București"));
                        startActivity(gps);

                    }
                });
            }
            if (strdata.equals("From_Activity_4B")) {
                mImageView.setImageResource(R.drawable.cismigiu);
                mTextView.setText(R.string.Cismigiu);

                //set OnClickListener for Directions button in activity
                Button button = (Button) findViewById(R.id.directions);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // doSomeStuff();
                        Intent gps = new Intent(Intent.ACTION_VIEW);
                        gps.setData(Uri.parse("google.navigation:q=Cișmigiu Park, Bulevardul Regina Elisabeta, București 030167"));
                        startActivity(gps);

                    }
                });
            }

            if (strdata.equals("From_Activity_4C")) {
                mImageView.setImageResource(R.drawable.antipa);
                mTextView.setText(R.string.Natural_History);

                //set OnClickListener for Directions button in activity
                Button button = (Button) findViewById(R.id.directions);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // doSomeStuff();
                        Intent gps = new Intent(Intent.ACTION_VIEW);
                        gps.setData(Uri.parse("google.navigation:q=Antipa Museum, Șoseaua Pavel Dimitrievici Kiseleff 1, București 011341"));
                        startActivity(gps);

                    }
                });
            }
        }

    }

}





