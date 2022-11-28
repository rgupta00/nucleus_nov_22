package com.day11.session2;
import java.util.*;
class Dog{
    void sound(){
        System.out.println("sound of dog");
    }
}
class  Cat{

}
class CostlyDog extends Dog{
    void sound(){
        System.out.println("sound of dog in style..");
    }
}
//generic s dont support poly...
public class GenericsAndPolymorphism {
    public static void main(String[] args) {
        /*
                "generics is compile time safty net"
         */
        List<Dog> s=new ArrayList<Dog>();

        s.add(new Dog());
        s.add(new CostlyDog());

    }
}
