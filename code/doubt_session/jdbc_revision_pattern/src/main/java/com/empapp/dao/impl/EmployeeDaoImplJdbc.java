package com.empapp.dao.impl;

import com.empapp.dao.ConnectionFactory;
import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.exceptions.EmployeeNotFoundException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class EmployeeDaoImplJdbc implements EmployeeDao {

    private Connection connection;

    public EmployeeDaoImplJdbc(){
        connection= ConnectionFactory.getConnection();
    }
    @Override
    public List<Employee> getAll() {
        //what i want => i read each record put into a emp object==> that object put into a List and return from the method
        List<Employee> employees=new ArrayList<>();
        Employee employee=null;
       try{
           PreparedStatement pstmt=connection.prepareStatement("select * from emp3");
           ResultSet rs=pstmt.executeQuery();
           while (rs.next()){
               employee=new Employee(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary"));
               employees.add(employee);
           }
       }catch (SQLException ex){
           ex.printStackTrace();
       }
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        try{
            PreparedStatement pstmt=connection.prepareStatement
                    ("insert into emp3(name, salary) values(?,?)");
            pstmt.setString(1,employee.getName());
            pstmt.setDouble(2,employee.getSalary());

            int n=pstmt.executeUpdate();
            System.out.println(n);
        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void deleteEmployee(int id) {
        try{
            PreparedStatement pstmt=connection.prepareStatement
                    ("delete from emp3 where id=?");
            pstmt.setInt(1,id);
             pstmt.executeUpdate();

            int n=pstmt.executeUpdate();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(int id, double salary) {
        try{
            PreparedStatement pstmt=connection.prepareStatement
                    ("update emp3 set salary =? where id=?");

            pstmt.setDouble(1,salary);
            pstmt.setInt(2,id);
            pstmt.executeUpdate();

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public Employee getById(int id) {
        Employee employee=null;
        try{
            PreparedStatement pstmt=connection.prepareStatement("select * from emp3 where id=?");
            pstmt.setInt(1, id);
            ResultSet rs=pstmt.executeQuery();
            if (rs.next()){
                employee=new Employee(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary"));
            }else {
                throw  new EmployeeNotFoundException("employee with id :"+ id +" is not found");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }

        return employee;
    }
}
