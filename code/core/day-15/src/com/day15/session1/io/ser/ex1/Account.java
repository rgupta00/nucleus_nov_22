package com.day15.session1.io.ser.ex1;

import java.io.Serializable;

public class Account implements Serializable {
	private int id;
	private String name;
	private double balance;
	static String bankName = "SBI";//static data dont support serilization

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [id=").append(id).append(", name=").append(name).append(", balance=").append(balance)
				.append(", bankName=").append(bankName).append("]");
		return builder.toString();
	}

	
}
