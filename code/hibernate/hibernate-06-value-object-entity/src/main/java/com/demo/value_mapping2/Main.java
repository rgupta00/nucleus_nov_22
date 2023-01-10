package com.demo.value_mapping2;

import com.demo.factory.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory= HibernateSessionFactory.getSessionFactory();

        Session session=factory.openSession();
      //  session.getTransaction().begin();

        Customer customer=session.get(Customer.class, 1);

        //(String name, String email, String mobile)
//        Customer customer=new Customer("ravi","ravi@gmail.com","767677656");
//
//        //(String addressLine, String city, String country, String pinCode)
//        Address homeAddress=new Address("A12-LN","Delhi","In","110031");
//        Address officeAdress=new Address("M11","Noida","In","110011");
//
//        customer.setHomeAddress(homeAddress);
//        customer.setOfficeAddress(officeAdress);
//        session.save(customer);

        //session.getTransaction().commit();

        session.close();
        System.out.println(customer.getHomeAddress().getAddressLine());
        factory.close();
    }
}
