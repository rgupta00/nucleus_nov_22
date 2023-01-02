package com.customer.config2;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.customer.*"})
@EnableAspectJAutoProxy
@EnableTransactionManagement
@Import({DbConfig.class})
public class AppConfig4 {
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager txMgr= new DataSourceTransactionManager();
        txMgr.setDataSource(dataSource);
        return txMgr;
    }
}
