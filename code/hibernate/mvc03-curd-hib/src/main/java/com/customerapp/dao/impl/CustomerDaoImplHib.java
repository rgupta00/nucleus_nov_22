package com.customerapp.dao.impl;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;
import com.customerapp.exception.CustomerNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Primary
public class CustomerDaoImplHib implements CustomerDao {

    private SessionFactory sessionFactory;

    @Autowired
    public CustomerDaoImplHib(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession(){
        return sessionFactory.getCurrentSession();//as hiberate is manged by spring
    }
    @Override
    public List<Customer> getAll() {
        return getSession().createQuery("select c from Customer c",Customer.class).list();
    }

    @Override
    public void addCustomer(Customer customer) {
        getSession().save(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        Customer customerToDelete=getById(id);
        getSession().remove(customerToDelete);
    }

    @Override
    public void updateCustomer(int id, Customer customer) {
        Customer customerToUpate=getById(id);
        customerToUpate.setAddress(customer.getAddress());
        //
        getSession().merge(customerToUpate);
    }

    @Override
    public Customer getById(int id) {
        Customer customer= getSession().get(Customer.class, id);
        if(customer==null)
            throw new CustomerNotFoundException("customer with id "+ id+" is not found");
        return customer;
    }
}
