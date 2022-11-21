package com.day8.session1;

import java.util.InputMismatchException;
import java.util.Scanner;
class Door implements AutoCloseable{
    public Door(){
        System.out.println("ctr of door is called");
    }
    public void doWork(){
        System.out.println("do work is called");
    }
    @Override
    public void close() throws Exception {
        System.out.println("close is called automatically");
    }
}
public class B_ExRevision {
    public static void main(String[] args) {
        try(Door door=new Door()){
            door.doWork();
        }catch (Exception e){

        }
        //java 6
//        Scanner scanner=null;
//       try {
//            scanner=new Scanner(System.in);
//           int i,j,k;
//           System.out.println("PE two no");
//           i=scanner.nextInt();
//           j=scanner.nextInt();
//           k=i/j;
//           System.out.println("value of k: "+ k);
//       }catch (ArithmeticException e){
//           System.out.println("dont put 0 for Deno");
//       }catch (InputMismatchException e){
//           System.out.println("you should only enter ints");
//       }catch (Exception e){
//           System.out.println("some other ex");
//       }finally {
//           scanner.close();
//       }
//        System.out.println("end");

       //java 7: ARM


//        try(Scanner scanner=new Scanner(System.in)) {
//            int i,j,k;
//            System.out.println("PE two no");
//            i=scanner.nextInt();
//            j=scanner.nextInt();
//            k=i/j;
//            System.out.println("value of k: "+ k);
//        }catch (ArithmeticException e){
//            System.out.println("dont put 0 for Deno");
//        }catch (InputMismatchException e){
//            System.out.println("you should only enter ints");
//        }catch (Exception e){
//            System.out.println("some other ex");
//        }
//        System.out.println("end");

        //ARM when u can apply this: X must have implemented AutoClosable
    }
}












