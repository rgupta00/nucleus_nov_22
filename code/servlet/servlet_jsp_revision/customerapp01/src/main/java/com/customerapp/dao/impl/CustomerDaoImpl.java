package com.customerapp.dao.impl;
import  java.sql.*;
import java.util.*;
import com.customerapp.dao.factory.ConnectionFactory;
import com.customerapp.dao.customer.Customer;
import com.customerapp.dao.customer.CustomerDao;
import com.customerapp.exceptions.CustomerNotFoundException;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    private Connection connection;
    //:(
    public CustomerDaoImpl(){
        connection= ConnectionFactory.getConnection();
    }


    @Override
    public void deleteCustomer(int id) {
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement("delete from customer where id=? ");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            connection.commit();
        }catch (SQLException ex){
            try{
                connection.rollback();
            }catch (SQLException e){
                e.printStackTrace();
            }
            ex.printStackTrace();
        }
    }

    @Override
    public void updateCustomer(int id, Customer customer) {
        //| id | name  | address  | mobile    | email
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement("update customer set address=?, mobile=?, email=? where id=? ");
            pstmt.setString(1, customer.getAddress());
            pstmt.setString(2, customer.getMobile());
            pstmt.setString(3, customer.getEmail());
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
            connection.commit();
        }catch (SQLException ex){
            try{
                connection.rollback();
            }catch (SQLException e){
                e.printStackTrace();
            }
            ex.printStackTrace();
        }
    }

    @Override
    public Customer getById(int id) {
        Customer customer=null;
        try {
            PreparedStatement pstmt = connection.prepareStatement("select * from customer where id=?");
            pstmt.setInt(1, id);
            ResultSet rs=pstmt.executeQuery();
            //| id | name  | address  | mobile    | email
            if (rs.next()){
                customer=new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
       if (customer==null)
           throw  new CustomerNotFoundException("customer with id "+ id +" is not found");
        return customer;
    }

    @Override
    public void addCustomer(Customer customer) {
        //id | name  | address  | mobile    | email
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement("insert into customer(name, address, mobile, email) values(?,?,?,?)");
            pstmt.setString(1, customer.getName());
            pstmt.setString(2, customer.getAddress());
            pstmt.setString(3, customer.getMobile());
            pstmt.setString(4, customer.getEmail());
            pstmt.executeUpdate();
            connection.commit();
        }catch (SQLException ex){
          try{
              connection.rollback();
          }catch (SQLException e){
              e.printStackTrace();
          }
            ex.printStackTrace();
        }
    }

    @Override
    public List<Customer> getAll() {
        List<Customer>customers=new ArrayList<>();
        Customer customer=null;
        try {
            PreparedStatement pstmt = connection.prepareStatement("select * from customer");

            ResultSet rs=pstmt.executeQuery();
            //| id | name  | address  | mobile    | email
            while (rs.next()){
                customer=new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
                customers.add(customer);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return customers;
    }
}













