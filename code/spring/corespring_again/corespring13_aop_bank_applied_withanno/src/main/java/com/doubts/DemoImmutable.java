package com.doubts;

import java.util.Arrays;
import java.util.Date;

class Emp{
   private int id;
   private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
final class MyImm{
    final private int id;
    final private String name;
    final private int arr[];
    final public Date date;

    public MyImm(int id, String name, int[] arr, Date date) {
        this.id = id;
        this.name = name;
        this.arr = Arrays.copyOf(arr, arr.length);
        this.date =  (Date) date.clone();;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getArr() {
        return Arrays.copyOf(arr, arr.length);
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyImm{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", arr=").append(Arrays.toString(arr));
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
public class DemoImmutable {
    public static void main(String[] args) {


    int arr[]={4,6,8};
    String name="raj";
    Date date=new Date();
    int id=55;
    //int id, String name, int[] arr, Date date
    MyImm myImm=new MyImm(id, name, arr, date);
    System.out.println(myImm);

    arr[1]=777;
        System.out.println(myImm);







//     final Emp emp=new Emp();//pointer final hua na ki uski state
//    // emp=null;
//     emp.setId(22);
//     emp.setName("ravi");
//        System.out.println(emp);
//
//        emp.setId(220);
//        emp.setName("rajiv");
//
//        System.out.println(emp);

    }
}
