package com.core.topic1;
//seprate what varies
interface Sortable{
    public int [] sort(int arr[]);
}
class BubbleSort implements Sortable{
    @Override
    public int[] sort(int[] arr) {
        System.out.println("using bs");
        return null;
    }
}
class MSort implements Sortable{
    @Override
    public int[] sort(int[] arr) {
        System.out.println("using MSort");
        return null;
    }
}

class ArrayOp{
    private int arr[];
    private Sortable sortable=new BubbleSort();

    public void setSortable(Sortable sortable) {
        this.sortable = sortable;
    }

    public ArrayOp(){
        arr=new int[10];
    }
    //36
    public void sort(){
       arr=sortable.sort(arr);
    }
}

public class DemoDS {
}
