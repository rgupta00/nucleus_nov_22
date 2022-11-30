package com.doubts2.callbyvale;
class Data{
    private int d;

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Data(int d) {
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
public class DemoCallByValueVsCallByRef {
    public static void main(String[] args) {
        /*
        u can not swap 2 object in java as we have discussed but we can change the sate of data hold inside that object

         */

        Data d1=new Data(7);
        System.out.println(d1.getD());
        changeIt(d1);
        System.out.println(d1.getD());



//        Data d1=new Data(7);
//        Data d2=new Data(79);
//        System.out.println(" d 1 : "+ d1.getD() +" d 2 "+ d2.getD());
//        swap(d1, d2);
//        System.out.println(" d 1 : "+ d1.getD() +" d 2 "+ d2.getD());
    }

    private static void changeIt(Data d1) {
        d1.setD(d1.getD()+100);
    }

//    private static void swap(Data d1, Data d2) {
//        Data temp=d1;
//        d1=d2;
//        d2=temp;
//    }

}
