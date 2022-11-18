package com.bankapp.dao;

public class Account {
    private  int id;
    private String name;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public  void print(){
        System.out.println("id: "+ id+" name: "+ name);
    }
}
