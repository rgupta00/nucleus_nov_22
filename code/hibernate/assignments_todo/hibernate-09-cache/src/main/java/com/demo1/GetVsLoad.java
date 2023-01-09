package com.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;

public class GetVsLoad {

	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		//get vs load : session 
		Session session = factory.openSession();
		//proxy object! lazy loading of objects
		Customer customer = session.load(Customer.class, 20L);
		// load will throw ObjectNotFoundException if object is not found
		/*
		 * mapping : type			mode
		 * 			one to one		eager 
		 * 			one to many		lazy
		 * 			many to many	lazy
		 * 			many to one		eager
		 * 
		 */
		System.out.println("-------------------");
		System.out.println(customer);
		System.out.println("####################");
		session.close();
		
		factory.close();
	}

}
