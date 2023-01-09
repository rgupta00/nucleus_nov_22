package com.demo.many2many;

import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.factory.HibernateSessionFactory;

public class DemoTester {

	public static void main(String[] args) {

		Employee employee1 = new Employee("raja");
		Employee employee2 = new Employee("amit");

		Employee employee3 = new Employee("sumit");
		Employee employee4 = new Employee("ekta");

		Employee employee7 = new Employee("rajiv");
		Employee employee8 = new Employee("nitin");

		Project project1 = new Project("proj A");
		Project project2 = new Project("proj B");

		Project project3 = new Project("proj C");
		Project project4 = new Project("proj D");

		project1.getEmployees().add(employee1);
		project1.getEmployees().add(employee3);

		project2.getEmployees().add(employee1);
		project2.getEmployees().add(employee3);
		project2.getEmployees().add(employee4);

		project3.getEmployees().add(employee2);
		project3.getEmployees().add(employee3);
		project3.getEmployees().add(employee4);

		project4.getEmployees().add(employee2);
		project4.getEmployees().add(employee4);

		employee1.getProjects().add(project1);
		employee1.getProjects().add(project2);

		employee2.getProjects().add(project3);
		employee2.getProjects().add(project4);

		employee3.getProjects().add(project1);
		employee3.getProjects().add(project2);
		employee3.getProjects().add(project3);

		employee4.getProjects().add(project4);
		employee4.getProjects().add(project2);
		employee4.getProjects().add(project3);

		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();

		session.getTransaction().begin();

		session.save(project1);
		session.save(project2);
		session.save(project3);
		session.save(project4);

		session.save(employee1);
		session.save(employee2);
		session.save(employee3);
		session.save(employee4);
		
		session.getTransaction().commit();

		session.close();
		factory.close();

	}

}
