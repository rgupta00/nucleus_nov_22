package com.doubts2.withoutiterator;
class Emp{
     int id=6;
     String name="foo";
    {
        id=777;
    }
    public Emp(){
      //  id=7;
        name="bar";
    }

}
public class DemoCreateOfObject {
    public static void main(String[] args) {
        Emp e=new Emp();
        System.out.println(e.id);
        System.out.println(e.name);

    }
}
