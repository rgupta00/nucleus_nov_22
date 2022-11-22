package com.day8.session2;
class Foo{
    private int i;

    public Foo(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Foo{");
        sb.append("i=").append(i);
        sb.append('}');
        return sb.toString();
    }
    //finilized


    @Override
    protected void finalize() throws Throwable {
        System.out.println("finilized method is called");
        super.finalize();
//        while (true){
//
//        }

    }
}
public class DemoFinilized {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            Foo foo=new Foo(i);
            foo=null;
        }
        System.gc();
        System.out.println("end");
    }
}
