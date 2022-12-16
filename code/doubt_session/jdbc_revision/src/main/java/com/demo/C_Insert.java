package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C_Insert {
    public static void main(String[] args) {

       try(Connection connection=ConnectionFactory.getConnection()){

           PreparedStatement pstmt=connection.prepareStatement
                   ("insert into emp3(name, salary) values(?,?)");
           pstmt.setString(1,"hari");
           pstmt.setDouble(2,7000);

           int n=pstmt.executeUpdate();
           System.out.println(n);

       }catch (SQLException ex){
           ex.printStackTrace();
       }
    }
}