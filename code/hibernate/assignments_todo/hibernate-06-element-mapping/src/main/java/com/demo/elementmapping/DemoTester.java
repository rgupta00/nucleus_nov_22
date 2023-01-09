package com.demo.elementmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;

public class DemoTester {

	public static void main(String[] args) {

		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();// getCurrentSession (web application spring)

		session.getTransaction().begin();
		
		User user=new User("raj", "raj123");
		user.addEmail("raj@gmail.com");
		user.addEmail("raj@yahoo.com");
		user.addEmail("raj@ymsli.com");
		
		user.addProfile("admin");
		user.addProfile("mgr");
		
		session.save(user);
		
		session.getTransaction().commit();

		session.close();

		factory.close();

		
	}

}
