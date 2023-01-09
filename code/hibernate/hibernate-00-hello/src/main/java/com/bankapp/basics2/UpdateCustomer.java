package com.bankapp.basics2;


import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class UpdateCustomer {
    public static void main(String[] args) {

       SessionFactory factory= HibernateSessionFactory.getSessionFactory();

       Session session=factory.openSession();
       Transaction tx= session.getTransaction();
       try{
            tx.begin();

            Customer customer=session.get(Customer.class, 3);
            customer.setName("seema gupta");
            customer.setCustomertype(CustomerType.DIAMOND);

           System.out.println("-----------------");
            session.merge(customer);//update vs merge
           System.out.println("------------");
            tx.commit();
       }catch (HibernateException ex){
           tx.rollback();
           ex.printStackTrace();
       }

       session.close();
       factory.close();
    }

}