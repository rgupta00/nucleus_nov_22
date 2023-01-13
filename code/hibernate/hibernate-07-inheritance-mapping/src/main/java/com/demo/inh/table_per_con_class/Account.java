package com.demo.inh.table_per_con_class;

import javax.persistence.*;
@Entity
@Table(name = "account_table")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Account {
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int accountId;
	private String accountHolderName;
	private double balance;

	public Account() {}

	public Account(String accountHolderName, double balance) {
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Account{");
		sb.append("accountId=").append(accountId);
		sb.append(", accountHolderName='").append(accountHolderName).append('\'');
		sb.append(", balance=").append(balance);
		sb.append('}');
		return sb.toString();
	}
}