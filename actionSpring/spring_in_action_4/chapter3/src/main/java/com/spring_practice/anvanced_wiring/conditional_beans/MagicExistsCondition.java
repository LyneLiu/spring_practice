package com.spring_practice.anvanced_wiring.conditional_beans;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by nn_liu on 2016/5/30.
 */
public class MagicExistsCondition implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        System.out.println(environment.getProperty("magic"));
        return environment.containsProperty("magic");
    }
}
