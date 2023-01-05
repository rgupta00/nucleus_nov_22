package com.bankapp.basics;


import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.util.List;

public class ShowAllAccount {
    public static void main(String[] args) {


       SessionFactory factory= HibernateSessionFactory.getSessionFactory();

       Session session=factory.openSession();


//        List<Account> accounts= session.createQuery("select a from Account a",Account.class).list();
//        accounts.forEach(a-> System.out.println(a));

        List<String> accounts= session.createQuery("select a.name from Account a",String.class).list();
        accounts.forEach(a-> System.out.println(a));

       session.close();
       factory.close();
    }

}