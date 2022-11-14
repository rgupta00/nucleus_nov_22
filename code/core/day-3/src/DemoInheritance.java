class A{
     int i=0;
    public A(int i){
        this.i=i;
    }
    public  void print(){
        System.out.println(i);
    }
}
class B extends A{
    int j=0;
    public B(int i, int j){
        super(i);
        this.j=j;
    }
    //Overriden
    public  void print(){
        super.print();  //resuablity
        System.out.println(j);
    }
}
public class DemoInheritance {
    public static void main(String[] args) {
        B b=new B(3,6);
    b.print();
    }
}
