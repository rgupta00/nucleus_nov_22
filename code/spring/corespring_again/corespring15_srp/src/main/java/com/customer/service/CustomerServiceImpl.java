package com.customer.service;

import com.customer.dao.Customer;
import com.customer.dao.CustomerDao;
import com.customer.dao.impl.CustomerDaoImpHib;
import com.customer.dao.impl.CustomerDaoImplJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private final CustomerDao customerDao;

    @Autowired
    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
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
