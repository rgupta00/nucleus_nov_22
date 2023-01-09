package com.demo1;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;

public class SaveVsPersist {

	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		//get vs load : session 
	
		Session session = factory.openSession();
		session.getTransaction().begin();
		
		Customer customer=new Customer("foof", "usa");
		//Serializable save = session.save(customer);
		session.persist(customer);// hibernate in jpa way!
		
		session.getTransaction().commit();
		
		session.close();
		
		factory.close();
	}

}
