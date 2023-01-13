package com.productapp.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.security.core.parameters.P;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {"com.productapp.model"})
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
public class ModelConfig {

    @Autowired
    private Environment  environment;


    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder(12);
        return bCryptPasswordEncoder;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor(){
        PersistenceExceptionTranslationPostProcessor postProcessor
                =new PersistenceExceptionTranslationPostProcessor();
        return postProcessor;
    }
    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("jdbc.driver"));
        dataSource.setUrl(environment.getProperty("jdbc.url"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean localSessionFactoryBean(DataSource dataSource){
        LocalSessionFactoryBean localSessionFactoryBean=
                new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(dataSource);
        localSessionFactoryBean.setPackagesToScan(new String[]{"com.productapp.model.dao.entities"});
        localSessionFactoryBean.setHibernateProperties(getProperties());

        return localSessionFactoryBean;
    }
    public Properties getProperties(){
        Properties properties=new Properties();
         properties.setProperty("hibernate.hbm2ddl.auto",environment.getProperty("hibernate.hbm2ddl.auto"));
        properties.setProperty("hibernate.dialect",environment.getProperty("hibernate.dialect"));
        properties.setProperty("hibernate.show_sql",environment.getProperty("hibernate.show_sql"));
        properties.setProperty("hibernate.format_sql",environment.getProperty("hibernate.format_sql"));
        return  properties;
    }
    @Bean
    public HibernateTransactionManager hibernateTransactionManager(SessionFactory sessionFactory){
        HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(sessionFactory);
        return hibernateTransactionManager;
    }
}


