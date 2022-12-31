package com.customer.dao.impl;

import com.customer.dao.Customer;
import com.customer.dao.CustomerDao;
import com.customer.exception.DataAccessException;
import org.hibernate.HibernateException;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
@Repository
//@Primary
public class CustomerDaoImpHib implements CustomerDao {
    @Override
    public List<Customer> getAll() {
        System.out.println("using hiberante: getAllCustomer");
        return null;
    }

    @Override
    public void addCustomer(Customer customer) throws HibernateException {
        System.out.println("addCustomer: using jdbc");
        try{
            if(1==2)
                throw  new HibernateException("some sql prob");
        }catch (HibernateException ex){
            throw  new DataAccessException(ex);
        }
    }
}
