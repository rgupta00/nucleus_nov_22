package com.demo2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("demo2.xml");
		//Shape shape=ctx.getBean("shape", Shape.class);
		//shape.printShape();
		Point point=ctx.getBean("p2_alias", Point.class);
		Point point2=ctx.getBean("p2", Point.class);
		System.out.println(point.hashCode());
		System.out.println(point.hashCode());
		
		
	}

}
