package com.spring_practice.config.stereo_autoconfig;

import org.springframework.stereotype.Component;

/**
 * Created by nn_liu on 2016/5/27.
 */

//@Component("customBean")
@Component
public class Firework implements CompactDisc {

    private String title = "Zoro's Firework";

    private String artist = "Java Coder";

    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}
