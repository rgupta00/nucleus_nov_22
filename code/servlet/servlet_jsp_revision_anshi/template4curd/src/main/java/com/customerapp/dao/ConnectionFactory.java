package com.customerapp.dao;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileStore;
import java.sql.*;
import java.util.Properties;

public class ConnectionFactory {

    private static Connection connection=null;

    private ConnectionFactory(){}
    public static  Connection getConnection(){
        //now we need to load the prop file into Properties

        Properties properties=  new Properties();//Properties is special hashtable ie used to read the prop file
        InputStream is =ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            properties.load(is);
        }catch (IOException e){
            e.printStackTrace();
        }

        String driverName=properties.getProperty("jdbc.driver");
        String url=properties.getProperty("jdbc.url");
        String username=properties.getProperty("jdbc.username");
        String password=properties.getProperty("jdbc.password");

        try{
            Class.forName(driverName);
        }catch (ClassNotFoundException ex){

        }
        try {
            connection = DriverManager
                    .getConnection(url, username, password);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return connection;
    }

}
