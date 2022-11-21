package com.day8.session1;
class Animal{
    void sound(){
        System.out.println("sound of animal ?");
    }
}
class Dog extends  Animal{
    void sound(){
        System.out.println("bho bho");
    }
}

class Cat extends  Animal{
    void sound(){
        System.out.println("meou..");
    }
}

public class E_ArrayStoreEx {
    public static void main(String[] args) {
        Dog[]dogs={new Dog(), new Dog()};

        print(dogs);
    }

    private static void print(Animal[] dogs) {
        dogs[0]=new Cat();
        for (Animal d: dogs){
            d.sound();
        }
    }
}
