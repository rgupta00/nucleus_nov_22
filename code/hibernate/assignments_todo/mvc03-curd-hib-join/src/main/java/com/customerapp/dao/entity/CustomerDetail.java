package com.customerapp.dao.entity;

import javax.persistence.*;
import java.util.Objects;

//DTo  id | name  | address | mobile    | email
@Entity
@Table(name = "cust_detail_table_hib")
public class CustomerDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custDetail;
    private String address;
    private String mobile;
    private String email;

    public CustomerDetail() {
    }

    public CustomerDetail( String address, String mobile, String email) {
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public CustomerDetail(int custDetail,  String address, String mobile, String email) {
        this.custDetail = custDetail;

        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public int getCustDetail() {
        return custDetail;
    }

    public void setCustDetail(int custDetail) {
        this.custDetail = custDetail;
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
        final StringBuilder sb = new StringBuilder("CustomerDetail{");
        sb.append("custDetail=").append(custDetail);
        sb.append(", address='").append(address).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
