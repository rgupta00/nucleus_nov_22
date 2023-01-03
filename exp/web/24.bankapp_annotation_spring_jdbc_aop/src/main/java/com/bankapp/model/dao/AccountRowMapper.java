package com.bankapp.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AccountRowMapper implements RowMapper<Account>{

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account= new Account
				(rs.getInt(1), rs.getString(3), rs.getDouble(2));
		return account;
	}

}
