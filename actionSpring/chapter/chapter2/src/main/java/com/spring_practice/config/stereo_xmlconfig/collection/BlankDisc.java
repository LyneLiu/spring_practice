package com.spring_practice.config.stereo_xmlconfig.collection;

import com.spring_practice.config.stereo_xmlconfig.CompactDisc;

import java.util.List;

/**
 * Created by nn_liu on 2016/5/27.
 */
public class BlankDisc implements CompactDisc {

    private String title;

    private String artist;

    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing "+title + " by "+artist + "\n tracks: "+ tracks.toString());
    }
}
