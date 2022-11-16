package com.day5.session1;

import java.util.Arrays;

public class C_ArraysOf {

    public static void main(String[] args) {

        int arr[]={6,7,9};



        int arr2[]= Arrays.copyOf(arr, arr.length);//cloning
        for(int i: arr){
            System.out.println(i);
        }
        System.out.println("---------------");
        for(int i: arr2){
            System.out.println(i);
        }
        if(arr==arr2)
            System.out.println("same");
        else
            System.out.println("not same");
    }
}
