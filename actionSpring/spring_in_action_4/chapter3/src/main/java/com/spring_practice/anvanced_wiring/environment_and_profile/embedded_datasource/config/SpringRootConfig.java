package com.spring_practice.anvanced_wiring.environment_and_profile.embedded_datasource.config;

import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * Created by nn_liu on 2016/5/30.
 * 负责数据库的连接工作
 */

@Configuration
@ComponentScan({"com.spring_practice.anvanced_wiring.environment_and_profile.embedded_datasource"})
public class SpringRootConfig {

    @Autowired
    DataSource h2DataSource;

    @Bean
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
        return new NamedParameterJdbcTemplate(h2DataSource);
    }

    @PostConstruct
    public void startDBManager() {

        //hsqldb
        //DatabaseManagerSwing.main(new String[] { "--url", "jdbc:hsqldb:mem:testdb", "--user", "sa", "--password", "" });

        //derby
        //DatabaseManagerSwing.main(new String[] { "--url", "jdbc:derby:memory:testdb", "--user", "", "--password", "" });

        //h2
        DatabaseManagerSwing.main(new String[] { "--url", "jdbc:h2:mem:testdb", "--user", "sa", "--password", "" });

    }

}
