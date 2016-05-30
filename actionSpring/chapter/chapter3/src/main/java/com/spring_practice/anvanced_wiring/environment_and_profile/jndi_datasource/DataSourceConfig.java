package com.spring_practice.anvanced_wiring.environment_and_profile.jndi_datasource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

/**
 * Created by nn_liu on 2016/5/30.
 */

/**
 * @Profile可以分离项目执行环境
 */
@Configuration
public class DataSourceConfig {

    /* JNDI DataSource */
    @Bean
    @Profile("prod")
    public DataSource jndiDataSource(){
        JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
        jndiObjectFactoryBean.setJndiName("jdbc/myDS");
        jndiObjectFactoryBean.setResourceRef(true);
        jndiObjectFactoryBean.setProxyInterface(DataSource.class);
        return (DataSource)jndiObjectFactoryBean.getObject();
    }
}
