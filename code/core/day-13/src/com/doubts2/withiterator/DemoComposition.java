package com.doubts2.withiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Flat{
    private int flatId;
    private String flatNo;
    private String flatOwner;
    public Flat(int flatId, String flatNo, String flatOwner) {
        this.flatId = flatId;
        this.flatNo = flatNo;
        this.flatOwner = flatOwner;
    }

    public int getFlatId() {
        return flatId;
    }


    public String getFlatNo() {
        return flatNo;
    }


    public String getFlatOwner() {
        return flatOwner;
    }

    public void setFlatOwner(String flatOwner) {
        this.flatOwner = flatOwner;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flat{");
        sb.append("flatId=").append(flatId);
        sb.append(", flatNo='").append(flatNo).append('\'');
        sb.append(", flatOwner='").append(flatOwner).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
//
class Building implements Iterable<Flat>{
    private String buildingName;

    private List<Flat> flats;
    private   static int flatCounter;

    public Building(String buildingName) {
        this.buildingName = buildingName;
        this.flats=new ArrayList<>();
        flatCounter=0;
    }
    public void setFlatInfo(String address, String ownerName) {
       flats.add(new Flat(++flatCounter, address, ownerName));
    }
    public  void printFlats(){
          System.out.println("--------flat information ---------");
          System.out.println("building name : "+ buildingName);
         flats.forEach(f-> System.out.println(f));
    }

    public String getBuildingName() {
        return buildingName;
    }

    @Override
    public Iterator<Flat> iterator() {
        return new MyFlatIterator();
    }
    class MyFlatIterator implements Iterator<Flat>{
        private  int counter=0;

        @Override
        public boolean hasNext() {
            return counter<flats.size();
        }

        @Override
        public Flat next() {
            return flats.get(counter++);
        }

    }
}
public class DemoComposition {
    public static void main(String[] args) {
        Building building=new Building("druga apt");
        building.setFlatInfo("a12","raj");

       building.iterator().forEachRemaining(f-> System.out.println(f));


    }
}
