package com.hello;
import java.sql.*;
public class B_InsertNewEmp {
    public static void main(String[] args) {

        try(Connection connection=ConnectionFactory.getConnection()){
            //inset the rec Statement vs PrepareSatement
            PreparedStatement pstmt=connection.prepareStatement("insert into emp(id, name,salary) values(?,?,?)");

            pstmt.setInt(1,8900);
            pstmt.setString(2,"gagan");
            pstmt.setDouble(3,9000);

            //executeUpdate vs executeQuery vs execute
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
