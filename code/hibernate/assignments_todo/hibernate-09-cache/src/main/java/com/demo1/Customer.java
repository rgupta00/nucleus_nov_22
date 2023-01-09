package com.demo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cust_table")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;
	private String customerName;
	private String customerAddess;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddess() {
		return customerAddess;
	}
	public void setCustomerAddess(String customerAddess) {
		this.customerAddess = customerAddess;
	}
	public Customer(String customerName, String customerAddess) {
		this.customerName = customerName;
		this.customerAddess = customerAddess;
	}
	public Customer() {}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddess="
				+ customerAddess + "]";
	}
	
	
}
