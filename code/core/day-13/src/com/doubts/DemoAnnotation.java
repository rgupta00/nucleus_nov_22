package com.doubts;

import java.util.ArrayList;
import java.util.List;

/*
    What is annotation aka meta data, java 5
    readay made ann
    create ur own annotation
 */
class A{
    void foo(){

    }
    @Deprecated
    @SuppressWarnings({"all","unused"})
    public void oldApi(){
        List l=new ArrayList();
        System.out.println("writeen in 208");
    }
}

class B extends  A{
    @Override
    void foo(){
    }
    public void newApi(){
        System.out.println("writeen in 2021");
    }
}
public class DemoAnnotation {
    public static void main(String[] args) {
        A a=new B();
        a.oldApi();

    }
}
