package com.bankapp.web.forms;

//DTO pojo acting as a form bean
public class WithdrawForm {
    private int accId;
    private double amount;

    public WithdrawForm() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public WithdrawForm(int accId, double amount) {
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
