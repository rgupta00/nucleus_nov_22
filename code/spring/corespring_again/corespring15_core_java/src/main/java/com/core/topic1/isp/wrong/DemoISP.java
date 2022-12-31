package com.core.topic1.isp.wrong;
//isp
interface BirdishBehavior {
    public void fly();
    public void swim();
}
class Bird{
    public void eat(){
        System.out.println("eat....");
    }
}
class Eagle extends Bird implements BirdishBehavior{

    @Override
    public void fly() {
        System.out.println("it can fly like anyting");
    }

    @Override
    public void swim() {
        throw new IllegalStateException();
    }
}
class Duck extends Bird implements BirdishBehavior{
    @Override
    public void fly() {
       throw new IllegalStateException();
    }

    @Override
    public void swim() {
        System.out.println("it can swim okish");
    }
}
class Emu extends Bird implements BirdishBehavior{
    @Override
    public void fly() {
        throw new IllegalStateException();
    }

    @Override
    public void swim() {
        throw new IllegalStateException();
    }
}

public class DemoISP {
    public static void main(String[] args) {

    }
}
