package com.day11.session1;
import java.io.BufferedReader;
import  java.util.*;
import  java.io.*;
public class B_PrintFreqOfEachWord {

    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<>();
      try( BufferedReader br=new BufferedReader(new FileReader(new File("data.txt")))) {
          String line=null;
          while ((line=br.readLine())!=null){
              String []tokens=line.split(" ");
              for(String token: tokens){
                  String tokenLowerCase=token.toLowerCase();
                  if(map.containsKey(tokenLowerCase)){
                      Integer val=map.get(tokenLowerCase);
                      map.put(tokenLowerCase, ++val);
                  }else {
                      map.put(tokenLowerCase, 1);
                  }
              }
          }
      }catch (FileNotFoundException ex){
          ex.printStackTrace();
      }catch (IOException ex){
          ex.printStackTrace();
      }catch (Exception ex){
          ex.printStackTrace();
      }

        System.out.println("print the map");
        Set<Map.Entry<String, Integer>>set=   map.entrySet();
      for(Map.Entry<String, Integer> entry: set){
           System.out.println(entry.getKey()+" : "+ entry.getValue());
       }
        /*
            1. open a file
            2. read till not finished, make token of each line
            3. take a hashMap <String,Integer>
                "apple"
             4.close the file
             5. print map
         */

    }
}
