package com.springinaction.springidol.xml_config;

/**
 * Created by nn_liu on 2016/6/15.
 */
public class Sonnet29 implements Poem {

    private static String[] LINES = {
        "test1",
        "test2",
        "test3",
        "test4",
        "test5",
    };

    public void recite() {
        System.out.println(LINES.toString());
    }
}
