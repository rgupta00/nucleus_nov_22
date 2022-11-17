package com.java10.session1.var_basics;
class Parent {
    void whistle() {
        System.out.println("Parent-Whistle");
    }
}
class Child extends Parent {
    void whistle() {
        System.out.println("Child-Whistle");
    }
    void stand() {
        System.out.println("Child-stand");
    }
}
public class C_VarWithClasses {
    public static Parent getObject(String type) {
        if (type.equals("Parent"))
            return new Parent();
        else
            return new Child();
    }
    public static void main(String[] args) {
        /*
        In JDK 9 and other previous versions, you could define a variable of the base class and
assign an instance of its derived class to it. The members that you could access using the
variable were limited to the ones that were defined in the base class. This is no longer the
case with var , since the type of the variable is inferred by using the specific type of the
instance that is assigned to it.
         */
        var obj = new Child();
        obj.whistle();
        obj.stand();
// type of obj inferred as Child

        /*
        What happens if you assign the value of the obj variable using a
        method that can return an instance of the Child class or Parent classes?
        Here's the modified code:
         */

        var obj2 = getObject("Child");
        obj2.whistle();
        obj.stand();// This line doesn't compile
    }
}
