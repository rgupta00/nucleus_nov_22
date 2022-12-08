package com.hello;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class D_DeleteEmp {

    public static void main(String[] args) {
        try(Connection connection=ConnectionFactory.getConnection()){
            //inset the rec Statement vs PrepareSatement
            PreparedStatement pstmt=connection.
                    prepareStatement("delete from emp where id=?");

            pstmt.setInt(1,3444);

            int noOfRows=pstmt.executeUpdate();

            System.out.println(noOfRows);

            System.out.println("---done---");
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
