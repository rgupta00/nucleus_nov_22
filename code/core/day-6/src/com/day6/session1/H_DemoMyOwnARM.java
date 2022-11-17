package com.day6.session1;

import java.io.IOException;
class Window implements AutoCloseable{
    public Window(){
        System.out.println("ctr of Window class");
    }
    @Override
    public void close() throws Exception {
        System.out.println("close method for Window is called");
    }
    public void doWorkWindow(){
        System.out.println("doing work Window");
    }
}
class Door implements AutoCloseable{
 public Door(){
     System.out.println("ctr of door class");
 }
    @Override
    public void close() throws Exception {
        System.out.println("close method for door is called");
    }
    public void doWork(){
        System.out.println("doing work");
    }
}
public class H_DemoMyOwnARM {
    public static void main(String[] args) {
        try(Door door=new Door(); Window window=new Window()){
            door.doWork();
            window.doWorkWindow();
        }catch (Exception ex){
            System.out.println("some ex");
        }
    }
}
