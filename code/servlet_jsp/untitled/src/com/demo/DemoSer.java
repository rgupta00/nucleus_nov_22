package com.demo;
/*
    1. class need to imp serilizable inerface (marker interface)
    2. ser is not static data
    3. if base class is ser then all class belong to that herirarchy become ser
    4. in case of compostion
        class B{
           }
        class A implements Seri....{
            B b=new B();
          }
          both must be seriliation if A is ser and B is not then : ex at run time NonSerException

      even if B is not ser then even error should not come : transient  in this case A state  is wriitne in the file but not of B
      readObject()
      writeObject()

      in case of inheriance if base class is not ser but drive clas is ser
      then ser will not fail: intance control flow:     InvalidClassException
 */
//class  A{
//    public A(int a){
//        System.out.println("it is para");
//    }
//}
//class
//public class DemoSer {
//    public static void main(String[] args) {
//
//    }
//}
