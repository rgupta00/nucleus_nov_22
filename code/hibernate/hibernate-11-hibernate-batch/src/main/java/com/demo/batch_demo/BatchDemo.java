package com.demo.batch_demo;

import com.demo.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class BatchDemo {
    public static void main(String[] args) {

       SessionFactory factory= HibernateSessionFactory.getSessionFactory();

       Session session=factory.openSession();
       Transaction tx= session.getTransaction();

       try{
            tx.begin();
        //adding 10 T records, without batch
//           for ( int i=0; i<10_000; i++ ) {
//               Employee employee = new Employee("emp "+ i, new Random(30000).nextInt());
//               session.save(employee);
//               if(i%500==0){
//                   session.flush();
//                   session.clear();
//               }
//           }
        long start=System.currentTimeMillis();

//           List<Employee> employees=session
//                   .createQuery("select e from Employee e")
//                           .getResultList();
//           for (Employee e: employees){
//               e.getName();
//           }

//           Stream<Employee> employees=session
//                   .createQuery("select e from Employee e").stream();

//         employees.forEach();
           long end=System.currentTimeMillis();
           System.out.println("time taken: "+ (end-start)+" ms");
            tx.commit();
       }catch (HibernateException ex){
           tx.rollback();
           ex.printStackTrace();
       }

       session.close();
       factory.close();
    }

}