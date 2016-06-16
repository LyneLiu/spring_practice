package com.springinaction.springidol.xml_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nn_liu on 2016/6/15.
 */
public class PerformanceMain {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "classpath:spring-performers-config.xml");

        /*示例1*/
        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();

        Performer performerConstructor = (Performer) ctx.getBean("dukeConstructor");
        performerConstructor.perform();

        /*示例2：通过构造器注入引用对象*/
        PoeticJuggler performerPoem = (PoeticJuggler) ctx.getBean("defaultPoemJuggler");
        performerPoem.perform();

        PoeticJuggler performerPoemJuggler = (PoeticJuggler) ctx.getBean("poemJuggler");
        performerPoemJuggler.perform();
    }
}
