package com.day5.session1;
//java dont support call by ref only support call by value
class MyData{
    private  int i;

    public MyData(int i) {
        this.i = i;
    }
    public  void print(){
        System.out.println("i: "+ i);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
public class D_CallByValueCallByRef {
    public static void main(String[] args) {

      MyData d1=new MyData(5);

        System.out.println(d1.getI());
      changeMe(d1);
        System.out.println(d1.getI());
    }
    private static void changeMe(MyData d1) {
        d1=new MyData(777);
    }

}
