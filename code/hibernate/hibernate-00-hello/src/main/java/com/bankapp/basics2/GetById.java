package com.bankapp.basics2;


import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class GetById {
    public static void main(String[] args) {

       SessionFactory factory= HibernateSessionFactory.getSessionFactory();

       Session session=factory.openSession();

       Customer customer=session.load(Customer.class,3);
        session.close();
        System.out.println("-------------------");
        System.out.println(customer.getName());
        System.out.println("-------------------");


        factory.close();
    }

}