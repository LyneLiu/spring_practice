package com.spring_practice.config.stereo_xmlconfig;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by nn_liu on 2016/5/27.
 */
public class CDPlayer implements MyMediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

}
