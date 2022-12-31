package com.customer.dao.impl;

import com.customer.dao.Customer;
import com.customer.dao.CustomerDao;
import com.customer.exception.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
@Primary
public class CustomerDaoImplJdbc implements CustomerDao {

    private DataSource  dataSource;

    @Autowired
    public CustomerDaoImplJdbc(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers=new ArrayList<>();
        Customer customer=null;
        Connection connection=null;
      try{
           connection=dataSource.getConnection();
          connection.setAutoCommit(false);
          PreparedStatement pstmt=connection.prepareStatement("select * from customer");
          ResultSet rs=pstmt.executeQuery();
          while (rs.next()){
              //int id, String name, String address, String mobile, String email
              customer=new Customer(
                      rs.getInt(1),
                      rs.getString(2),
                      rs.getString(3),
                      rs.getString(4),
                      rs.getString(5));
              customers.add(customer);
          }
          connection.commit();

      }catch (SQLException ex){
         try{
             connection.rollback();
         }catch (SQLException e){
             e.printStackTrace();
         }
          throw  new DataAccessException(ex);
      }

        System.out.println("using jdbc: getAllCustomer");
        return customers;
    }

    @Override
    public void addCustomer(Customer customer)  {
        System.out.println("addCustomer: using jdbc");
        Connection connection=null;
       try{
           connection= dataSource.getConnection();
           connection.setAutoCommit(false);
           PreparedStatement pstmt=
                   connection
                           .prepareStatement("insert into customer(name, address, mobile,email) values(?,?,?,?)");

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
           throw  new DataAccessException(ex);
       }
    }
}
