package com.demo.inh.table_per_class;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;

public class DemoTester {

	public static void main(String[] args) {

		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();// getCurrentSession (web application spring)

		session.getTransaction().begin();

		List<Account> accounts = session.createQuery("select a from Account a").getResultList();

		accounts.forEach(ac-> System.out.println(ac));

//		Account account1=new SavingAccount("ravi", 5600, .4);
//		Account account2=new CurrentAccount("umesh", 5600, 400);
//		
//		session.save(account1);
//		session.save(account2);

		session.getTransaction().commit();

		session.close();

		factory.close();

	}

}
