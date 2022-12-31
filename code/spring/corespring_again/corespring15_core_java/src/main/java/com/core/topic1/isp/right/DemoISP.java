package com.core.topic1.isp.right;
//isp
interface Flyable {
    public void fly();
}

interface Swimable {
    public void swim();
}
class Bird{
    public void eat(){
        System.out.println("eat....");
    }
}
class Eagle extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("it can fly like anyting");
    }

}
class Duck extends Bird implements Swimable{

    @Override
    public void swim() {
        System.out.println("it can swim okish");
    }
}
class Emu extends Bird {

}

public class DemoISP {
    public static void main(String[] args) {

    }
}
