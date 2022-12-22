package com.customerapp.service;

import com.customerapp.dao.customer.Customer;
import com.customerapp.dao.customer.CustomerDao;
import com.customerapp.dao.impl.CustomerDaoJdbcImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private CustomerDao customerDao;

    public CustomerServiceImpl(){

        customerDao=new CustomerDaoJdbcImpl();
    }
    @Override
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }

    @Override
    public void deleteCustomer(int id) {
        customerDao.deleteCustomer(id);
    }

    @Override
    public void updateCustomer(int id, Customer customer) {
        customerDao.updateCustomer(id, customer);
    }

    @Override
    public Customer getById(int id) {
        return customerDao.getById(id);
    }
}
