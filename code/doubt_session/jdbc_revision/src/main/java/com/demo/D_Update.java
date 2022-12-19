package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class D_Update {
    public static void main(String[] args) {

        try(Connection connection=ConnectionFactory.getConnection()){

            PreparedStatement pstmt=connection.prepareStatement
                    ("update emp3 set salary =? where id=?");

            pstmt.setDouble(1,8900);
            pstmt.setInt(2,5);
            pstmt.executeUpdate();
            //System.out.println("----updated----"+no);

            int n=pstmt.executeUpdate();
            System.out.println(n);

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}