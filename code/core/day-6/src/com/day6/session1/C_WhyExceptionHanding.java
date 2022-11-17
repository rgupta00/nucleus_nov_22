package com.day6.session1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C_WhyExceptionHanding {
    public static void main(String[] args) {

        //what is robubstness of code
        Scanner scanner=null;
       try{
           scanner=new Scanner(System.in);
           int i, j , k;
           System.out.println("PE first no");
           i=scanner.nextInt();
           System.out.println("PE sec no");
           j=scanner.nextInt();

           k=i/j;
           System.out.println("k: "+ k);

       }catch (ArithmeticException ex) {
           System.out.println("Deno can not be zero");
       }catch (InputMismatchException ex) {
           System.out.println("should only provide ints");
       }
       finally {
           System.out.println("end");
           scanner.close();
       }


    }
}
