package com.cityapp;

public class CityApi {
    public City getCity(String cityName){
        try{
            Thread.sleep(300);
        }catch (InterruptedException ex){}

        City city=  new City("banglore");
        city.addTouristDestination("Bangatta NP");

        return city;

    }
}
