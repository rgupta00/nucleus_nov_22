package com.demo.inh.table_per_class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class CurrentAccount extends Account {
	
	private double overdraft;

	public CurrentAccount(String accountHolderName, double balance, double overdraft) {
		super(accountHolderName, balance);
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	

	public CurrentAccount() {}

	@Override
	public String toString() {
		return   super.toString()+": "+ overdraft;
	}

}