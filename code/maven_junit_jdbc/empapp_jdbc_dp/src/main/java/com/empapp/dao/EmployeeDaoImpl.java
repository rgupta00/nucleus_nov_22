package com.empapp.dao;

import com.empapp.exeptions.EmpoyeeNotFoundException;

import javax.swing.plaf.SpinnerUI;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDaoImpl implements EmployeeDao{
    private Connection connection;

    public EmployeeDaoImpl(){
        connection=ConnectionFactory.getConnection();
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees=new ArrayList<>();
        try{
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp3");
            while (rs.next()){
                Employee employee=new Employee(rs.getInt("id"),rs.getString("name"),
                        rs.getDouble("salary"));
                employees.add(employee);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        try {
            PreparedStatement pstmt=connection.prepareStatement
                    ("insert into emp3(name,salary) values(?,?)");
            pstmt.setString(1,employee.getName());
            pstmt.setDouble(2,employee.getSalary());

            int noOfRows=pstmt.executeUpdate();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void deleteEmployee(int id) {
//        Employee employeeToUpdate=findById(id)
//                .orElseThrow(()-> new EmpoyeeNotFoundException("emp not found"));
        try{
            PreparedStatement pstmt=connection.
                    prepareStatement("delete from emp3 where id=?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }catch (SQLException ex){}

    }

    @Override
    public void updateEmployee(int id, double salary) {
//        Employee employeeToUpdate=findById(id)
//                .orElseThrow(()-> new EmpoyeeNotFoundException("emp not found"));
       try{
           PreparedStatement pstmt=connection.
                   prepareStatement("update emp3 set salary =? where id=?");

           pstmt.setDouble(1, salary);
           pstmt.setInt(2, id);
           pstmt.executeUpdate();
       }catch (SQLException ex){}

    }

    @Override
    public Optional<Employee> findById(int id) {
        Employee employee=null;
        try{
            PreparedStatement stmt=connection.prepareStatement("select * from emp where id=?");
            ResultSet rs=stmt.executeQuery();
            if (rs.next()){
                 employee=new Employee(rs.getInt("id"),rs.getString("name"),
                        rs.getDouble("salary"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }

        return Optional.ofNullable(employee);
    }
}











