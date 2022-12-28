package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoMain {

	private static Logger logger=LoggerFactory.getLogger(DemoMain.class);
	
	public static void main(String[] args) {
		
		logger.info("hello to log4j");
		
		try {
			String no="123A";
			Integer integer=Integer.parseInt(no);
		}catch(NumberFormatException ex) {
			logger.error("hello to log4j");
		}
	}
}
//https://developpaper.com/use-of-slf4j-and-logback-in-maven-project/