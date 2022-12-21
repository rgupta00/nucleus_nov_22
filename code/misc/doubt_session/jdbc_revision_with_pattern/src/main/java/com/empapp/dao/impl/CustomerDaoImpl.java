package com.empapp.dao.impl;

import com.empapp.dao.ConnectionFactory;
import com.empapp.dao.CustomerDao;
import com.empapp.dao.Customer;
import com.empapp.util.FileOperation;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    private Connection connection;

    public CustomerDaoImpl(){
        connection= ConnectionFactory.getConnection();
    }

    @Override
    public void populateData() {

        //i need to populate data from the file
        List<Customer> customers= FileOperation.getAllValidRecords();
        for (Customer customer: customers){
            addEmployee(customer);
        }
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> employees=new ArrayList<>();
        Customer employee=null;
        try{
            PreparedStatement pstmt=connection.prepareStatement("select * from emp3");
            ResultSet rs=pstmt.executeQuery();
            while (rs.next()){
                employee=new Customer(rs.getInt("id"),
                        rs.getString("name"),rs.getDouble("salary") );
                employees.add(employee);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return employees;
    }

    @Override
    public void addEmployee(Customer employee) {
        try{

            PreparedStatement pstmt=connection.prepareStatement
                    ("insert into emp3(name, salary) values(?,?)");
            pstmt.setString(1,employee.getName());
            pstmt.setDouble(2,employee.getSalary());

            pstmt.executeUpdate();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {

    }

    @Override
    public void updateEmployee(int id, double salary) {
        try{

            PreparedStatement pstmt=connection.prepareStatement
                    ("update emp3 set salary =? where id=?");

            pstmt.setDouble(1,salary);
            pstmt.setInt(2,id);
            pstmt.executeUpdate();
            //System.out.println("----updated----"+no);

            int n=pstmt.executeUpdate();
            System.out.println(n);

        }catch(SQLException ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void getById(int id) {
        try{
            PreparedStatement pstmt=connection.prepareStatement
                    ("delete from emp3 where id=?");

            pstmt.setInt(1,id);
            pstmt.executeUpdate();

            int n=pstmt.executeUpdate();
            System.out.println(n);

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
