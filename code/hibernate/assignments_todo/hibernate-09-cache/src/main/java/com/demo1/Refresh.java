package com.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;

public class Refresh {

	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
	
		Session session = factory.openSession();
		
		Customer customer = session.get(Customer.class, 1L);
		System.out.println(customer);
		try {
			Thread.sleep(90000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		session.refresh(customer);
		System.out.println(customer);
		session.close();
		
		factory.close();
	}

}
