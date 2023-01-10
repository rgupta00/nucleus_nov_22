package com.demo.inh.table_per_con_class;

import com.demo.factory.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DemoTester {

	public static void main(String[] args) {

		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();// getCurrentSession (web application spring)

		session.getTransaction().begin();
		
//		Account account1=new SavingAccount("ravi", 5600, .4);
//		Account account2=new SavingAccount("seema", 5690, .4);
//
//		Account account3=new CurrentAccount("umesh", 5600, 400);
//		Account account4=new CurrentAccount("foo", 5600, 400);
//		Account account5=new CurrentAccount("bar", 5600, 400);
//
////
//		session.save(account1);
//		session.save(account2);
//		session.save(account3);
//		session.save(account4);
//		session.save(account5);
//		session.save(account2);

//
		//it support poly quaries
		
//		List<Account> accounts=session.createQuery("select a from Account a").getResultList();
//		accounts.forEach(System.out::println);
////
		List<SavingAccount> accounts=session.createQuery("select a from SavingAccount a").getResultList();
		accounts.forEach(System.out::println);
//

		session.getTransaction().commit();
		

		session.close();

		factory.close();


	}

}
