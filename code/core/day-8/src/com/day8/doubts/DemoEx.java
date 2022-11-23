package com.day8.doubts;
class Data{
    private  int d;

    public Data(int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Data{");
        sb.append("d=").append(d);
        sb.append('}');
        return sb.toString();
    }
}
public class DemoEx {
    public static void main(String[] args) {

        int i=6;
        Data a=new Data(55);

       Data d1=new Data(4);
       Data d2=new Data(8);
        System.out.println("d1: "+ d1.getD());
       changeMe(d1);
        System.out.println("d1: "+ d1.getD());
       // System.out.println("d1 "+ d1.getD()+" d2 "+ d2.getD());
      //  swap(d1, d2);

       // System.out.println("d1 "+ d1.getD()+" d2 "+ d2.getD());

    }

     static void changeMe(Data x) {
        x.setD(x.getD()+10);

    }

    static void swap(Data a, Data b) {
        Data temp=a;
        a=b;
        b=temp;
    }

//     static void swap(int i, int j) {
//        int temp=i;
//        i=j;
//        j=temp;
//    }
}
