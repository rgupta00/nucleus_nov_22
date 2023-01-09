package com.bankapp.basics2;

import java.util.*;
import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class ShowAllCustomer {
    public static void main(String[] args) {

       SessionFactory factory= HibernateSessionFactory.getSessionFactory();

       Session session=factory.openSession();
//      List<Customer> customers=session
//              .createQuery("select c from Customer c where c.address=:address",Customer.class)
//              .setParameter("address","delhi")
//              .getResultList();
//      customers.forEach(c-> System.out.println(c));

//        Customer customer=session
//                .createQuery("select c from Customer c where c.address=:address",Customer.class)
//                .setParameter("address","noida")
//                        .uniqueResult();        //.NonUniqueResultException
//        System.out.println(customer);
       session.close();
       factory.close();
    }

}