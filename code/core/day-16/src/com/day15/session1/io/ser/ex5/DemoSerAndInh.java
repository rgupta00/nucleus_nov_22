package com.day15.session1.io.ser.ex5;
import  java.io.*;
class Foo implements Externalizable{

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
class A {
    int i=10;
    public A(int i){
        System.out.println("ctr of class A");
    }
}
class B extends A implements Serializable {
    int j=20;
    public B(){
        super(55);
        System.out.println("ctr of class B");
    }
}
//instance control flow
public class DemoSerAndInh {
    public static void main(String[] args) throws Exception{
//        ObjectOutputStream oos=
//                new ObjectOutputStream(new FileOutputStream("foo.ser"));
//
//        B b=new B();
//        b.i=66;
//        b.j=77;
//        oos.writeObject(b);
//        System.out.println("----------");
        ObjectInputStream ois=
                new ObjectInputStream(new FileInputStream(new File("foo.ser")));

        B b=(B)ois.readObject();
        System.out.println(b.i+" : "+ b.j);
    }
}
