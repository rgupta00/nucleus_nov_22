interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Bird{
    void sound(){
        System.out.println("sound of a bird");
    }
    void eat(){
        System.out.println("eat of a bird");
    }
}
class Eagle extends  Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("fly like anything");
    }
}
class Emu extends  Bird{

}

class Duck extends  Bird implements Swimmable{

    @Override
    public void swim() {
        System.out.println("best in swimming");
    }
}


public class C_InterfaceCanImproveDesignOfApp {
    public static void main(String[] args) {
        Bird bird=new Eagle();
       ((Eagle) bird).fly();
    }
}
