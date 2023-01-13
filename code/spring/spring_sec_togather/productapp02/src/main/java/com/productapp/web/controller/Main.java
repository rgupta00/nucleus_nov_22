package com.productapp.web.controller;

import com.productapp.model.dao.entities.Category;
import com.productapp.model.service.CategoryService;
import org.hibernate.dialect.MySQL57Dialect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

public class Main {

    public static void main(String[] args) {
       // PersistenceExceptionTranslationPostProcessor

        //BCryptPasswordEncoder
        //DelegatingFilterProxy
        //InternalResourceViewResolver
       // MySQL57Dialect
     //   HibernateTransactionManager
        //LocalSessionFactoryBean
       // DriverManagerDataSource
        //DispatcherServlet
        ApplicationContext ctx=
                new ClassPathXmlApplicationContext("model-config.xml");

        CategoryService categoryService=ctx.getBean("categoryService", CategoryService.class);

        List<Category> categories=categoryService.getAllCategories();
        for (Category category : categories) {
            System.out.println(category);
        }
//
//        Category category=new Category("Electronics");
//        Category category2=new Category("Book");
//
//        categoryService.addCategory(category);
//        categoryService.addCategory(category2);
    }
}
