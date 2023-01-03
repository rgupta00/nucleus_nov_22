package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.dao.Account;

public interface AccountService {
	public List<Account> getAll();
	public Account getById(int id);
	public void transfer(int fromAccId, int toAccId, double amount);
	public void addAccount(Account account);
	public void deleteAccount(int id);
	public void withdraw(int id, double amount);
	public void deposit(int id, double amount);
	
}
