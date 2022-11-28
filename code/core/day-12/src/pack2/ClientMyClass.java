package pack2;

import pack1.MyClass;

public class ClientMyClass extends MyClass{

    public static void main(String[] args) {

        ClientMyClass myClass=new ClientMyClass();
        myClass.fooProtected();
    }
}
