package com.doubts;
import  java.util.*;
//Building<>-----Flat
class Flat{
    private int flatNo;
    private String address;
    private String ownerName;
    private Double marketValue;

    public Flat(int flatNo, String address, String ownerName, Double marketValue) {
        this.flatNo = flatNo;
        this.address = address;
        this.ownerName = ownerName;
        this.marketValue = marketValue;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public String getAddress() {
        return address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Double getMarketValue() {
        return marketValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flat{");
        sb.append("flatNo=").append(flatNo);
        sb.append(", address='").append(address).append('\'');
        sb.append(", ownerName='").append(ownerName).append('\'');
        sb.append(", marketValue=").append(marketValue);
        sb.append('}');
        return sb.toString();
    }
}
class Buidling{
    private String buildingName;
    private List<Flat> flats;
    private int counter=0;

    public Buidling(String buildingName) {
        this.buildingName = buildingName;
        flats=new ArrayList<>();
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public void addFlat(String address, String ownerName, Double marketValue){
        this.flats.add(new Flat(++counter, address, ownerName, marketValue));
    }
    public List<Flat> getFlats() {
        return new ArrayList<>(flats);
    }

}
public class CompostionAndAgg {
    public static void main(String[] args) {

        Buidling buidling=new Buidling("durga apt");

        buidling.addFlat("A111","raj",78.0);
        buidling=null;

    }
}
