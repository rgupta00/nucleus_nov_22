package com.demo.one2many_wrong;

import com.demo.factory.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DemoTester {

	public static void main(String[] args) {

		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();// getCurrentSession (web application spring)


		session.close();

		factory.close();

	}

}
