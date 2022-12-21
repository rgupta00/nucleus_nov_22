package com.demo;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import  java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //the purpose of it is to provide a connection , Factory dp
    private static Connection connection=null;

    public  static Connection getConnection(){

        InputStream is=ConnectionFactory.
                class.getClassLoader().getResourceAsStream("conn.properties");

        Properties properties=new Properties();
        try{
            properties.load(is);
        }catch (IOException e){
            e.printStackTrace();
        }

        String url=properties.getProperty("jdbc.url");
        String driverName=properties.getProperty("jdbc.driver");
        String username=properties.getProperty("jdbc.username");
        String password=properties.getProperty("jdbc.password");


        try{
            Class.forName(driverName);
            System.out.println("driver is loaded");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

       try{
           connection= DriverManager.getConnection(url,username,password);
       }catch (SQLException ex){
           ex.printStackTrace();
       }
        return connection;
    }

}
