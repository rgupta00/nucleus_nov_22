package com.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext vs FileSystemXmlApplicationContext
		//BeanFactory
//		BeanFactory ctx=new XmlBeanFactory(new ClassPathResource("hello.xml"));
		AbstractApplicationContext ctx=new FileSystemXmlApplicationContext("hello.xml");
		Foo foo=ctx.getBean("foo", Foo.class);
		foo.printMessage();
		//ctx.close();
	}

}
