package com.day11.session1;

import java.lang.reflect.Array;
import java.util.Arrays;

class MyArr{
    private int []arr;
    private int counter=0;
    private int size;
    public MyArr(int inSize){
        size=inSize;
        arr=new int[inSize];
    }
    public void addElement(int data){
        if(counter>=size){
            arr= Arrays.copyOf(arr, arr.length*2);
            //double the arrray and assign all data from the older array to new arraay and just assign pointer
            //to oler array
        }
        arr[counter++]=data;
    }
    public void print(){
        for(int i=0; i<counter; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class E_CreateOwnGrowableArraay {
    public static void main(String[] args) {
        MyArr myArr=new MyArr(4);

        myArr.addElement(44);
        myArr.addElement(440);
        myArr.addElement(454);
        myArr.addElement(644);
        myArr.addElement(4);

        myArr.print();
    }

}
