package com.demo2;

import java.util.Map;
import java.util.function.BiConsumer;

public class Country {
    private String countryName;
    private Map<String, City> cityMap;  //cityName,
    private Map<String, String> capital;//india-> delhi

    public void printCountryDetails(){
        System.out.println("countryName: "+ countryName);
        System.out.println("cityMap");
        cityMap.forEach((String cityName, City cityDetails)-> System.out.println(cityName+": "+cityDetails));
        capital.forEach((countryName, capital)-> System.out.println(countryName+": "+capital));

    }
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Map<String, City> getCityMap() {
        return cityMap;
    }

    public void setCityMap(Map<String, City> cityMap) {
        this.cityMap = cityMap;
    }

    public Map<String, String> getCapital() {
        return capital;
    }

    public void setCapital(Map<String, String> capital) {
        this.capital = capital;
    }
}
