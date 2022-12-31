package com.doubts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DemoEx {
    public static void main(String[] args) {
        //Excpetion:Throwable , Ex
        //try catch throw throws finally
//        Scanner scanner=null;
//        try(Scanner scanner1=new Scanner(System.in)){
//        }


        Employee employee=new Employee();

        try(BufferedReader br=new BufferedReader(new FileReader("foo.txt"))){
        }catch (IOException ex){

        }

    }
}
