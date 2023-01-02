package com.customerapp.controller;
import java.util.*;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class Main {
    public static void main(String[] args) {
       // InternalResourceViewResolver
        //DispatcherServlet
        ApplicationContext ctx=new ClassPathXmlApplicationContext("servlet-context.xml");
        CustomerService customerService=ctx.getBean("cs",CustomerService.class);
       // DriverManagerDataSource
        //DataSourceTransactionManager
        //CustomerService customerService=new CustomerServiceImpl();
        List<Customer> customers=customerService.getAll();
        customers.forEach(c-> System.out.println(c));

        //String name, String address, String mobile, String email
//        Customer customer=new Customer("leena","delhi","6465666","leena@gmail.com");
//        customerService.addCustomer(customer);

        //Customer customer=customerService.getById(10);
//        customer.setAddress("Banglore");
//        customer.setEmail("leena.gupta@gmail.com");
//        customerService.updateCustomer(10, customer);

       // customerService.deleteCustomer(10);

    }
}
