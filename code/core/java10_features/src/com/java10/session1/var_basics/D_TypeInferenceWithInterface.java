package com.java10.session1.var_basics;
interface MarathonRunner{
    default void run() {
        System.out.println("I'm a marathon runner");
    }
}
class Child2 implements MarathonRunner {
    void whistle() {
        System.out.println("Child-Whistle");
    }
    void stand() {
        System.out.println("Child-stand");
    }
}
public class D_TypeInferenceWithInterface {
    public static void main(String[] args) {
        var obj = new Child2();
        obj.whistle();
        obj.stand();
        obj.run();
    }
}
