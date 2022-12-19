package com.empapp.util;
import com.empapp.dao.Customer;

import java.io.*;
import java.util.*;
public class FileOperation {

    public static  List<Customer> getAllValidRecords(){
        List<Customer> customers=new ArrayList<>();

        //Read
       try(BufferedReader br=new BufferedReader(new FileReader("data_rec.txt"));
           BufferedWriter bw=new BufferedWriter(new FileWriter("data_rec_rejected.txt"))  ){
           String line=null;
           while ((line=br.readLine())!=null){
                String tokens[]=line.split(":");
                if(!validate(tokens)){
                    bw.write(line);
                }
                Customer customer=new Customer(Integer.parseInt(tokens[0]),tokens[1],Double.parseDouble(tokens[2]));
               customers.add(customer);
           }
           bw.flush();
       }catch (IOException ex){
           ex.printStackTrace();
       }

        return customers;
    }

    private static  boolean validate(String[] tokens) {
        if(DataValidation.isNotNull(tokens[0])||DataValidation.isNotNull(tokens[1])||DataValidation.isNotNull(tokens[2])){
            return true;
        }
        return false;
    }
}
