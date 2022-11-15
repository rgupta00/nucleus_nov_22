class Animal{
    void sound(){}
}
class Dog extends Animal{
    void nightWatchDog(){
        System.out.println("saving ur house");
    }

    void sound(){
        System.out.println("bho bho");
    }
}

class Cat extends  Animal{
    void sound(){
        System.out.println("meow..");
    }
}
public class E_UseOfInstanceOf {
    public static void main(String[] args) {
        Animal[]animals={new Dog(), new Cat(), new Dog()};
        for (Animal a: animals){
            a.sound();
            if (a instanceof Dog)
            ((Dog)a).nightWatchDog();
        }
    }
}
