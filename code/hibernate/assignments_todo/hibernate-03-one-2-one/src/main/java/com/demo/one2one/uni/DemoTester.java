package com.demo.one2one.uni;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.factory.HibernateSessionFactory;

public class DemoTester {

	public static void main(String[] args) {
		
		Employee employee1=new Employee("raj");
		Employee employee2=new Employee("ekta");
		Employee employee3=new Employee("gun");
		Employee employee4=new Employee("keshav");
		Employee employee5=new Employee("vikas");
		
		Parking parking1=new Parking("A12");
		Parking parking2=new Parking("M2");
		Parking parking3=new Parking("B2");
		Parking parking4=new Parking("T11");
		Parking parking5=new Parking("U12");
		
		
		parking1.setEmployee(employee1);
		parking2.setEmployee(employee2);
		parking3.setEmployee(employee3);
		parking4.setEmployee(employee4);
		parking5.setEmployee(employee5);
		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();// getCurrentSession (web application spring)
		
		//select p from Parking p
		List<Parking>parkings=session
				.createQuery("from Parking p join fetch p.employee Employee").getResultList();
		System.out.println("------------------------------------");
		for(Parking parking : parkings) {
			System.out.println(parking);
			//System.out.println(parking.getEmployee());
		}
		
		session.close();
		
		for(Parking parking : parkings) {
			System.out.println(parking.getEmployee());
		}
		
		factory.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Spring tx*
//		Transaction tx = session.getTransaction();
//		try {
//			tx.begin();		
//			Parking parking=session.get(Parking.class, 5);
//			session.delete(parking);
//			
//			tx.commit();
//			
//		} catch (HibernateException ex) {
//			tx.rollback();
//			ex.printStackTrace();
//		}

	}

}
