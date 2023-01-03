package com.bankapp.model.dao;

import java.util.*;

import org.springframework.stereotype.Repository;
@Repository
public class AccountDaoImpl implements AccountDao {
	private Map<Integer, Account> accounts;
	
	public AccountDaoImpl() {
		accounts=new HashMap<Integer, Account>();
		accounts.put(1, new Account(1,"raj", 1000));
		accounts.put(2, new Account(2,"ekta", 1000));
		
	}
	
	@Override
	public List<Account> getAll() {
		return new ArrayList<Account>(accounts.values());
	}

	@Override
	public void update(Account account) {
		accounts.put(account.getId(), account);
	}

	@Override
	public Account getById(int id) {
		return accounts.get(id);
	}

	@Override
	public void addAccount(Account account) {
		
	}

	@Override
	public void deleteAccount(int id) {
		// TODO Auto-generated method stub
		
	}

}
