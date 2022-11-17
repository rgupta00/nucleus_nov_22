package com.java10.session1.var_basics;
 class Person {
    {
        var name = "Aqua Blue";
    }
    // instance initializer block
    static {
        var anotherLocalVar = 19876;
    }
    // static initializer block
    Person() {
        var ctr = 10;
// constructor
        for (var loopCtr = 0; loopCtr < 10; ++loopCtr) {
            switch(loopCtr) {
                case 7 :{
                    var probability = ctr / loopCtr;
                    System.out.println(probability);
                    break;
                }
            }

        }
    }

}
public class B_VarForLocalVariableOnly {
    public static void main(String[] args) {

    }
}
