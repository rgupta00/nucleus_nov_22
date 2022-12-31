package com.customer.dao.impl;

import com.customer.dao.Customer;
import com.customer.dao.CustomerDao;
import com.customer.exception.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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
public class CustomerDaoImplJdbc implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerDaoImplJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public void deleteCustomer(int id) {
        jdbcTemplate.update("delete from customer where id=?", id);
    }
    @Override
    public Customer getById(int id) {
        return jdbcTemplate.queryForObject("select * from customer where id=?" ,new CustomerRowMapper(), id);
    }

    @Override
    public void updateCustomer(int id, Customer customer) {
    }

    @Override
    public List<Customer> getAll() {
        return jdbcTemplate.query("select * from customer" , new CustomerRowMapper());
    }
    @Override
    public void addCustomer(Customer customer)  {
       jdbcTemplate.update("insert into customer(name, address, mobile,email) values(?,?,?,?)",
               new Object[]{customer.getName(), customer.getAddress(), customer.getMobile(), customer.getEmail()});
    }
}













