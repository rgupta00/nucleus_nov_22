package com.empapp;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static Connection connection=null;

    static {

    }
    public static  Connection getConnection(){

        //i need to read that property file and to find out infor
        Properties properties=new Properties();
       try{
          //InputStream fr= ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
           InputStream is =ConnectionFactory
                   .class.getClassLoader()
                   .getResourceAsStream("db.properties");
        //  properties.load(new FileReader("db.properties"));
           properties.load(is);
       }catch (IOException e){
           e.printStackTrace();
       }
       String driverName=properties.getProperty("jdbc.driver");
        String url=properties.getProperty("jdbc.url");
        String username=properties.getProperty("jdbc.username");
        String password=properties.getProperty("jdbc.password");



        try{
            Class.forName(driverName);// oracle
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

       try{
           connection= DriverManager.getConnection(url, username,password);
       }catch (SQLException ex){}
        return connection;
    }

}
