package com.customerapp.dao;

import java.util.Objects;

//DTo  id | name  | address | mobile    | email
public class Customer {
    private int id;
    private String name;
    private String address;
    private String mobile;
    private String email;

    public Customer() {
    }

    public Customer(String name, String address, String mobile, String email) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public Customer(int id, String name, String address, String mobile, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setname is called");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (!Objects.equals(name, customer.name)) return false;
        if (!Objects.equals(address, customer.address)) return false;
        if (!Objects.equals(mobile, customer.mobile)) return false;
        return Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
