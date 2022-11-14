public class SingletonTester {

    public static void main(String[] args) {
        Singleton singleton=Singleton.getSingletonInstance();
        System.out.println(singleton.hashCode());

        Singleton singleton2=Singleton.getSingletonInstance();
        System.out.println(singleton2.hashCode());

    }
}

