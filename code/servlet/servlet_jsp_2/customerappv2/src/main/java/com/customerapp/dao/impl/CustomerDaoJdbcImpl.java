package com.customerapp.dao.impl;
import java.sql.*;
import com.customerapp.dao.customer.Customer;
import com.customerapp.dao.customer.CustomerDao;
import com.customerapp.dao.factory.ConnectionFactory;

import java.sql.Connection;
import java.util.*;

public class CustomerDaoJdbcImpl implements CustomerDao {
    private Connection connection;
    public CustomerDaoJdbcImpl(){
        connection= ConnectionFactory.getConnection();
    }

    @Override
    public void addCustomer(Customer customer) {
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement("insert into customer(name, address,mobile, email) values(?,?,?,?)");
            pstmt.setString(1, customer.getName());
            pstmt.setString(2, customer.getAddress());
            pstmt.setString(3, customer.getMobile());
            pstmt.setString(4, customer.getEmail());

            pstmt.executeUpdate();
            connection.commit();
        }catch (SQLException ex){
            ex.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException e){}
        }
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers=new ArrayList<>();
        Customer customer=null;
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement
                            ("select * from customer");

            // id | name    | address | mobile   | email
            ResultSet rs= pstmt.executeQuery();
            while (rs.next()){
                customer=new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                );
                customers.add(customer);
            }
            connection.commit();
        }catch (SQLException ex){
            ex.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException e){}
        }

        return  customers;
    }
}
