package com.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;

public class DemoFLCache {

	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		// ---------session 1--------------
		Session session = factory.openSession();
		Customer customer = session.get(Customer.class, 2L);
		System.out.println(customer);
		session.close();

		// ---------session 2--------------
		Session session2 = factory.openSession();
		Customer customer2 = session2.get(Customer.class, 2L);
		System.out.println(customer2);
		session2.close();

//		Session session = factory.openSession();
//	
//		//hibernate uses first level cache
//		Customer customer=session.get(Customer.class, 2L);
//		//session.evict(customer);//?
//		//session.clear();//aka evictAll
//		System.out.println(customer);
//		Customer customer2=session.get(Customer.class, 2L);
//		
//		System.out.println(customer2);

		factory.close();
	}

}
