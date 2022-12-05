package com.day15.session1.io.basics;
import java.io.*;
public class A_BasicFile {
    public static void main(String[] args) throws Exception{
//        BufferedReader br=new BufferedReader
//                (new FileReader("demo.txt"));

//        BufferedReader br=new BufferedReader
//                (new InputStreamReader(System.in));


        long start=System.currentTimeMillis();
        // FileInputStream vs FileOutputStream
       // BufferedOutputStream
        //BufferedInputStream
        BufferedInputStream fis=new BufferedInputStream(new FileInputStream
                ("/home/raj/Desktop/photo/dog.jpeg"));

        BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream
                ("/home/raj/Desktop/photo/dog_copy.jpeg"));
        int ch;
        while ((ch=fis.read())!=-1){
            fos.write(ch);
        }
        fos.close();
        fis.close();
        long end=System.currentTimeMillis();
        System.out.println("time taken: "+(end-start)+" ms");




        //BufferedReader -->FileReader
        //BufferedInputStream vs FileInputStream
        /*
         byte arr[]=new byte[4*1028];
        while ((ch=fis.read(arr))!=-1){
                fos.write(arr, 0, ch);
        }
         */
//        long start=System.currentTimeMillis();
//       // FileInputStream vs FileOutputStream
//        FileInputStream fis=new FileInputStream
//                ("/home/raj/Desktop/photo/dog.jpeg");
//        FileOutputStream fos=new FileOutputStream
//                ("/home/raj/Desktop/photo/dog_copy.jpeg");
//
//        int ch;
//        byte arr[]=new byte[12*1028];
//
//        while ((ch=fis.read(arr))!=-1){
//            System.out.println(ch);
//            //fos.write(ch);
//            fos.write(arr, 0, ch);
//        }
//        fos.close();
//        fis.close();
//        long end=System.currentTimeMillis();
//        System.out.println("time taken: "+(end-start)+" ms");

        System.out.println("done");


        /*
                FileInputStream fis=new FileInputStream("/home/raj/Desktop/photo/dog.jpeg");
        FileOutputStream fos=new FileOutputStream("/home/raj/Desktop/photo/dog2.jpeg");
        int data;
        byte arr[]=new byte[4*1024];
        while ((data= fis.read(arr))!=-1){
            fos.write(arr, 0, data);
        }
        fis.close();
        fos.close();
         */
        //read data from the file

        //Path Paths api java 7*
        //What is file in Java
//        File file=new File("c:\\data\\foo");
//        if(file.isDirectory()){
//            File[]files=file.listFiles(File::isHidden);
//            for (File f: files){
//                System.out.println(f.getPath()+" : "+ f.getName());
//            }
//        }
//
//
//        System.out.println("--------");
//
//        try(FileReader fr=new FileReader("data.txt")) {
//            int ch;
//           while ((ch=fr.read())!=-1){
//               System.out.println(ch);
//           }
//        }catch (Exception e){
//
//        }




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
