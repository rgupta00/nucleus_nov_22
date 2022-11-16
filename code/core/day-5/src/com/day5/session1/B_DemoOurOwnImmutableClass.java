package com.day5.session1;

import java.util.Arrays;
import java.util.Date;

class  Data{
    private int data;

    public Data(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
final  class  MyImmutable{
    final private  int i;
   final   private String b;
    final Data data;
    final Date date;
   final   int []arr;

    public MyImmutable(int i, String b, Data data, Date date, int[] arr) {
        this.i = i;
        this.b = b;
        this.data = data;
        this.date = (Date) date.clone();
        this.arr = Arrays.copyOf(arr, arr.length);//cloning
    }

    public int getI() {
        return i;
    }
    public String getB() {
        return b;
    }

    public Data getData() {
        return data;
    }


    public Date getDate() {
        return (Date) date.clone();
    }


    public int[] getArr() {
        return Arrays.copyOf(arr, arr.length);
    }



    //int i, String b, Data data, Date date, int[] arr
    public void printInfor(){
        System.out.println("i : "+ i+" b: "+ b+" data: "+ data.getData()+" date: "+ date+" arr: ");
        for (int a:arr){
            System.out.println(a+" ,");
        }
    }
}
public class B_DemoOurOwnImmutableClass {
    public static void main(String[] args) {
        int arr[]={7,8,9};
        Date date=new Date();
        Data data=new Data(55);
        MyImmutable myImmutable=new MyImmutable(3,"foo",data,date,arr);
       // arr[1]=99999;


        myImmutable.printInfor();


        date.setDate(19);

        myImmutable.printInfor();
    }
}
