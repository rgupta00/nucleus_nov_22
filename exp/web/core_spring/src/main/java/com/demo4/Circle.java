package com.demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component(value = "circle")
public class Circle {

	@Autowired
	private Point center;
	
	@Autowired
	private MessageSource messageSource;
	
	public void print() {
		//System.out.println("Drawing circle");
		System.out.println(messageSource.getMessage("circle.message", null, "circle details default", null));
		
//		System.out.println("center: "+ center.getX()+": "+ center.getY());
		
		System.out.println(messageSource.getMessage("circle.print",
				new Object[] {center.getX(), center.getY()}, "not found", null));
	}
	
}
