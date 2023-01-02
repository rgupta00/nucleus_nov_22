package com.customerapp.service;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;
import com.customerapp.dao.impl.CustomerDaoImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    private CustomerDao customerDao;

    public CustomerServiceImpl(){
        customerDao=new CustomerDaoImpl();
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

    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }

    @Override
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }
}
