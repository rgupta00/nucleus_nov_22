package com.day9.session1;
import java.util.*;//collection api is defined in util package
public class A_HelloWorldCollectionAPI {
    public static void main(String[] args) {
        List list=getData();

        String data= (String) list.get(2);
        System.out.println(data);




    }
    public static  List getData(){
        List list=new ArrayList();
        list.add("foo");
        list.add(5);//ds of java dont support private
        list.add(new Employee(1,"raj",7000));
        return  list;
    }
}
