package com.demo;

import java.sql.*;

public class C_Insert_get_genKey {
    public static void main(String[] args) {

       try(Connection connection=ConnectionFactory.getConnection()){

           PreparedStatement pstmt=connection.prepareStatement
                   ("insert into emp3(name, salary) values(?,?)", Statement.RETURN_GENERATED_KEYS);
           pstmt.setString(1,"om kumar");
           pstmt.setDouble(2,7000);

           pstmt.executeUpdate();

          ResultSet rs= pstmt.getGeneratedKeys();
          if(rs.next()){
              System.out.println(rs.getInt(1));
          }

          // System.out.println(n);

       }catch (SQLException ex){
           ex.printStackTrace();
       }
    }
}