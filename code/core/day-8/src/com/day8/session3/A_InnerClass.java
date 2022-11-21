package com.day8.session3;
//Note : object of inner class cant exist withouot the object of outer class

//class Outer{
//       class  Inner{
//         public void foo(){
//             System.out.println("foo of class Innner");
//         }
//     }
//     public  static  void outerMethod(){
//         Inner inner=new Inner();
//         inner.foo();
//     }
//}
//
//class B{
//    interface C{
//
//    }
//}
//interface  Foo{
//   class A{
//
//   }
//}
//class Z{
//    class P extends M{
//        class M{
//
//        }
//    }
//}
//class Outer{
//
//    private int i=55;
//     class  Inner{
//         private int i=555;
//         private int m=556;
//        public void foo(){
//            System.out.println("foo of class Innner : "+Outer.this.i);
//        }
//    }
//    public void foofOuter(){
//        System.out.println(m);
//    }
//
//}

public class A_InnerClass {
    public static void main(String[] args) {
//        Outer.Inner in=new Outer().new Inner();
//        in.foo();

//        Outer outer=new Outer();
//        outer.outerMethod();
        //Top level inner class
        //Outer.Inner inner=new Outer().new Inner();
    }
}









