package com.hello;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class I_BatchRead {
    public static void main(String[] args) {
        try(Connection connection=ConnectionFactory.getConnection()){
            //inset the rec Statement vs PrepareSatement
            long start=System.nanoTime();

            //117037027 ms
            //123987581 ms
            //110330394 ms
            PreparedStatement pstmt=
                    connection.prepareStatement("select * from mytable");
              pstmt.setFetchSize(2);
            ResultSet rs=pstmt.executeQuery();
            while (rs.next()){

            }
            long end=System.nanoTime();
            System.out.println("time table : "+(end-start)+ " ms");
            System.out.println("---done---");
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
