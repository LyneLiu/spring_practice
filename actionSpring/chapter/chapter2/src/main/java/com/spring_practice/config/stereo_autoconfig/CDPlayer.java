package com.spring_practice.config.stereo_autoconfig;

import com.sun.media.jfxmedia.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nn_liu on 2016/5/27.
 */

@Component
public class CDPlayer implements MyMediaPlayer{

    private CompactDisc cd;

    /**
     * 当有多个bean均是继承自同一个interface的情况下，
     * 通过@Autowired实现注入需要指定bean的id，或者直接通过具体implements的类进行注入
     * 比如：目前有Firework和SgtPeppers两个Bean
     */


    /*方法1*/
    /*@Autowired
    public CDPlayer(CompactDisc firework) {
        this.cd = firework;
    }*/

    /*方法2*/
    @Autowired(required = true)
    public CDPlayer(Firework firework) {
        this.cd = firework;
    }

    public void play() {
        cd.play();
    }
}
