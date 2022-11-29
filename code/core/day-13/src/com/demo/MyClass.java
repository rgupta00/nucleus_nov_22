package com.demo;
/*
    pacakge private class: a class is stb if it have default visiblity
     if a class have public modifer then only it can be access in other packages

 */
public class MyClass {
    //public class public method can be access in any way
    public void f1(){
        System.out.println("f1 method public");
    }
    //pubilc class and defult method : can not be access in any way in other pakage
     void f2(){
        System.out.println("f1 method default");
    }
    //pubilc class and protected method : can not be access in any way in other pakage iff the package class sub cclass that class
    protected void f3(){
        System.out.println("f1 method protected");
    }
    //pubilc class and privage method : can not be access outside this class in any way
    private void f4(){
        System.out.println("f1 method private");
    }
}
