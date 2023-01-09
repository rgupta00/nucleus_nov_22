package com.bankapp.basics2;


import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class AddCustomerStrategyOfPK {
    public static void main(String[] args) {

       SessionFactory factory= HibernateSessionFactory.getSessionFactory();

       Session session=factory.openSession();
       Transaction tx= session.getTransaction();
       try{
            tx.begin();

            Customer customer=
                    new Customer("indu","delhi","890000000",
                            "indu@gmail.com", CustomerType.DIAMOND, new Date());
           System.out.println("----------------");
           session.save(customer);
           System.out.println("----------------");
            tx.commit();
           System.out.println("************");
       }catch (HibernateException ex){
          // tx.rollback();
           ex.printStackTrace();
       }

       session.close();
       factory.close();
    }

}