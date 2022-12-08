package com.hello;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class H_BatchProcessingWrite {
    public static void main(String[] args) {
        try(Connection connection=ConnectionFactory.getConnection()){
            //inset the rec Statement vs PrepareSatement
            PreparedStatement pstmt=
                    connection.prepareStatement("insert into mytable(name) values (?)");

            connection.setAutoCommit(false);

            for(long i=1;i<=100_00; i++){
                pstmt.setString(1,"nu "+ i);
                pstmt.addBatch();
                if(i%200==0){
                    pstmt.executeBatch();
                }
            }

            connection.commit();

            System.out.println("---done---");
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
