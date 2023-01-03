package com.customerapp.dao;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//DTO
public class Customer {
    //id | name  | address | mobile    | email
    private int id;
    private String name;
    private String address;
    private String mobile;
    private String email;
    private String customertype;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dob;
    
    
    
        public String getCustomertype() {
		return customertype;
	}

	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

		public Customer(){}

    public Customer( String name, String address, String mobile, String email) {

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

    
    
    
    public Customer(int id, String name, String address, String mobile, String email, String customertype, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.customertype = customertype;
		this.dob = dob;
	}

	public Customer(String name, String address, String mobile, String email, String customertype, Date dob) {
		super();
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.customertype = customertype;
		this.dob = dob;
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
}
