package com.demo1;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.factory.HibernateSessionFactory;

public class DemoCustomer {

	public static void main(String[] args) {
		SessionFactory factory=HibernateSessionFactory.getSessionFactory();
		
		Session session=factory.openSession();
		
		Customer customer=new Customer("raj", "delhi");
		Customer customer2=new Customer("gun", "delhi");
		
		Product product=new Product("Laptop");
		
//		
		Transaction tx=session.getTransaction();
		
		try {
			tx.begin();
			session.save(customer);
			session.save(customer2);
			session.save(product);
			System.out.println("---------------------");
			tx.commit();
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		session.close();
		factory.close();
	}
}
