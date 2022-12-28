package com.demo1;

import com.demo.Account;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        AbstractApplicationContext ctx=
                new ClassPathXmlApplicationContext("demo1.xml");

        Company company=ctx.getBean("", Company.class);
        System.out.println(company.getCompanyDetails());
    }
}
