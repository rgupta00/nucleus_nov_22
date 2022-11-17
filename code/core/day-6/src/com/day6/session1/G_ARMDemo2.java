package com.day6.session1;

import java.io.*;

public class G_ARMDemo2 {
    public static void main(String[] args) {


         try(  BufferedReader br=new BufferedReader(new FileReader(new File("data.txt")))){

             String line=null;
             while ((line=br.readLine())!=null){
                 String tokens[]=line.split(" ");
                 for (String token: tokens){
                     System.out.println(token);
                 }
             }
         }
         catch (FileNotFoundException ex){
             System.out.println("file is not found");

         }catch (IOException ex){
             System.out.println("some io ex");

         }catch (Exception ex){
             System.out.println("some other ex occure");
         }
    }
}
