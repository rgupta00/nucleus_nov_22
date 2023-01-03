package com.bankapp.model.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.dao.Account;
import com.bankapp.model.dao.AccountDao;
import com.bankapp.model.dao.AccountDaoImpl;
import com.bankapp.model.service.aspect.MyAppLogging;
import com.bankapp.model.service.exceptions.MyAppAccountNotFoundException;
import com.bankapp.model.service.exceptions.NotYetImplementedException;
@Service(value = "accountService")
@Transactional
public class AccountServiceImpl implements AccountService {
	
	private AccountDao dao;
	
	
	@Autowired
	public void setDao(AccountDao dao) {
		this.dao = dao;
	}

	
	public AccountServiceImpl() {}

	public AccountServiceImpl(AccountDao dao) {
		this.dao = dao;
	}
	
    @MyAppLogging
	@Override
	public List<Account> getAll() {
		List<Account> allAccounts= dao.getAll();
		return allAccounts;
	}

	@Override
	public Account getById(int id) {
		return dao.getById(id);
	}

	@Override
	public void transfer(int fromAccId, int toAccId, double amount) {
		
		Account fromAcc=dao.getById(fromAccId);
		Account toAcc=dao.getById(toAccId);
		
		fromAcc.setBalance(fromAcc.getBalance()-amount);
		toAcc.setBalance(toAcc.getBalance()+amount);
		
		dao.update(fromAcc);
		
		if(1==1)
			throw new NullPointerException();
		dao.update(toAcc);
		
		System.out.println("fund is transfred...");
		
	}
	
	@MyAppLogging
	public void addAccount(Account account) {
		dao.addAccount(account);
	}
	
	@Override
	public void deleteAccount(int id) {
		dao.deleteAccount(id);
	}

	
	@Override
	public void withdraw(int id, double amount) {
		//logic
		Account accountToUpdate= dao.getById(id);
		if(accountToUpdate==null)
			throw new MyAppAccountNotFoundException("account with id: "+ id +" is not found");
		accountToUpdate.setBalance(accountToUpdate.getBalance()-amount);
		dao.update(accountToUpdate);
	}


	@Override
	public void deposit(int id, double amount) {
		Account accountToUpdate= dao.getById(id);
		if(accountToUpdate==null)
			throw new MyAppAccountNotFoundException("account with id: "+ id +" is not found");
		accountToUpdate.setBalance(accountToUpdate.getBalance()+amount);
		dao.update(accountToUpdate);
	}

}












