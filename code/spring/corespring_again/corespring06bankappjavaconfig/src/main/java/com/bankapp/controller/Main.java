package com.bankapp.controller;
import java.util.*;

import com.bankapp.config.AppConfig;
import com.bankapp.dao.Account;
import com.bankapp.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext applicationContext=
//                new ClassPathXmlApplicationContext("demo.xml");

        ApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(AppConfig.class);

       AccountService accountService=(AccountService) applicationContext.getBean("accountService");
        List<Account> accounts=accountService.getAll();
        System.out.println("---------");
        accounts.forEach(a-> System.out.println(a));
        accountService.transfer(1,2, 100);

        accounts=accountService.getAll();
        System.out.println("---------");
        accounts.forEach(a-> System.out.println(a));


    }
}
