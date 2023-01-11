package com.demo.one2one.bi;

import com.demo.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EffectOfCascading {

	public static void main(String[] args) {


		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();// getCurrentSession (web application spring)


		Transaction tx=session.getTransaction();

		try{
			tx.begin();

			Parking parking=session.get(Parking.class, 5);
			session.remove(parking);

			tx.commit();
		}catch (HibernateException ex){
			System.out.println(ex);
			tx.rollback();
		}

		session.close();
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



//select p from Parking p
	/*	List<Parking>parkings=session
				.createQuery("from Parking p join fetch p.employee Employee").getResultList();
		System.out.println("------------------------------------");
		for(Parking parking : parkings) {
			System.out.println(parking);
			//System.out.println(parking.getEmployee());
		}
		*/


//		for(Parking parking : parkings) {
//			System.out.println(parking.getEmployee());
//		}
