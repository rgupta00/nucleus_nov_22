package com.bankapp.controller;
import java.util.*;

import com.bankapp.dao.Account;
import com.bankapp.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("demo.xml");

//        AccountService accountService=applicationContext.getBean("accservice", AccountService.class);
        AccountService accountService=(AccountService) applicationContext.getBean("accservice");
        List<Account> accounts=accountService.getAll();
        System.out.println("---------");
        accounts.forEach(a-> System.out.println(a));
        accountService.transfer(1,2, 100);

        accounts=accountService.getAll();
        System.out.println("---------");
        accounts.forEach(a-> System.out.println(a));


    }
}
