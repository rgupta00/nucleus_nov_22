package com.customer.dao.impl;

import com.customer.dao.Customer;
import com.customer.dao.CustomerDao;
import com.customer.exception.DataAccessException;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CustomerDaoImpMongodb implements CustomerDao {
    @Override
    public List<Customer> getAll() {
        System.out.println("using hiberante: getAllCustomer");
        return null;
    }

    @Override
    public void addCustomer(Customer customer) throws HibernateException {
        System.out.println("addCustomer: using mongodb");
        try{
            if(1==2)
                throw  new HibernateException("some sql prob");
        }catch (HibernateException ex){
            throw  new DataAccessException(ex);
        }
    }
}
