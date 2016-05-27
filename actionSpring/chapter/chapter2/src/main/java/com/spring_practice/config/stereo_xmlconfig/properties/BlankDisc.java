package com.spring_practice.config.stereo_xmlconfig.properties;

/**
 * Created by nn_liu on 2016/5/27.
 */

import com.spring_practice.config.stereo_xmlconfig.CompactDisc;

import java.util.List;

public class BlankDisc implements CompactDisc {
    private String title;

    private String artist;

    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing "+title + " by "+artist + "\n tracks: "+ tracks.toString());
    }
}
