package com.hello;

import java.sql.*;

public class F_GetMetaDataInfo {

    public static void main(String[] args) {
        try(Connection connection=ConnectionFactory.getConnection()){

            Statement stmt=connection.createStatement();

            ResultSet rs=stmt.executeQuery("select * from emp");

            ResultSetMetaData rsMeta=rs.getMetaData();

            for (int i=1;i<=rsMeta.getColumnCount(); i++){
                System.out.println(rsMeta.getColumnName(i)+" : "+rsMeta.getCatalogName(i));
            }

            DatabaseMetaData dbMt= connection.getMetaData();
            System.out.println(dbMt.getDriverName());
            System.out.println(dbMt.getDriverMajorVersion());
            System.out.println(dbMt.getDatabaseMinorVersion());
            ///...
            System.out.println("con is done");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
