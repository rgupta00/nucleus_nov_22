package com.bankapp.basics;


import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.math.BigDecimal;
import java.util.Date;

public class AddAccount {
    public static void main(String[] args) {


       SessionFactory factory= HibernateSessionFactory.getSessionFactory();

       Session session=factory.openSession();
       Transaction tx= session.getTransaction();
       try{
            tx.begin();

           Account account2=new Account("indu", new BigDecimal(7000),CustomerType.DIAMOND, new Date());
           account2.setTempCalcalation(44444);
           Account account3=new Account("seema", new BigDecimal(5800),CustomerType.GOLD, new Date());
           Account account4=new Account("veena", new BigDecimal(5080),CustomerType.SILVER, new Date());


           session.save(account2);
           session.save(account3);
           session.save(account4);

            tx.commit();
       }catch (HibernateException ex){
           tx.rollback();
           ex.printStackTrace();
       }

       session.close();
       factory.close();
    }

}