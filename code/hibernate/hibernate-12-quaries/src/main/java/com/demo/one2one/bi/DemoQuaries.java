package com.demo.one2one.bi;

import com.demo.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.*;
public class DemoQuaries {

	public static void main(String[] args) {

		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();// getCurrentSession (web application spring)

		//List<Parking> list=session.createQuery("from Parking p join fetch p.employee Employee").list();
//		List<Parking> parkings=session.createQuery("select p from Parking p",Parking.class).getResultList();
//		List<Object[]> parkings=session
//				.createQuery("select p from Parking p join fetch p.employee Employee",Object[].class).getResultList();

//		List<Parking> parkings=session
//				.createQuery("select p from Parking p join fetch p.employee Employee",Parking.class).getResultList();
//
//		for (Parking p: parkings){
//			System.out.println(p.getParkingLocation());
//			System.out.println(p.getEmployee().getEmpName());
//		}

		//EmpParkingAllocationDto
		/*
		empName;   private String parkingLocation;
		 */

//		List<EmpParkingAllocationDto> parkings=session
//				.createQuery
//						("select  " +
//								"new com.demo.one2one.bi.EmpParkingAllocationDto(p.employee.empName,p.parkingLocation) " +
//								"from Parking p join p.employee",EmpParkingAllocationDto.class).getResultList();
//
//		for (EmpParkingAllocationDto p: parkings){
//			System.out.println(p);
//		}




		/*
		TypedQuery<Object[]> query = em.createQuery(
      "SELECT c.name, c.capital.name FROM Country AS c", Object[].class);
  List<Object[]> results = query.getResultList();
  for (Object[] result : results) {
      System.out.println(
      "Country: " + result[0] + ", Capital: " + result[1]);
  }
		 */

		List<Object[]> parkings=session
				.createQuery("select p.parkingLocation,p.employee.empName" +
						" from Parking p",Object[].class).getResultList();

		for (Object[] arr: parkings){
			System.out.println(arr[0]);
			System.out.println(arr[1]);
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
