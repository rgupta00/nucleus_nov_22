package com.cutomerapp.service;

import com.cutomerapp.dao.Customer;
import com.cutomerapp.dao.CustomerDao;
import com.cutomerapp.dao.impl.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService{

    private CustomerDao customerDao;

    public CustomerServiceImpl(){

        customerDao=new CustomerDaoImpl();
    }
    @Override
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }
}









