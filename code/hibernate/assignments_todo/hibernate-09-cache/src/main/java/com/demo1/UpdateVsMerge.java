package com.demo1;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;

public class UpdateVsMerge {

	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		
		//-------i open session and get a customer then close that session
		Session session = factory.openSession();
		Customer customer=session.get(Customer.class, 1L); //customer is a detached object
		session.close();
		customer.setCustomerName("rajiv");
		customer.setCustomerAddess("usa");
		
		//---------i open another session2...
		Session session2 = factory.openSession();
		session2.getTransaction().begin();
		Customer customer2=session2.get(Customer.class, 1L); //customer is a detached object
		customer2.setCustomerAddess("norway");

		session2.merge(customer);
		
		session2.getTransaction().commit();
		
		session2.close();
		
	
		factory.close();
	}

}
