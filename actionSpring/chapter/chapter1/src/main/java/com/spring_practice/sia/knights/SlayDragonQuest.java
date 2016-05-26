package com.spring_practice.sia.knights;

import java.io.PrintStream;

/**
 * Created by nn_liu on 2016/5/26.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        System.out.println("Embarking on quest to slay the dragon!");
    }
}
