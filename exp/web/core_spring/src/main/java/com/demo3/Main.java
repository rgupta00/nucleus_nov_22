package com.demo3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("demo3.xml");
		Foo foo=ctx.getBean("foo", Foo.class);
	
		Foo foo2=ctx.getBean("foo", Foo.class);
		
		foo.printMessage();
		foo2.printMessage();
		
		
		
	}

}
