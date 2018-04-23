package com.example.andrea.musicalstructureplayfunk;

/**
 * Created by andrea on 17/04/18.
 */

public class Musicon {
    /**
     * Artist name
     */
    private String Artist;

    /**
     * song name
     */
    private String Song;

    /**
     * Create a new Music object.
     */
    public Musicon(String artistOn, String songOn) {
        Artist = artistOn;
        Song = songOn;
    }

    /**
     * Get the artist name.
     */
    public String getArtist() {
        return Artist;
    }

    /**
     * Get the song name.
     */
    public String getSong() {
        return Song;
    }

}
