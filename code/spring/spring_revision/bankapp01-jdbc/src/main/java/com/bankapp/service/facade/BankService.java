package com.bankapp.service.facade;

import com.bankapp.dao.account.Account;
import com.bankapp.dao.record.Record;
import com.bankapp.exceptions.BException;

import java.util.List;

public interface BankService {
    public List<Account> getAll();
    public void transfer(int fromId, int toId, double amount)throws BException;
    public void deposit(int id, double amount);
    public void withdraw(int id, double amount);
    public Account getById(int id);
    public void addAccount(Account account);
    public void deleteAccount(int id);

    public List<Record> getAllRecords();
    public void addRecord(Record record);

}
