package com.bankapp.dao;
import java.util.*;
public interface AccountDao {
    public List<Account> getAll();
    public Account updateAccount(Account account);
    public Account getById(int id);
    public void addAccount(Account account);
    public void deleteAccount(int id);
}
