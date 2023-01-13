package com.productapp.web.controller;

import com.productapp.config.ModelConfig;
import com.productapp.model.dao.entities.Category;
import com.productapp.model.dao.entities.UserEntity;
import com.productapp.model.service.CategoryService;
import com.productapp.model.service.UserService;
import org.hibernate.dialect.MySQL57Dialect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       /* ApplicationContext ctx=
              new ClassPathXmlApplicationContext("model-config.xml");*/

//        AnnotationConfigApplicationContext ctx
//                =new AnnotationConfigApplicationContext(ModelConfig.class);
//        UserService userService=ctx.getBean("userService", UserService.class);
//
//        List<UserEntity> userEntities=userService.getAllUsers();
//        for (UserEntity userEntity : userEntities) {
//            System.out.println(userEntity);
//        }

                AnnotationConfigApplicationContext ctx
                =new AnnotationConfigApplicationContext(ModelConfig.class);

        UserService userService=ctx.getBean("userService", UserService.class);
        //(String email, String username, String password, String mobile, String profile)
        UserEntity user1=new UserEntity("raj@nu.com","raj","raj121","645464666",
                List.of("ROLE_ADMIN","ROLE_MGR","ROLE_EMP"));
        UserEntity user2=new UserEntity("ekta@nu.com","ekta","ekta121","645464666",
                List.of("ROLE_MGR","ROLE_EMP"));
        UserEntity user3=new UserEntity("gun@nu.com","gun","gun121","645464666",
                List.of("ROLE_EMP"));


        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);


//        LinkedList<String> names=new LinkedList<>();
//        if(names.size()>0)
//        System.out.println(names.get(0));
//        else
//        System.out.println("--------");
       // PersistenceExceptionTranslationPostProcessor

        //BCryptPasswordEncoder
        //DelegatingFilterProxy
        //InternalResourceViewResolver
       // MySQL57Dialect
     //   HibernateTransactionManager
        //LocalSessionFactoryBean
       // DriverManagerDataSource
        //DispatcherServlet
//        ApplicationContext ctx=
//                new ClassPathXmlApplicationContext("model-config.xml");
//
//        CategoryService categoryService=ctx.getBean("categoryService", CategoryService.class);
//
//        List<Category> categories=categoryService.getAllCategories();
//        for (Category category : categories) {
//            System.out.println(category);
//        }
////
//        Category category=new Category("Electronics");
//        Category category2=new Category("Book");
//
//        categoryService.addCategory(category);
//        categoryService.addCategory(category2);
    }
}
