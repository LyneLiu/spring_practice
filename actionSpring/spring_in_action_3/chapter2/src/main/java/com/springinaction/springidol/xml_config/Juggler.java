package com.springinaction.springidol.xml_config;

/**
 * Created by nn_liu on 2016/6/15.
 */
public class Juggler implements Performer {

    private int beanBags = 3;

    public Juggler(){};

    public Juggler(int beanBags){
        this.beanBags = beanBags;
    }

    public void perform() throws PerformanceException {
        System.out.println("Juggling "+beanBags+" beanbags.");
    }
}
