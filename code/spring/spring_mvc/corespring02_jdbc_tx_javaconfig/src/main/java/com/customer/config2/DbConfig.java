package com.customer.config2;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:db.properties")
public class DbConfig {
    @Autowired
    private Environment environment;    //spring will populate the values from prop file and provide it to a imp of Env

    @Bean
    public BasicDataSource getBasicDataSource(){
        BasicDataSource ds=new BasicDataSource();
        ds.setUsername(environment.getProperty("jdbc.username"));
        ds.setPassword(environment.getProperty("jdbc.password"));
        ds.setUrl(environment.getProperty("jdbc.url"));
        ds.setDriverClassName(environment.getProperty("jdbc.driver"));
        ds.setInitialSize(Integer.parseInt(environment.getProperty("jdbc.pool.initialSize")));
        return ds;
    }
}
