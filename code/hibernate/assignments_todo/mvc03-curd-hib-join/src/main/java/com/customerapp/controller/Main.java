package com.customerapp.controller;
//ML

import com.customerapp.dao.entity.Customer;
import com.customerapp.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class Main {
    public static void main(String[] args) {

       // HibernateTransactionManager

       // LocalSessionFactoryBean

       // DriverManagerDataSource
        ApplicationContext ctx=
                new ClassPathXmlApplicationContext("demo.xml");
        CustomerService customerService=ctx.getBean("customerService", CustomerService.class);
       List<Customer> customers=customerService.getAll();
       customers.forEach(c-> System.out.println(c));

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
