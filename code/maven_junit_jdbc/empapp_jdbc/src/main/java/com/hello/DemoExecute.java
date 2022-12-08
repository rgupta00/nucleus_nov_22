package com.hello;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoExecute {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("PE query");
        String q=scanner.nextLine();

        try(Connection connection=ConnectionFactory.getConnection()){
            //inset the rec Statement vs PrepareSatement
            PreparedStatement pstmt=connection.prepareStatement(q);

            boolean status=pstmt.execute();
            System.out.println(status);
            if(status){
                ResultSet rs=pstmt.getResultSet();
                while (rs.next()){
                    System.out.println(rs.getInt(1));
                }
            }else {
                int noOfRowsEffected= pstmt.getUpdateCount();
                System.out.println(noOfRowsEffected);
            }


            //executeUpdate vs executeQuery vs execute
//            int noOfRows=pstmt.executeUpdate();
//
//            System.out.println(noOfRows);

            System.out.println("---done---");
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
