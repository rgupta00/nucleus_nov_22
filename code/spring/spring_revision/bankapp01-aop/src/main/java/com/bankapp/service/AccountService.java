package com.bankapp.service;

import com.bankapp.dao.Account;

import java.util.List;

public interface AccountService {
    public List<Account> getAll();
    public void transfer(int fromId, int toId, double amount);
    public void deposit(int id, double amount);
    public void withdraw(int id, double amount);
    public Account getById(int id);
    public void addAccount(Account account);
    public void deleteAccount(int id);
}
