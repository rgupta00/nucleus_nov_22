package com.customerapp.dao.customer;

public class Address {
    private  int aid;
    private String state;
    private String country;

    public int getAid() {
        return aid;
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

    public Address() {
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

    public Address(int id, String state, String country) {
        this.aid = id;
        this.state = state;
        this.country = country;
    }

}
