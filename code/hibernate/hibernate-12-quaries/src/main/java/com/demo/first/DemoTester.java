package com.demo.first;

import com.demo.factory.HibernateSessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import java.util.Objects;

public class DemoTester {

	public static void main(String[] args) {





		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();
		session.getTransaction().begin();

//		List<Customer> customers=session
//				.createQuery("select * from customer_table_sql",Customer.class)
//				.getResultList();
//		for (Customer customer : customers) {
//			System.out.println(customer);
//		}
//

//		List<Customer> customers=session
//				.createQuery("select c from Customer c",Customer.class)
//				.getResultList();
//		for (Customer customer : customers) {
//			System.out.println(customer);
//		}

//		List<String> customersName=session
//				.createQuery("select c.name from Customer c",String.class)
//				.getResultList();
//		for (String name : customersName) {
//			System.out.println(name);
//		}


//		List<Object[]> listOfObjects=session
//				.createQuery("select c.id, c.name from Customer c",Object[].class)
//				.getResultList();
//		for (Object[] arr : listOfObjects) {
//			System.out.println(arr[0]+" : "+ arr[1]);
//		}

//		List<CustomerDto> listOfCusetomerDto=session
//				.createQuery("select new com.demo.first.CustomerDto(c.id, c.name) from Customer c",CustomerDto.class)
//				.getResultList();
//		for (CustomerDto dto: listOfCusetomerDto) {
//			System.out.println(dto);
//		}

//		Long countCustomerFromNoida=session
//				.createQuery("select count(c) from Customer c where c.address=:add",Long.class)
//				.setParameter("add","noida")
//						.getSingleResult();
//		System.out.println(countCustomerFromNoida);



//		List<Customer> customers=session
//				.createNativeQuery("select * from customer_table_sql",Customer.class)
//				.getResultList();
//		for (Customer customer : customers) {
//			System.out.println(customer);
//		}


//		Customer customer=new Customer("raj","noida");
//		Customer customer2=new Customer("ekta","delhi");
//		Customer customer3=new Customer("sumit","noida");
//		Customer customer4=new Customer("amit","banglore");
//		session.save(customer);
//		session.save(customer2);
//		session.save(customer3);
//		session.save(customer4);

			session.getTransaction().commit();
			session.close();
			factory.close();


//		}

//		Criteria criteria = session.createCriteria(Customer.class);
//
//		criteria.add(Restrictions.eq("name", "amit"));

			//criteria.add(Restrictions.le("id", 5));


//		List<Customer> cList = criteria.list();
//		for (Customer customer : cList) {
//			System.out.println(customer);
//		}

//		List<Customer> customers=session
//				.createQuery("select c from Customer c",Customer.class)
//				.setFirstResult(2)
//				.setMaxResults(2)
//				.getResultList();
//
//		for (Customer customer : customers) {
//			System.out.println(customer);
//		}


		}



}
