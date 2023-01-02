package com.customer.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//@Configuration
//@ComponentScan(basePackages = {"com.customer.*"})
//@EnableAspectJAutoProxy // <aop:aspectj-autoproxy/>
//@EnableTransactionManagement //  <tx:annotation-driven transaction-manager="txMgr"/>
//@PropertySource("classpath:db.properties")//  <context:property-placeholder location="classpath:db.properties"/>
public class AppConfig {
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
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager txMgr= new DataSourceTransactionManager();
        txMgr.setDataSource(dataSource);
        return txMgr;
    }
}
