package com.day8.session2;

import java.util.Arrays;

//a object is stb immubale iff once object is creted state can not change in any way
class Data{
    private int d;
    public Data(int d) {
        this.d = d;
    }

    public Data(Data data){
        this.d=data.d;
    }
    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
       return "data is "+ d;
    }
}
class MyImmutable{
    private  int i;
    private String name;
    private Data data;
    private int []arr;

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    public Data getData() {
        return data;
    }

    public int[] getArr() {
        return Arrays.copyOf(arr, arr.length);
    }

    public MyImmutable(int i, String name, Data data, int[] arr) {
        this.i = i;
        this.name = name;
        this.data = new Data(data.getD());
        this.arr = Arrays.copyOf(arr, arr.length);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyImmutable{");
        sb.append("i=").append(i);
        sb.append(", name='").append(name).append('\'');
        sb.append(", data=").append(data);
        sb.append(", arr=").append(Arrays.toString(arr));
        sb.append('}');
        return sb.toString();
    }
}
public class DemoImmutableObject {
    public static void main(String[] args) {
        //int i, String name, Data data, int[] arr
        String name="raja";
        Data data=new Data(55);
        int arr[]={6,77,8};
    MyImmutable myImmutable=new MyImmutable(3,name, data, arr);
        System.out.println(myImmutable);
        arr[1]=9999; // :)
        data.setD(555); //:)
        System.out.println(myImmutable);
    }
}
