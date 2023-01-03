package com.customerapp.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;
import com.customerapp.excptions.CustomerNotFoundException;
@Repository
@Primary
public class CustomerDaoImpl implements CustomerDao {

    private DataSource dataSource;

    @Autowired
    public CustomerDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void deleteCustomer(int id) {
        Connection connection=null;
      try{
          connection=dataSource.getConnection();
          connection.setAutoCommit(false);
          PreparedStatement pstmt=connection.prepareStatement("delete from customer2 where id=?");
          pstmt.setInt(1, id);
          pstmt.executeUpdate();
          connection.commit();
      }catch (SQLException e){
          e.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
      }
    }

    @Override
    public void updateCustomer(int id, Customer customer) {
        Connection connection=null;
        try{
            connection=dataSource.getConnection();
            connection.setAutoCommit(false);
            // address | mobile    | email
            PreparedStatement pstmt=
                    connection.prepareStatement("update customer2 set address=?, mobile=?, email=? where  id=?");
            pstmt.setString(1, customer.getAddress());
            pstmt.setString(2, customer.getMobile());
            pstmt.setString(3, customer.getEmail());
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
            connection.commit();
        }catch (SQLException e){
            e.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Customer getById(int id) {
        Customer customer=null;
        Connection connection=null;
        try{
            connection=dataSource.getConnection();
            PreparedStatement pstmt=connection.prepareStatement("select * from customer2 where id=?");
            pstmt.setInt(1, id);
            ResultSet rs=pstmt.executeQuery();
            if (rs.next()){
                //int id, String name, String address, String mobile, String email
                customer=new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        if (customer==null)
            throw  new CustomerNotFoundException("customer with id "+ id +" is not found");

        return customer;
    }

    @Override
    public List<Customer> getAll() {
        Connection connection=null;
        List<Customer> customers=new ArrayList<>();
        Customer customer=null;
       try{
    	   //id name address mobile email customertype dob
           connection=dataSource.getConnection();
           PreparedStatement pstmt=connection.prepareStatement("select * from customer2");
           ResultSet rs=pstmt.executeQuery();
           while (rs.next()){
               //int id, String name, String address, String mobile, String email
               customer=new Customer(
                       rs.getInt(1),
                       rs.getString(2),
                       rs.getString(3),
                       rs.getString(4),
                       rs.getString(5),rs.getString(6),rs.getDate(7));
               customers.add(customer);
           }
       }catch (SQLException ex){
           ex.printStackTrace();
       }
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        Connection connection=null;
        try{
            connection=dataSource.getConnection();
            connection.setAutoCommit(false);
            // id | name  | address | mobile    | email
            //id name address mobile email customertype dob
            PreparedStatement pstmt=
                    connection
                            .prepareStatement("insert into customer2(name, address, mobile,email,customertype,dob) values(?,?,?,?,?,?)");

            pstmt.setString(1, customer.getName());
            pstmt.setString(2, customer.getAddress());
            pstmt.setString(3, customer.getMobile());
            pstmt.setString(4, customer.getEmail());
            pstmt.setString(5, customer.getCustomertype());
            pstmt.setDate(6, new Date(customer.getDob().getTime()));
            
            pstmt.executeUpdate();
            connection.commit();
        }catch (SQLException e){
            e.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}












