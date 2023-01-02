package com.customer.config1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.customer.*"})
@EnableAspectJAutoProxy // <aop:aspectj-autoproxy/>
@EnableTransactionManagement //  <tx:annotation-driven transaction-manager="txMgr"/>
@PropertySource("classpath:db.properties")//  <context:property-placeholder location="classpath:db.properties"/>
@ImportResource("classpath:db-config.xml")
public class AppConfigV3 {

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
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager txMgr= new DataSourceTransactionManager();
        txMgr.setDataSource(dataSource);
        return txMgr;
    }
}
