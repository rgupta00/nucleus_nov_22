package com.bankapp.basics;


import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class GetById {
    public static void main(String[] args) {

    //ORM : hit the database in optimal way
        //first level cached
//       SessionFactory factory= HibernateSessionFactory.getSessionFactory();
//       Session session=factory.openSession();
//        Account account=session.get(Account.class, 3);//eager loading
//        session.close();
//
//        Session session2=factory.openSession();
//        Account account2=session2.get(Account.class, 3);//eager loading
//        session2.close();







//
//       //first level cache vs sec level cah
//        //FCL scole: session scope
        SessionFactory factory= HibernateSessionFactory.getSessionFactory();
        Session session=factory.openSession();
        Account account=session.get(Account.class, 3);//eager loading
        System.out.println("-----------");
        System.out.println(account);

        Account account2=session.get(Account.class, 3);//eager loading
        System.out.println("-----------");
        System.out.println(account2);


      /*  Account account=session.load(Account.class, 3);//lazy loading
        session.close();*/
//        System.out.println("-----------");
//        System.out.println(account);

       factory.close();
    }

}