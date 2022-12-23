package com.demo;

public class Passanger {
    private String name;
    private Vehical vehical;

    public void setName(String name) {
        this.name = name;
    }
    public void setVehical(Vehical vehical) {
        this.vehical = vehical;
    }
    public void travel(){
        System.out.println("name of passanger : "+ name);
        vehical.move();
    }
}
