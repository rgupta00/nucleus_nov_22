package com.day15.session1.io.basics;
import java.io.*;
public class A_BasicFile {
    public static void main(String[] args) {
        //read data from the file

        //Path Paths api java 7*
        //What is file in Java
        File file=new File("c:\\data\\foo");
        if(file.isDirectory()){
            File[]files=file.listFiles(File::isHidden);
            for (File f: files){
                System.out.println(f.getPath()+" : "+ f.getName());
            }
        }


        System.out.println("--------");

        try(FileReader fr=new FileReader("data.txt")) {
            int ch;
           while ((ch=fr.read())!=-1){
               System.out.println(ch);
           }
        }catch (Exception e){

        }




//       try(BufferedReader br=new
//               BufferedReader(new FileReader("demo.txt"))) {
//
//           String line=null;
//           while ((line=br.readLine())!=null){
//               System.out.println(line);
//           }
//       }catch (FileNotFoundException e){
//           e.printStackTrace();
//       }catch (IOException e){
//           e.printStackTrace();
//       }
    }
}
