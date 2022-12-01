package com.day15.session1.io.basics;
import java.io.*;
public class B_ReadingByteStream {
    public static void main(String[] args) {

        //BufferedInputStream and FileInputStream
      //  BufferedReader and FileReader
       try{
           BufferedReader br=new BufferedReader
                   (new FileReader(new File("/home/raj/Desktop/photo/dog.jpeg")));

           BufferedWriter bo=new BufferedWriter
                   (new FileWriter(new File("/home/raj/Desktop/photo/dog2.jpeg")));


           int byteRead;
           while ((byteRead = br.read()) != -1) {  // Read byte-by-byte from buffer
              bo.write(byteRead);
           }
        br.close();
           bo.close();
       }catch (Exception e){
        e.printStackTrace();
       }
    }
}
