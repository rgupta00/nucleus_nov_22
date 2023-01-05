package com.bankapp.web.controlller;

import com.bankapp.exceptions.BException;
import com.bankapp.service.facade.BankService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)throws BException{
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bankapp.xml");

       // RecordService recordService=ctx.getBean("recordService", RecordService.class);
       // AccountService accountService=ctx.getBean("accountService",AccountService.class);

        BankService bankService=ctx.getBean("bs", BankService.class);
        bankService.transfer(3, 4, 10);

//        List<Account> accounts=accountService.getAll();
//        accounts.forEach(a-> System.out.println(a));
//
//       accountService.transfer(3, 4, 10);
//
//        accounts=accountService.getAll();
//        accounts.forEach(a-> System.out.println(a));

    }
}
