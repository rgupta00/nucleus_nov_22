package com.bankapp.basics3;


import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class AddCustomer {
    public static void main(String[] args) {

       SessionFactory factory= HibernateSessionFactory.getSessionFactory();

       Session session=factory.openSession();
       Transaction tx= session.getTransaction();
       try{
            tx.begin();

                Customer customer=new Customer("ravi","575777666");
                customer.addEmail("ravi@gmail.com");
           customer.addEmail("ravi@nu.com");
           customer.addEmail("ravi@xyz.com");

            session.save(customer);

            tx.commit();
       }catch (HibernateException ex){
           tx.rollback();
           ex.printStackTrace();
       }

       session.close();
       factory.close();
    }

}