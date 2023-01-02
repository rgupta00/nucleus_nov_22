package com.customer.controller;
//ML
import java.util.*;

import com.customer.config.AppConfig;
import com.customer.config.AppConfigV2;
import com.customer.config1.AppConfigV3;
import com.customer.dao.Customer;
import com.customer.service.CustomerService;
import com.customer.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx=
                new AnnotationConfigApplicationContext(AppConfigV3.class);

//        ApplicationContext ctx=
//                new ClassPathXmlApplicationContext(new String[]{"app-config.xml","db-config.xml"});
        CustomerService customerService=ctx.getBean("customerService", CustomerService.class);
        List<Customer>customers=customerService.getAll();
        customers.forEach(c-> System.out.println(c));




        //ClassPathXmlApplicationContext
//        ApplicationContext ctx=
//                new AnnotationConfigApplicationContext(AppConfigV2.class);
//        CustomerService customerService=ctx.getBean("customerService", CustomerService.class);
//       List<Customer>customers=customerService.getAll();
//        customers.forEach(c-> System.out.println(c));
        //| id | name  | address | mobile    | email
      // Customer customer=new Customer("pawan","delhi","757546666","pawan@gmail.com");

        //customerService.addCustomer(customer);
//        Customer customer=customerService.getById(4);
//        customer.setAddress("NY");
//        customerService.updateCustomer(4, customer);
//        List<Customer>customers=customerService.getAll();
//        customers.forEach(c-> System.out.println(c));

    }
}
