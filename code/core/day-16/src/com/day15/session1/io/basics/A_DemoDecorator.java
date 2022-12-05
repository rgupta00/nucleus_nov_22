package com.day15.session1.io.basics;
/*
    how io works: decorator dp
    good morning -> special gm -> new year s gm
    inheritance and compostion
 */
interface Greet{
    public String greet();
}
class SimpleGreet implements Greet{
    @Override
    public String greet() {
        return "good morning ";
    }
}
class SpecialGreet implements Greet{
    private Greet greet;
    public SpecialGreet(Greet greet) {
        this.greet = greet;
    }
    @Override
    public String greet() {
        return "Special "+  greet.greet();
    }
}
class YetAnotherSpecialGreet implements Greet{
    private Greet greet;
    public YetAnotherSpecialGreet(Greet greet) {
        this.greet = greet;
    }
    @Override
    public String greet() {
        return "Very ! "+  greet.greet();
    }
}

public class A_DemoDecorator {
    public static void main(String[] args) {
        Greet greet=
                new YetAnotherSpecialGreet(new SpecialGreet(new SimpleGreet()));
        System.out.println(greet.greet());
    }
}
