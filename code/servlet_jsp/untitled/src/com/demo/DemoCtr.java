//package com.demo;
//
//import java.io.IOException;
////
//class  MyClass{
//
//    void foof(){
//        //lambda dont have its own this vs ann inner class ka pass apna this hota hey
//        int i=88;
//        Runnable runnable=new Runnable() {
//
//            @Override
//            public void run() {
//                System.out.println("it is ann imp...: "+ i);
//             //  i++;
//            }
//
//        };
//        i++;
//        runnable.run();
//    }
//}
//
////class  MyClass{
////    int i=77;
////    void foof(){
////        //lambda dont have its own this vs ann inner class ka pass apna this hota hey
////        Runnable runnable=()-> {
////                System.out.println("it is ann imp...: "+ this.i);
////
////        };
////
////        runnable.run();
////    }
////}
//
//public class DemoCtr {
//    public static void main(String[] args) {
//
//        //What is the diff be lambda and ann inner class
//
//        //lambda dont have its own this vs ann inner class ka pass apna this hota hey
//        MyClass myClass=new MyClass();
//        myClass.foof();
//
//        //foo is pointing to an object ...
////        Foo foo=new Foo() {
////            @Override
////            public void foo() {
////                System.out.println("ann code");
////            }
////        };
//    //foo is pointer to a function (!)
//     //   Foo foo2=()-> System.out.println("ann code");
//
//
//
//
//    }
//}
