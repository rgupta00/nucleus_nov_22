package com.hello;

import java.sql.*;

public class J_DemoSP {

    public static void main(String[] args) {
        try(Connection connection=ConnectionFactory.getConnection()){
            //inset the rec Statement vs PrepareSatement
            CallableStatement cstmt=connection.prepareCall("call addNum2(?,?,?)");
            cstmt.setInt(1, 1);
            cstmt.setInt(2, 4);
            cstmt.registerOutParameter(3, Types.INTEGER);
            cstmt.execute();
            System.out.println(cstmt.getInt(3));


            System.out.println("---done---");
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
