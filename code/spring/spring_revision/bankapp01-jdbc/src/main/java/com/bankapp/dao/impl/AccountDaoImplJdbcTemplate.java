package com.bankapp.dao.impl;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.exceptions.BankAccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@Primary
//@Profile("test")
public class AccountDaoImplJdbcTemplate implements AccountDao {

   private JdbcTemplate jdbcTemplate;

   @Autowired
    public AccountDaoImplJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Account> getAll() {
        List<Account> allAccounts=new ArrayList<>();
        String sql = "select * from account";
        return jdbcTemplate.query(sql, new AccountRowMapper());
    }
    @Override
    public void updateAccount(Account account) {
        String sql = "update account set balance =? where id=?";
        jdbcTemplate.update(sql, new Object[]{account.getBalance(), account.getId()});
    }
    @Override
    public Account getById(int id) {
       String getQuery="select * from account where id=?";
        Account account=jdbcTemplate.queryForObject(getQuery, new BeanPropertyRowMapper<Account>(Account.class),id);
        if(account==null)
            throw new BankAccountNotFoundException("account id "+ id+ " not found");
        return account;
    }
    @Override
    public void addAccount(Account account) {
        String sql = "INSERT INTO account (name, balance ) VALUES ( ?, ?)";
        jdbcTemplate.update(sql, new Object[]{account.getName(), account.getBalance()});
    }
    @Override
    public void deleteAccount(int id) {
        String sql = "delete from account where id=?";
        jdbcTemplate.update(sql,id);
    }
}
