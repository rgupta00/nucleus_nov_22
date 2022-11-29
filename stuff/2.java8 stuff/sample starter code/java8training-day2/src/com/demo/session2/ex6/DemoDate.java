package com.demo.session2.ex6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		//dont work
		//LocalDate date2=new LocalDate();
		
		// current date
		LocalDate date3=LocalDate.now();
		System.out.println(date3);
		System.out.println(date3.getYear());
		System.out.println(date3.getMonthValue());
		System.out.println(date3.getDayOfYear());
		
		//default, ISO_LOCAL_DATE
		 String date = "2016-08-16";
	     LocalDate localDate = LocalDate.parse(date);
	     System.out.println(localDate);
		
		DateTimeFormatter formate=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date4=LocalDate.parse("12/12/2011", formate);
		System.out.println(date4);
		
		//getting age
		LocalDate today=LocalDate.now();
		LocalDate birth=LocalDate.of(1975, 11, 9);
		Period period=Period.between(birth, today);
		System.out.println(period.getYears()+": "+ period.getMonths()+": "+ period.getDays());
		
		
		
		
	}
}
