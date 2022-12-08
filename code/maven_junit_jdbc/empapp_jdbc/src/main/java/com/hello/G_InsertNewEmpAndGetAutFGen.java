package com.hello;

import java.sql.*;

public class G_InsertNewEmpAndGetAutFGen {
    public static void main(String[] args) {
        try(Connection connection=ConnectionFactory.getConnection()){
            //inset the rec Statement vs PrepareSatement
            PreparedStatement pstmt=connection.prepareStatement("insert into emp3( name,salary) values(?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1,"raj");
            pstmt.setDouble(2,9000);

            //executeUpdate vs executeQuery vs execute
            int noOfRows=pstmt.executeUpdate();

            ResultSet  rs =pstmt.getGeneratedKeys();
            if(rs.next()){
                System.out.println(rs.getInt(1));
            }

            System.out.println(noOfRows);

            System.out.println("---done---");
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
