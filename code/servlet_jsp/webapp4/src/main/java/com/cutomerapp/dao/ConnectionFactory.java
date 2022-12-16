package com.cutomerapp.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//simple factory
public class ConnectionFactory {
    private static Connection connection=null;
    private ConnectionFactory(){}

    public static Connection getConnection(){

        //read the prop file and polate the data into a Properties
        Properties properties=new Properties();
//        InputStream is=ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");

        BufferedReader br=null;
      try{
           br=new BufferedReader(new FileReader("db.properties"));
      }catch (IOException e){
          e.printStackTrace();
      }
        try {
             properties.load(br);
        }catch (IOException ex){ex.printStackTrace();}

        String driver=properties.getProperty("jdbc.driver");
        String url=properties.getProperty("jdbc.url");
        String username=properties.getProperty("jdbc.username");
        String password=properties.getProperty("jdbc.password");

        try{
            Class.forName(driver);
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        try{
//            Properties properties1=new Properties();
//            properties1.setProperty("username",username);
//            properties1.setProperty("password",password);
             connection=DriverManager
                    .getConnection(url,username, password );
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return connection;
    }
}
