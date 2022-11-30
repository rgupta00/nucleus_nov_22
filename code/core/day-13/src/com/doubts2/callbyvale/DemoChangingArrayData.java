package com.doubts2.callbyvale;

import java.util.Arrays;

public class DemoChangingArrayData {
    public static void main(String[] args) {
        int arr[]={5,7,8};
        printArr(arr);
        changeIt(arr);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void changeIt(int[] arr) {
        for(int i=0;i<arr.length; i++){
            arr[i]=arr[i]*2;
        }
    }
}
