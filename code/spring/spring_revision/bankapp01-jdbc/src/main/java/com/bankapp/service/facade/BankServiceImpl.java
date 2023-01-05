package com.bankapp.service.facade;

import com.bankapp.dao.account.Account;
import com.bankapp.dao.record.Record;
import com.bankapp.exceptions.BException;
import com.bankapp.service.accounts.AccountService;
import com.bankapp.service.records.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service(value = "bs")
@Transactional
public class BankServiceImpl implements BankService {

    private AccountService accountService;

    private RecordService recordService;

    @Autowired
    public BankServiceImpl(AccountService accountService, RecordService recordService) {
        this.accountService = accountService;
        this.recordService = recordService;
    }

    @Override
    public List<Account> getAll() {
        return accountService.getAll();
    }

    //t
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void transfer(int fromId, int toId, double amount) throws BException {
        accountService.transfer(fromId, toId, amount);

        recordService.addRecord(new Record(fromId, toId));

        /*if(1==1)
            throw new RuntimeException();*/
    }

    @Override
    public void deposit(int id, double amount) {
        accountService.deposit(id, amount);
    }

    @Override
    public void withdraw(int id, double amount) {
        accountService.withdraw(id, amount);
    }

    @Override
    public Account getById(int id) {
        return accountService.getById(id);
    }

    @Override
    public void addAccount(Account account) {
        accountService.addAccount(account);
    }

    @Override
    public void deleteAccount(int id) {
        accountService.deleteAccount(id);
    }

    @Override
    public List<Record> getAllRecords() {
        return recordService.getAllRecords();
    }

    @Override
    public void addRecord(Record record) {
        recordService.addRecord(record);
    }
}
