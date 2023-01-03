package com.bankapp.web.controller;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankapp.model.dao.Account;
import com.bankapp.model.service.AccountService;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bank.xml");
		
		AccountService accountService=(AccountService) ctx.getBean("accountService");
		
		//List<Account> accounts=accountService.getAll();
		//accounts.forEach(a-> System.out.println(a));
		//System.out.println(account);
		
		accountService.transfer(1, 2, 1000);
		
	//	Account account=accountService.getById(2);
		//System.out.println(account);
		
	}

}
