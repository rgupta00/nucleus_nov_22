package com.demo;
import java.io.*;
public class DemoIO {
    public static void main(String[] args) throws Exception{

        //read copy

//        FileInputStream fi = new FileInputStream(new File("/home/raj/Desktop/demo/bar.mp4"));
//
//        FileOutputStream fo = new FileOutputStream(new File("/home/raj/Desktop/demo/bar_copy.mp4"));
//
//        long start= System.nanoTime();
//        int ch=0;
//        while ((ch=fi.read())!=-1){
//            fo.write(ch);
//        }
//        fi.close();
//        fo.close();
//
//        long end= System.nanoTime();
//
//        System.out.println("time taken : "+(end-start)+" ns");

//        FileInputStream fi = new FileInputStream(new File("/home/raj/Desktop/demo/bar.mp4"));
//
//        FileOutputStream fo = new FileOutputStream(new File("/home/raj/Desktop/demo/bar_copy2.mp4"));
//
//        byte buffer[]=new byte[4*1024];
//
//        long start= System.nanoTime();
//        int byteRead=0;
//        while ((byteRead=fi.read(buffer))!=-1){
//            fo.write(buffer, 0 , byteRead);
//        }
//        fi.close();
//        fo.close();
//
//        long end= System.nanoTime();
//
//        System.out.println("time taken : "+(end-start)+" ns");


        BufferedInputStream fi =
                new BufferedInputStream
                        (new FileInputStream(new File("/home/raj/Desktop/demo/bar.mp4")));

        BufferedOutputStream fo = new BufferedOutputStream(new FileOutputStream(new File("/home/raj/Desktop/demo/bar_copy2.mp4")));

       long start= System.nanoTime();
       int ch;
        while ((ch=fi.read())!=-1){
            fo.write(ch);
        }
        fi.close();
        fo.close();

        long end= System.nanoTime();

        System.out.println("time taken : "+(end-start)+" ns");



    }
}
