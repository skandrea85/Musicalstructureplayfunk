package com.example.andrea.musicalstructureplayfunk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by andrea on 17/04/18.
 */

public class MusicAdapter extends ArrayAdapter<Musicon> {

    /**
     * Create a new {@link MusicAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs   is the list of {@link Musicon}s to be displayed.
     */
    public MusicAdapter(Context context, ArrayList<Musicon> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.playmusic, parent, false);
        }

        // Get the {@link Musicon} object located at this position in the list
        Musicon currentSong = getItem(position);

        // Find the TextView in the playmusic.xml layout with the ID artist_text_view.
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the artist name from the currentSong object and set this text on
        // the artist TextView.
        artistTextView.setText(currentSong.getArtist());

        // Find the TextView in the playmusic.xml layout with the ID song_text_view.
        TextView songTextView = (TextView) listItemView.findViewById(R.id.Song_text_view);
        // Get the song name from the currentSong object and set this text on
        // the song TextView.
        songTextView.setText(currentSong.getSong());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the playmusic.
        return listItemView;
    }
}
