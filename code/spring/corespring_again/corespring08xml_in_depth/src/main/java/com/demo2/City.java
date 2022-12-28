package com.demo2;

public class City {
    private String cityName;
    private long population;
    private int touristDestination;

    public City(String cityName, long population, int touristDestination) {
        this.cityName = cityName;
        this.population = population;
        this.touristDestination = touristDestination;
    }

    public City() {}

    public int getTouristDestination() {
        return touristDestination;
    }

    public void setTouristDestination(int touristDestination) {
        this.touristDestination = touristDestination;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("cityName='").append(cityName).append('\'');
        sb.append(", population=").append(population);
        sb.append(", touristDestination=").append(touristDestination);
        sb.append('}');
        return sb.toString();
    }
}
