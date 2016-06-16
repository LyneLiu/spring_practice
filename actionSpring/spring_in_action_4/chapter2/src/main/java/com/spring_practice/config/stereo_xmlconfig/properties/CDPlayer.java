package com.spring_practice.config.stereo_xmlconfig.properties;

import com.spring_practice.config.stereo_xmlconfig.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by nn_liu on 2016/5/27.
 */
public class CDPlayer {

    private CompactDisc cd;

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

}
