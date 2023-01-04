package com.bankapp.web.controlller;
import java.util.*;

import com.bankapp.dao.Account;
import com.bankapp.exceptions.BException;
import com.bankapp.service.AccountService;
import com.bankapp.service.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bankapp.xml");

        AccountService accountService=ctx.getBean("accountService",AccountService.class);

        List<Account> accounts=accountService.getAll();
        accounts.forEach(a-> System.out.println(a));

         accountService.transfer(3, 4, 10);

        accounts=accountService.getAll();
        accounts.forEach(a-> System.out.println(a));

    }
}
