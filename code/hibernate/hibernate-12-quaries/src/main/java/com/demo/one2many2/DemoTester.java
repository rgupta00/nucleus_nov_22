package com.demo.one2many2;

import com.demo.factory.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DemoTester {

	public static void main(String[] args) {

		Category category1=new Category("books");
		Category category2=new Category("laptop");
		Category category3=new Category("jeans");

		// public Product(String name, String description, double price)
		Product product1=new Product("rich dad poor dad",
				"great book to read on fincial freedom",800.00);

		Product product2=new Product("monk who sold farrari",
				"great book to understand purpose of life",230.00);

		Product product3=new Product("spring in action",
				"good on spring framework",400.00);




		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();// getCurrentSession (web application spring)

		
		session.close();

		factory.close();

	}

}
