package com.cityapp;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<String> touristDestination;

    public City(String name) {
        this.name = name;
        this.touristDestination=new ArrayList<>();
    }
    public void addTouristDestination(String dest){
        touristDestination.add(dest);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("name='").append(name).append('\'');
        sb.append(", touristDestination=").append(touristDestination);
        sb.append('}');
        return sb.toString();
    }
}
