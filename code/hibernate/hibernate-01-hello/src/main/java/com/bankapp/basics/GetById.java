package com.bankapp.basics;


import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class GetById {
    public static void main(String[] args) {


       SessionFactory factory= HibernateSessionFactory.getSessionFactory();
       Session session=factory.openSession();

//        Account account=session.get(Account.class, 3);//eager loading
//        System.out.println("-----------");
//        System.out.println(account);

        Account account=session.load(Account.class, 3);//lazy loading
        session.close();
        System.out.println("-----------");
        System.out.println(account);

       factory.close();
    }

}