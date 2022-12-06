package com.ll;

public class Demo {
    public static void main(String[] args) {
        int a[]= {5,1,6,2,4,3};// playing card
        int temp;
        int j;
        for(int i=1;i<a.length; i++)
        {
            temp=a[i];
            j=i;
            while(j>0 && a[j-1]> temp)
            {
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        for(int val: a) {
            System.out.print(val+" ");
        }
    }
}
