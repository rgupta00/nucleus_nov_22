package com.bankapp.basics2;


import com.bankapp.basics.Account;
import com.bankapp.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.util.Date;

public class AddCustomer {
    public static void main(String[] args) {

       SessionFactory factory= HibernateSessionFactory.getSessionFactory();

       Session session=factory.openSession();
       Transaction tx= session.getTransaction();
       try{
            tx.begin();

            //public Customer(String name, String address,
           // String mobile, String email, CustomerType customertype, Date dob)
            Customer customer=
                    new Customer("sunita","delhi","890000000",
                            "sunita@gmail.com", CustomerType.DIAMOND, new Date());
           Customer customer2=
                   new Customer("kapil","kanpur","890009000",
                           "kapil@gmail.com", CustomerType.GOLD, new Date());
           Customer customer3=
                   new Customer("seema","delhi","890000000",
                           "seema@gmail.com", CustomerType.SILVER, new Date());

            session.save(customer);
           session.save(customer2);
           session.save(customer3);


            tx.commit();
       }catch (HibernateException ex){
           tx.rollback();
           ex.printStackTrace();
       }

       session.close();
       factory.close();
    }

}