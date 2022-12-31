package com.core.topic1.srp.wrong;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class Customer {
    private int id;
    private String name;
    private double salary;

    public Connection getConnection(){
        // code to get jdbc connection..
        return null;
    }

    public SessionFactory getFactory(){
        // code to get jdbc connection..
        return null;
    }
    public void addCustomer(Customer customer)throws SQLException {
        System.out.println("adding book to db using jdbc..");
    }
    public void addCustomerUsingHibernate(Customer customer)throws HibernateException {
        System.out.println("adding book to db using hibernate....");
    }
}
