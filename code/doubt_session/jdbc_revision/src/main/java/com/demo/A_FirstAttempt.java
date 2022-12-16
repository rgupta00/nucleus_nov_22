package com.demo;

import java.sql.*;

public class A_FirstAttempt {
    public static void main(String[] args) {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver is loaded");
    }catch (ClassNotFoundException e){
        e.printStackTrace();
    }

        Connection connection=null;
       try{
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/nu22","root","root");

           PreparedStatement pstmt=connection.prepareStatement("select * from emp3");
           ResultSet rs=pstmt.executeQuery();
           while (rs.next()){
               System.out.println(rs.getInt("id")+" : "+ rs.getString("name")+": "+ rs.getDouble("salary"));
           }

       }catch (SQLException ex){
           ex.printStackTrace();
       }finally {
           try {
               connection.close();
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
       }
    }
}