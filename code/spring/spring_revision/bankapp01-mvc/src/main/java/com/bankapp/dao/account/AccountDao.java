package com.bankapp.dao.account;
import com.bankapp.dao.account.Account;

import java.util.*;
public interface AccountDao {
    public List<Account> getAll();
    public void updateAccount(Account account);
    public Account getById(int id);
    public void addAccount(Account account);
    public void deleteAccount(int id);
}
