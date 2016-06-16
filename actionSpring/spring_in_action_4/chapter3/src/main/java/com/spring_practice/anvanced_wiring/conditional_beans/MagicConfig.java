package com.spring_practice.anvanced_wiring.conditional_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by nn_liu on 2016/5/30.
 */

@Configuration
@PropertySource("classpath:conditional_beans/config.properties")
public class MagicConfig {

    /**
     * 通过设置Conditional条件，判断是否在Spring容器中实例化Bean
     * @return
     */
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        return new MagicBean();
    }

}
