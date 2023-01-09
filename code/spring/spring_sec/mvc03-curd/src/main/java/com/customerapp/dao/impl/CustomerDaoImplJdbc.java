package com.customerapp.dao.impl;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;
import com.customerapp.exception.CustomerNotFoundException;
import com.customerapp.exception.DataAccessException;
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

      }catch (SQLException ex){

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
           PreparedStatement pstmt=
                   connection
                           .prepareStatement("insert into customer(name, address, mobile,email) values(?,?,?,?)");

           pstmt.setString(1, customer.getName());
           pstmt.setString(2, customer.getAddress());
           pstmt.setString(3, customer.getMobile());
           pstmt.setString(4, customer.getEmail());
           pstmt.executeUpdate();
       }catch (SQLException ex){
           throw  new DataAccessException(ex);
       }finally {
           try{
               if(connection!=null)
               connection.close();
           }catch (SQLException ex){
               ex.printStackTrace();
           }
       }
    }

    @Override
    public void deleteCustomer(int id) {
        Connection connection=null;
        try{
            connection=dataSource.getConnection();
            PreparedStatement pstmt=connection.prepareStatement("delete from customer where id=?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
                if(connection!=null)
                    connection.close();
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
            // address | mobile    | email
            PreparedStatement pstmt=
                    connection.prepareStatement(
                            "update customer set address=?, mobile=?, email=? where  id=?");
            pstmt.setString(1, customer.getAddress());
            pstmt.setString(2, customer.getMobile());
            pstmt.setString(3, customer.getEmail());
            pstmt.setInt(4, id);
            pstmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
                if(connection!=null)
                    connection.close();
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
            PreparedStatement pstmt=connection.prepareStatement("select * from customer where id=?");
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
        }finally {
            try{
                if(connection!=null)
                    connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        if (customer==null)
            throw  new CustomerNotFoundException("customer with id "+ id +" is not found");

        return customer;
    }
}
