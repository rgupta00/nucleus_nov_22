package com.customerapp.dao.customer;

public class Address {
    private int aid;
    private String state;
    private String country;

    public Address() {
    }


    public Address(String state, String country) {
        this.state = state;
        this.country = country;
    }


    public Address(int aid, String state, String country) {
        this.aid = aid;
        this.state = state;
        this.country = country;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("aid=").append(aid);
        sb.append(", state='").append(state).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

