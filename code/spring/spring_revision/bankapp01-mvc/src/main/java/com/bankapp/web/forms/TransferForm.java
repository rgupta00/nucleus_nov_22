package com.bankapp.web.forms;

import lombok.Data;
//DTO pojo acting as a form bean
public class TransferForm {
    private int fromAccId;
    private  int toAccId;
    private double amount;

    public TransferForm(int fromAccId, int toAccId, double amount) {
        this.fromAccId = fromAccId;
        this.toAccId = toAccId;
        this.amount = amount;
    }

    public TransferForm() {
    }

    public int getFromAccId() {
        return fromAccId;
    }

    public void setFromAccId(int fromAccId) {
        this.fromAccId = fromAccId;
    }

    public int getToAccId() {
        return toAccId;
    }

    public void setToAccId(int toAccId) {
        this.toAccId = toAccId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
