package com.demo;

public class VehicalFactory {
    public Vehical getVehical(String vehicalType) {
        Vehical vehical = null;
        if (vehicalType.equals("metro")) {
            vehical = new Metro();
        } else if (vehicalType.equals("car")) {
            vehical = new Car();
        }else {
            vehical=new DefaultVehical();
        }
        return vehical;
    }
}
