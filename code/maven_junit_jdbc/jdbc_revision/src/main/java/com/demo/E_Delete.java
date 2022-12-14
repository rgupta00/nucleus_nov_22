package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class E_Delete {
    public static void main(String[] args) {

        try(Connection connection=ConnectionFactory.getConnection()){

            PreparedStatement pstmt=connection.prepareStatement
                    ("delete from emp3 where id=?");

            pstmt.setInt(1,4);
            int no= pstmt.executeUpdate();
            System.out.println("----updated----"+no);

            int n=pstmt.executeUpdate();
            System.out.println(n);

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}