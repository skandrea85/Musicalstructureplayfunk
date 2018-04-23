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
        TextView numbers = (TextView) findViewById(R.id.rock);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link rockActivity}
                Intent numbersIntent = new Intent(MainActivity.this, rockActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        TextView family = findViewById(R.id.folk);

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CountryActivity}
                Intent familyIntent = new Intent(MainActivity.this, CountryActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }


        });
        TextView colors = (TextView) findViewById(R.id.funk);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FunkActivity}
                Intent colorsIntent = new Intent(MainActivity.this, funkActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });


        TextView pharses = (TextView) findViewById(R.id.reggae);

        // Set a click listener on that View
        pharses.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link reggaeActivity}
                Intent pharsesIntent = new Intent(MainActivity.this, reggaeActivity.class);

                // Start the new activity
                startActivity(pharsesIntent);
            }
        });


    }
}
