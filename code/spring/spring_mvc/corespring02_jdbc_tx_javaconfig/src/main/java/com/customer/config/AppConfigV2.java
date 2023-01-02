package com.customer.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
public class AppConfigV2 {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.driver}")
    private String driverName;

    @Value("${jdbc.pool.initialSize}")
    private int initialSize;


    @Bean
    public BasicDataSource getBasicDataSource(){
        BasicDataSource ds=new BasicDataSource();
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setUrl(url);
        ds.setDriverClassName(driverName);
        ds.setInitialSize(initialSize);
        return ds;
    }
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager txMgr= new DataSourceTransactionManager();
        txMgr.setDataSource(dataSource);
        return txMgr;
    }
}
