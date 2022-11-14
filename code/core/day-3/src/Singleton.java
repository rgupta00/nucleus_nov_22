public class Singleton {
    private static Singleton singleton=new Singleton();
    private Singleton(){
        System.out.println("dare to call me!");
    }

    public static Singleton getSingletonInstance(){
        return singleton;
    }
}
