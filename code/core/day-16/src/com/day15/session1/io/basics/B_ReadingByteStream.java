package com.day15.session1.io.basics;
import java.io.*;
public class B_ReadingByteStream {
    public static void main(String[] args) {

        //BufferedInputStream and FileInputStream
      //  BufferedReader and FileReader

        long start=System.currentTimeMillis();
        try{
            FileInputStream fis=
                    new FileInputStream(new File("/home/raj/Desktop/photo/dog.jpeg"));

            FileOutputStream fos=
                    new FileOutputStream(new File("/home/raj/Desktop/photo/dog2.jpeg"));

            int byteRead;
            while ((byteRead = fis.read()) != -1) {  // Read byte-by-byte from buffer
                fos.write(byteRead);
            }
            fis.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        long end=System.currentTimeMillis();

        System.out.println("time taken: "+(end-start)+" ms");





        //time taken: 2ms
//    long start=System.currentTimeMillis();
//        try{
//            BufferedInputStream bis=new BufferedInputStream
//                    (new FileInputStream(new File("/home/raj/Desktop/photo/dog.jpeg")));
//
//            BufferedOutputStream bos=new BufferedOutputStream
//                    (new FileOutputStream(new File("/home/raj/Desktop/photo/dog2.jpeg")));
//
//            int byteRead;
//            while ((byteRead = bis.read()) != -1) {  // Read byte-by-byte from buffer
//                bos.write(byteRead);
//            }
//            bis.close();
//            bos.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        long end=System.currentTimeMillis();
//
//        System.out.println("time taken: "+(end-start)+" ms");


//       try{
//           BufferedReader br=new BufferedReader
//                   (new FileReader(new File("/home/raj/Desktop/photo/dog.jpeg")));
//
//           BufferedWriter bo=new BufferedWriter
//                   (new FileWriter(new File("/home/raj/Desktop/photo/dog2.jpeg")));
//
//           int byteRead;
//           while ((byteRead = br.read()) != -1) {  // Read byte-by-byte from buffer
//              bo.write(byteRead);
//           }
//        br.close();
//           bo.close();
//       }catch (Exception e){
//        e.printStackTrace();
//       }
    }
}
