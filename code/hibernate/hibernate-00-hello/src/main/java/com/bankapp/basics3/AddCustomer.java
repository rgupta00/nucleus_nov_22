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

           //CustomerKey customerKey, String address, String mobile, CustomerType customertype, Date dob)
           CustomerKey k1=new CustomerKey("ravi","ravi@gmail.com");
           CustomerKey k2=new CustomerKey("kapil","kapil@gmail.com");


            Customer customer=
                    new Customer(k1, "delhi","890000000",
                           CustomerType.DIAMOND, new Date());

           Customer customer2=
                   new Customer(k2, "kanpur","890090000",
                           CustomerType.DIAMOND, new Date());

           session.save(customer);
           session.save(customer2);


            tx.commit();
       }catch (HibernateException ex){
           tx.rollback();
           ex.printStackTrace();
       }

       session.close();
       factory.close();
    }

}