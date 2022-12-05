package com.day15.session1.io.ser.ex6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Dog /*implements Serializable */{
    private int id;

    public Dog(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}

public class SerJavaCollection {
    public static void main(String[] args) throws Exception{

        List<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog(33));
        ObjectOutputStream oos=
                new ObjectOutputStream(new FileOutputStream("foo.ser"));
        oos.writeObject(dogs);
        System.out.println("-------");

    }
}
