package com.day8.session3;
interface Cook{
    void cookable();
}
public class D_AnnInnerClass {
    public static void main(String[] args) {



    //ann inner class vs labmbda express


        Cook cook=() -> System.out.println("street food");

        cook.cookable();




//
//        Cook cook2=new Cook() {
//            @Override
//            public void cookable() {
//                System.out.println("hotel food");
//            }
//        };
//        cook2.cookable();
//
//        Cook cook3=new Cook() {
//            @Override
//            public void cookable() {
//                System.out.println("5 star hotel food");
//            }
//        };
//        cook3.cookable();


    }
}
