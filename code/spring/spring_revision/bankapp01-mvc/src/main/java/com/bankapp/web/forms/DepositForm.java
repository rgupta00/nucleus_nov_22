package com.bankapp.web.forms;

//DTO pojo acting as a form bean
public class DepositForm {
    private int accId;
    private double amount;

    public DepositForm() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public DepositForm(int accId, double amount) {
        this.accId = accId;
        this.amount = amount;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }
}
