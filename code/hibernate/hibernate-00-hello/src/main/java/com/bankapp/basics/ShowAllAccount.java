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

       List<Account> accounts= session.
               createQuery("select a from Account a where id=:id and name=:uname", Account.class)
                       .setParameter("id", 1)
               .setParameter("uname","indu")
                               .list();
       accounts.forEach(a-> System.out.println(a));


//        List<Account> accounts= session.createQuery("select a from Account a",Account.class).list();
//        accounts.forEach(a-> System.out.println(a));

//        List<Object[]> accounts=session.createQuery
//                ("select a.name, a.balance from Account a",Object[].class).list();
//
//        for(Object[] obArr: accounts){
//            System.out.println(obArr[0]+ ":"+obArr[1]);
//        }

//        List<AccountData> accounts=session.createQuery
//                ("select new com.bankapp.basics.AccountData( a.name, a.balance ) from Account a",
//                        AccountData.class).list();
//
//        for (AccountData account : accounts) {
//            System.out.println(account);
//        }

       session.close();
       factory.close();
    }

}