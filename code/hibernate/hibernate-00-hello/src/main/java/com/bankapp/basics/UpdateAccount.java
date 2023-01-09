package com.bankapp.basics;


import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.math.BigDecimal;

public class UpdateAccount {
    public static void main(String[] args) {


       SessionFactory factory= HibernateSessionFactory.getSessionFactory();

       Session session=factory.openSession();
       Transaction tx= session.getTransaction();
       try{
            tx.begin();
          // Account account=new Account("ravi", new BigDecimal(5000));
          // session.save(account);

            tx.commit();
       }catch (HibernateException ex){
           tx.rollback();
           ex.printStackTrace();
       }

       session.close();
       factory.close();
    }

}