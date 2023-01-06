package com.collection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("coll.xml");
	
		Shape shape=ctx.getBean("shape", Shape.class);
		shape.printShape();
	}

}
