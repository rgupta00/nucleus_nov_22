package com.day11.session3;

import java.lang.reflect.Array;

class StackOverFlowException extends RuntimeException{
    public StackOverFlowException(String message) {
        super(message);
    }
}
class StackUnderFlowException extends RuntimeException{
    public StackUnderFlowException(String message) {
        super(message);
    }
}
interface Stack<T>{
    public void push(T data);
    public T pop();

}
public class StackImplArray<T> implements Stack<T>{
    private T arr[];
    int top;
    int size;
    public StackImplArray(Class<T> clazz) {
        this.size=5;
            arr = (T[]) Array.newInstance(clazz, size);     // this.arr = new int[T]; * java reflection
        top=-1;
    }
    public void push(T data){
        if(!isFull())
            arr[++top]=data;
    }
    public T pop(){
        if(top==-1)
            throw  new StackUnderFlowException("stack underflow");
            return  arr[top--];
    }

    private boolean isEmpty() {
        if(top==-1)
            throw  new StackUnderFlowException("stack underflow");
        return false;
    }

    public boolean isFull(){
        if(top==size-1)
            throw new StackOverFlowException("overflow...");
        return false;
    }

}







//public class Stack {
//    private int arr[];
//    int top;
//    int size;
//    public Stack() {
//        this.size=5;
//        this.arr = new int[size];
//        top=-1;
//    }
//    public void push(int data){
//        if(!isFull())
//        arr[++top]=data;
//    }
//    public int pop(){
//        if(!isEmpty())
//            return  arr[top--];
//        else
//            return -999;
//    }
//
//    private boolean isEmpty() {
//        if(top==-1)
//            throw  new StackUnderFlowException("stack underflow");
//        return false;
//    }
//
//    public boolean isFull(){
//        if(top==size-1)
//            throw new StackOverFlowException("overflow...");
//        return false;
//    }
//
//}
