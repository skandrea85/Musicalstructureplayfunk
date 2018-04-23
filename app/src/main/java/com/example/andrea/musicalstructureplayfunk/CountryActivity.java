package com.example.andrea.musicalstructureplayfunk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_music);

        ArrayList<Musicon> country  =  new ArrayList<Musicon>();
        country.add(new Musicon("Johnny Cash","I Walk the Line"));

        MusicAdapter adapter = new MusicAdapter (this, country); // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list music file.
        ListView listView = (ListView) findViewById(R.id.music_list);

        // Make the {@link ListView} use the {@link MusicAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Music} in the list.
        listView.setAdapter(adapter);



    }
}
