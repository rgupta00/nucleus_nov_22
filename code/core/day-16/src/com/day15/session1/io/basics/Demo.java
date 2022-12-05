package com.day15.session1.io.basics;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        //Suppressed ex
        try {
            foo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void foo() throws Exception {
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("hello");
            throw new SQLException("some sql ex");
        }catch (Exception ex){
            throw new FileNotFoundException("file not found");
        }
    }
}
