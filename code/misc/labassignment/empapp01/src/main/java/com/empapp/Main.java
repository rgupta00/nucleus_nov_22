package com.empapp;

import com.validation.EmployeeValidation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception{

        Connection connection=ConnectionFactory.getConnection();
        PreparedStatement stmt=connection.prepareStatement("select * from loc");
        ResultSet rs=stmt.executeQuery();
        String location =null;
        while (rs.next()){
             location= rs.getString("filename");
            if(location.contains(".txt")){
                break;
            }
        }

       try{
           BufferedReader br=new BufferedReader(new FileReader(location));

           String line=null;
           while ((line=br.readLine())!=null){
               String tokens[]=line.split(":");
               for (String token: tokens){

               }

           }

       }catch (IOException ex){
           ex.printStackTrace();
       }


    }
}