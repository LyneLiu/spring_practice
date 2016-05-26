package com.spring_practice.sia.knights.config;

import com.spring_practice.sia.knights.BraveKinght;
import com.spring_practice.sia.knights.Knight;
import com.spring_practice.sia.knights.Quest;
import com.spring_practice.sia.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nn_liu on 2016/5/26.
 */

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKinght(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}
