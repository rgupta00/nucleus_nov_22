package com.bankapp.dao.impl;

import com.bankapp.dao.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        //how to convert a tuple to java object
        Account account=new Account();
        account.setId(rs.getInt(1));
        account.setName(rs.getString(2));
        account.setBalance(rs.getDouble(3));
        return account;
    }
}
