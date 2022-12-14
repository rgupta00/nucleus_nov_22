package com.demo;

import java.sql.*;

public class B_SecAttempt {
    public static void main(String[] args) {

       try(Connection connection=ConnectionFactory.getConnection()){

           PreparedStatement pstmt=connection.prepareStatement("select * from emp3");
           ResultSet rs=pstmt.executeQuery();
           while (rs.next()){
               System.out.println(rs.getInt("id")+" : "+ rs.getString("name")+": "+ rs.getDouble("salary"));
           }

       }catch (SQLException ex){
           ex.printStackTrace();
       }
    }
}