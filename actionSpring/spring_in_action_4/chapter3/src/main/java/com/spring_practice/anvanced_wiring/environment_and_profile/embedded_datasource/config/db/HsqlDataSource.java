package com.spring_practice.anvanced_wiring.environment_and_profile.embedded_datasource.config.db;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * Created by nn_liu on 2016/5/30.
 */

@Profile("hsql")
@Configuration
public class HsqlDataSource {

    @Bean(destroyMethod = "shutdown",name = "hSQLDataSource")
    public DataSource hSQLDataSource(){
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("classpath:embedded_datasource/schema.sql")
                .addScript("classpath:embedded_datasource/test-data.sql")
                .build();
    }

}
