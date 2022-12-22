package com.customerapp.dao.impl;
import java.sql.*;

import com.customerapp.dao.customer.Address;
import com.customerapp.dao.customer.Customer;
import com.customerapp.dao.customer.CustomerDao;
import com.customerapp.dao.exceptions.CustomerNotFoundException;
import com.customerapp.dao.factory.ConnectionFactory;

import java.sql.Connection;
import java.util.*;

public class CustomerDaoJdbcImpl implements CustomerDao {
    private Connection connection;
    public CustomerDaoJdbcImpl(){

        connection= ConnectionFactory.getConnection();
    }

    @Override
    public Address getByCustoemrId(int id) {
        return null;
    }

    @Override
    public void addCustomer(Customer customer) {
        int eidFk=0;
        try{
          //  connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement("insert into cust(name,mobile, email) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, customer.getName());
            pstmt.setString(2, customer.getMobile());
            pstmt.setString(3, customer.getEmail());
            pstmt.executeUpdate();
            ResultSet rs=pstmt.getGeneratedKeys();
            if(rs.next()){
                eidFk=rs.getInt(1);
            }
          //  connection.commit();
            PreparedStatement  pstmt2=connection
                    .prepareStatement("insert into address(state, country, id_fk) values(?,?,?)");
            pstmt2.setString(1, customer.getAddress().getState());
            pstmt2.setString(2, customer.getAddress().getCountry());
            pstmt2.setInt(3, eidFk);
            pstmt2.executeUpdate();
           //

        }catch (SQLException ex){
            ex.printStackTrace();
//            try{
//               // connection.rollback();
//            }catch (SQLException e){}
        }
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers=new ArrayList<>();
        Customer customer=null;
        Address address=null;
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement
                   ("select c.id, c.name, c.mobile, c.email, a.aid, a.state, a.country from cust c, address a where c.id=a.id_fk");
            // id | name    | address | mobile   | email
            ResultSet rs= pstmt.executeQuery();
            while (rs.next()){
                customer=new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
                address=new Address(rs.getInt(5), rs.getString(6),rs.getString(7));
                customer.setAddress(address);
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

    @Override
    public void deleteCustomer(int id) {
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement("delete from customer where id=?");
            pstmt.setInt(1,id);
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
    public void updateCustomer(int id, Customer customer) {
        // id | name   | mobile   | email
        //aid | state    | country | id_fk
        try{
           connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement
                            ("update cust set mobile=?, email=? where id=?");
            pstmt.setString(1, customer.getMobile());
            pstmt.setString(2, customer.getEmail());
            pstmt.setInt(3, customer.getId());
            pstmt.executeUpdate();

            PreparedStatement pstmt2=connection
                    .prepareStatement
                            //UPDATE address
                    //JOIN cust ON address.id_fk = cust.id
     ("update address set state=?, country=? where aid=?");
            pstmt2.setString(1, customer.getAddress().getState());
            pstmt2.setString(2, customer.getAddress().getCountry());
            pstmt2.setInt(3, customer.getAddress().getAid());
            pstmt2.executeUpdate();

            connection.commit();
        }catch (SQLException ex){
            ex.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException e){}
        }
    }

    @Override
    public Customer getById(int id) {
        Customer customer=null;
        Address address=null;
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement
                     ("select c.id, c.name, c.mobile, c.email, a.aid, a.state, a.country from cust c, address a where c.id=a.id_fk and c.id=?");
            pstmt.setInt(1, id);
            ResultSet rs= pstmt.executeQuery();
            if (rs.next()){
                customer=new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
                address=new Address(rs.getInt(5), rs.getString(6),rs.getString(7));
                customer.setAddress(address);
            }
            connection.commit();
        }catch (SQLException ex){
            ex.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException e){}
        }
        if(customer==null)
            throw  new CustomerNotFoundException("customer is not found");

        return  customer;
    }
}
