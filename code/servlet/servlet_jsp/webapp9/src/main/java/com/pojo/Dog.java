package com.pojo;

public class Dog {
    private String dogName;

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("dogName='").append(dogName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
