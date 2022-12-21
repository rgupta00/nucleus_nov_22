package com.cutomerapp.dao.impl;

import com.cutomerapp.dao.ConnectionFactory;
import com.cutomerapp.dao.Customer;
import com.cutomerapp.dao.CustomerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {
    private Connection connection;
    public CustomerDaoImpl(){
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
}


