package com.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;
import java.util.*;

public class DemoTester {

	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();

		List<Book> books = session.createQuery("select b from Book b").setCacheable(true).getResultList();

//		Book book = session.get(Book.class, 2);
//		System.out.println(book);
		session.close();

		Session session2 = factory.openSession();
		List<Book> books2 = session2.createQuery("select b from Book b").setCacheable(true).getResultList();
//		Book book2 = session2.get(Book.class, 2);
//		System.out.println(book2);
		session.close();

		factory.close();

//		
//		session.getTransaction().begin();
////		Book book=new Book("DAQ123", "vidhata old", "foo", new Date(), 600);
////		
////		Book book2=new Book("DAQ223", "life is cool", "bar", new Date(), 500);
////		
////		session.save(book);
////		session.save(book2);
////		
//		session.getTransaction().commit();

	}
}
