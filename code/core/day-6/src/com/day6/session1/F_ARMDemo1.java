package com.day6.session1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class F_ARMDemo1 {
    public static void main(String[] args) {

           try(Scanner scanner=new Scanner(System.in)){
               int i, j , k;
               System.out.println("PE first no");
               i=scanner.nextInt();
               System.out.println("PE sec no");
               j=scanner.nextInt();

               k=i/j;
               System.out.println("k: "+ k);
           }catch (ArithmeticException e){
               System.out.println("some arth ex");
           }catch (InputMismatchException e){
               System.out.println("int only");
           }

    }
}
