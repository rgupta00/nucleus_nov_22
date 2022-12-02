package com.day1.pra;

public class Demo {
    private  int k=0;
    private static  int i=6;
    public static  void foof(){
        System.out.println("foof static of demo class");
    }
    private  static  class Bar{

        public void foofMethod(){
          //  System.out.println(k);
            System.out.println(i);
            foof();
        }
    }

    public static void main(String[] args) {
        Bar bar=new Bar();

    }
}
