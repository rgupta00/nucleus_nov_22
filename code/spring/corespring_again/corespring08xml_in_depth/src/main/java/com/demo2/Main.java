package com.demo2;

import com.demo1.Company;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        AbstractApplicationContext ctx=
                new ClassPathXmlApplicationContext("demo2.xml");
        Country country=ctx.getBean("country" ,Country.class);
        country.printCountryDetails();

    }
}
