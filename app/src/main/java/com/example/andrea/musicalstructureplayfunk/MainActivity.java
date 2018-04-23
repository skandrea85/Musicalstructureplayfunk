package com.example.andrea.musicalstructureplayfunk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the rock music
        TextView rock = (TextView) findViewById(R.id.rock);

        // Set a click listener on that View
        rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link rockActivity}
                Intent rockIntent = new Intent(MainActivity.this, rockActivity.class);

                // Start the new activity
                startActivity(rockIntent);
            }
        });

        TextView folk = findViewById(R.id.folk);

        // Set a click listener on that View
        folk.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CountryActivity}
                Intent folkIntent = new Intent(MainActivity.this, CountryActivity.class);

                // Start the new activity
                startActivity(folkIntent);
            }


        });
        TextView funk = (TextView) findViewById(R.id.funk);

        // Set a click listener on that View
        funk.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FunkActivity}
                Intent funkIntent = new Intent(MainActivity.this, funkActivity.class);

                // Start the new activity
                startActivity(funkIntent);
            }
        });


        TextView reggae = (TextView) findViewById(R.id.reggae);

        // Set a click listener on that View
        reggae.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link reggaeActivity}
                Intent reggaeIntent = new Intent(MainActivity.this, reggaeActivity.class);

                // Start the new activity
                startActivity(reggaeIntent);
            }
        });


    }
}
