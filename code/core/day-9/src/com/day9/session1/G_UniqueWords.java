package com.day9.session1;
import java.io.*;
import java.util.*;

public class G_UniqueWords {
    public static void main(String[] args) {

        Set<String> set=new TreeSet<>();
        //open the file
        try( BufferedReader br=
                     new BufferedReader(new FileReader(new File("data.txt"))))  {

            //read line by line till file is not finished
            //read line by line till file is not finished
            //make token of each line
            //put that token to hashSet
            String line=null;
            while ((line=br.readLine())!=null){
                String tokens[]=line.split(" ");
                for (String token: tokens){
                    set.add(token.toLowerCase());
                }
            }


        }catch (FileNotFoundException e){
            System.out.println("file is not fond");
        }
        catch (IOException e){
            System.out.println("some io ex");
        }
        catch (Exception e){
            System.out.println("other ex");
        }

        System.out.println("all unique tokens");
        for (String token: set){
            System.out.println(token);
        }

        //print that hashSet

    }
}
