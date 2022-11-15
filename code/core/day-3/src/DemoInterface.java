
interface X1{
   public static final int i=10;
   public  abstract  void foo();
}
interface Y1{
    public static final int i=20;
    public  abstract  void foo();
}
class XY implements X1, Y1{
    public void foo(){
        System.out.println("some imp of foo method");
    }
}
public class DemoInterface {
    public static void main(String[] args) {
        System.out.println(X1.i);
    }
}


