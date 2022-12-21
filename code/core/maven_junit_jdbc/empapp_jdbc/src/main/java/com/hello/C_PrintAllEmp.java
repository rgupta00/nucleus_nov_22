package com.hello;

import java.sql.*;//from JSR
public class C_PrintAllEmp {
    public static void main(String[] args) {
        //load the drive

        try(Connection connection=ConnectionFactory.getConnection()){

            Statement stmt=connection.createStatement();

            ResultSet rs=stmt.executeQuery("select * from emp");
            while (rs.next()){
                System.out.println(rs.getInt("id")+" : "+
                        rs.getString("name")+" : "+ rs.getDouble("salary"));
            }
            System.out.println("con is done");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
