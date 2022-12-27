package com.demo;
//DIP vs DI
public class Passanger {
    private String name;
    private Vehical Vehical;

    public Passanger(){
        System.out.println("it is the ctr of passanger");
    }

    public String getName() {
        return name;
    }

    public Vehical getVehical() {
        return Vehical;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehical(Vehical vehical) {
        Vehical = vehical;
    }

    public void travel(){
        System.out.println("name of passanger : "+ name);
        Vehical.move();
    }
}
