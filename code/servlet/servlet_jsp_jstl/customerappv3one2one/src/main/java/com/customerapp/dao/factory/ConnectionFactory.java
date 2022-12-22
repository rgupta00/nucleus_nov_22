package com.customerapp.dao.factory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static Connection connection=null;
    private ConnectionFactory(){}

    public static Connection getConnection(){

        //read the prop file and polate the data into a Properties
        Properties properties=new Properties();
        InputStream is=ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");


        try {
            properties.load(is);
        }catch (IOException ex){ex.printStackTrace();}

       // String driver=properties.getProperty("jdbc.driver");
        String url=properties.getProperty("jdbc.url");
        String username=properties.getProperty("jdbc.username");
        String password=properties.getProperty("jdbc.password");


        try{

            connection= DriverManager
                    .getConnection(url,username, password );
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return connection;
    }
}
