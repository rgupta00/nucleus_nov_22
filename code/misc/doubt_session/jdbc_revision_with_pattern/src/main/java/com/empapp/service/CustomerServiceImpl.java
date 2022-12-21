package com.empapp.service;

import com.empapp.dao.CustomerDao;
import com.empapp.dao.Customer;
import com.empapp.dao.impl.CustomerDaoImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private CustomerDao customerDao;
    public CustomerServiceImpl(){
        customerDao=new CustomerDaoImpl();
    }

    @Override
    public void populateData() {
        customerDao.populateData();
    }

    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }

    @Override
    public void addEmployee(Customer employee) {

        customerDao.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        customerDao.deleteEmployee(id);
    }

    @Override
    public void updateEmployee(int id, double salary) {
        customerDao.updateEmployee(id, salary);
    }

    @Override
    public void getById(int id) {
        customerDao.getById(id);
    }
}
