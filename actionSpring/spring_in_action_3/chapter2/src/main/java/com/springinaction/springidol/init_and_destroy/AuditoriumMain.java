package com.springinaction.springidol.init_and_destroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nn_liu on 2016/6/16.
 */
public class AuditoriumMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "classpath:spring-init-and-destroy.xml");

        Auditorium auditorium = (Auditorium) ctx.getBean("audiorium");

        ((ClassPathXmlApplicationContext)ctx).close();
    }
}
