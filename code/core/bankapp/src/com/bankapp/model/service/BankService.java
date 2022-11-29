package com.bankapp.model.service;

import com.bankapp.model.dto.Customer;
import com.bankapp.model.dto.Loan;

public interface BankService {
    //
    public void addCustomer(Customer customer);
    public void updateCustomer(int id, Customer customer);
    public Customer getCustomerById(int id);
    public void deleteCustomer(int id);
    public void addLoan(Loan loan);

}
