package com.day8.session2;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1=new Employee("raj",700);
        System.out.println(e1);

//        for (int i=0;i<10; i++){
//            Employee e1=new Employee(1,"raj",700);
//            System.gc();
//            e1=null;
//        }
//        System.out.println("done");

//       try{
//           Employee e1=new Employee(1,"raj",700);
//           Employee e2=(Employee) e1.clone();
//           System.out.println(e2);
//       }catch (CloneNotSupportedException e){
//           System.out.println("clone is not supported");
//       }


//
//        Employee e1=new Employee(1,"raj",700);
//        Employee e2=new Employee(1,"raj",700);
//
//        if(e1.equals(e2)){
//            System.out.println("same");
//        }else
//            System.out.println("not same");

//        Object e=new Employee(1,"raj",700);
//        System.out.println(e);



//        System.out.println(e.getClass());//* java reflection *
//
//        Employee e2=new Employee(1,"raj",700);
//        System.out.println(e2.getClass());//* java reflection *

    }
}
