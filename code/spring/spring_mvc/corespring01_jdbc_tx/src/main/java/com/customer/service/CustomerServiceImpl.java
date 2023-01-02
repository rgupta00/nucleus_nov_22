package com.customer.service;

import com.customer.dao.Customer;
import com.customer.dao.CustomerDao;
import com.customer.service.aspect.MyLoggingAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service(value = "customerService")
@Transactional//AOP to do tx mgt*
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private final CustomerDao customerDao;

    @Autowired
    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @MyLoggingAnnotation
    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }

    @Override
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
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
