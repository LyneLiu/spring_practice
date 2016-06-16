package com.spring_practice.sia.knights;

import com.spring_practice.sia.knights.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by nn_liu on 2016/5/26.
 */
public class KnightMain {
    public static void main(String[] args) {

        /*xml配置方式添加bean*/
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:/spring-mvc.xml");
        ctx.refresh();

        /*注解方式添加bean*/
        AnnotationConfigApplicationContext ctxTest = new AnnotationConfigApplicationContext(KnightConfig.class);

        String[] beans = ctxTest.getBeanDefinitionNames();
        for (String bean:beans) {
            System.out.println(bean);
        }

        Knight knight = (Knight) ctx.getBean("knightConfigTest");
        Quest quest = (Quest) ctx.getBean("questConfigTest");
        knight.embarkOnQuest();
    }
}
