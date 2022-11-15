class  X{
    void foo(){
        System.out.println("foo of X1");
    }
}

class  Y extends  X{
    void bar(){
        System.out.println("bar of Y");
    }

    void foo(){
        System.out.println("foo of Y");
    }
}

class  Z extends X{
    void foo(){
        System.out.println("foo of Y");
    }
}


public class D_UpandDownCasting {
    public static void main(String[] args) {

       X x1=new Y();
       X x2=new Z();
    //instanceOf Operator: works at run time
       if(x2 instanceof Z){
       Z z1= (Z) x2;
        z1.foo();
       }else {
           System.out.println("it is not possible");
       }
    }
}
