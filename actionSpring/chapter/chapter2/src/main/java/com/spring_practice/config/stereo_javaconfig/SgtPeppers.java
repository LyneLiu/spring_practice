package com.spring_practice.config.stereo_javaconfig;

import org.springframework.stereotype.Component;

/**
 * Created by nn_liu on 2016/5/27.
 */

public class SgtPeppers implements CompactDisc {

    private String title = "Sgt.Pepper's Lonely hearts Club Band";

    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}
