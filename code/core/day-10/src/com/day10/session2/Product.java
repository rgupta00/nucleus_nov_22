package com.day10.session2;

public class Product {
    private  int pId;
    private String pName;
    private double pCost;
    private double pDiscount;


    public Product(int pId, String pName, double pCost, double pDiscount) {
        this.pId = pId;
        this.pName = pName;
        this.pCost = pCost;
        this.pDiscount = pDiscount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("pId=").append(pId);
        sb.append(", pName='").append(pName).append('\'');
        sb.append(", pCost=").append(pCost);
        sb.append(", pDiscount=").append(pDiscount);
        sb.append('}');
        return sb.toString();
    }
}
