package com.springinaction.springidol.xml_config;

/**
 * Created by nn_liu on 2016/6/15.
 */
public class PoeticJuggler extends Juggler {

    private Poem poem;

    public PoeticJuggler(Poem poem){
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
