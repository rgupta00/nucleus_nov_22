package com.bankapp.model.service;

import com.bankapp.model.dao.CustomerDao;
import com.bankapp.model.dao.LoanDao;
import com.bankapp.model.dao.impl.CustomerDaoImpl;
import com.bankapp.model.dao.impl.LoanDaoImpl;
import com.bankapp.model.dto.Customer;
import com.bankapp.model.dto.Loan;

public class BankServiceImpl implements  BankService{
    private CustomerDao customerDao;
    private LoanDao loanDao;

    public BankServiceImpl(){
        customerDao=new CustomerDaoImpl();
        loanDao=new LoanDaoImpl();
    }
    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void updateCustomer(int id, Customer customer) {

    }

    @Override
    public Customer getCustomerById(int id) {
        return null;
    }

    @Override
    public void deleteCustomer(int id) {

    }

    @Override
    public void addLoan(Loan loan) {

    }
}
