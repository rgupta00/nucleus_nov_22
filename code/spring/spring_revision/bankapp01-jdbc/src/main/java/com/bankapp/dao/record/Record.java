package com.bankapp.dao.record;

public class Record {
    private int id;
    private int fromAcc;
    private int toAcc;

    public Record(int id, int fromAcc, int toAcc) {
        this.id = id;
        this.fromAcc = fromAcc;
        this.toAcc = toAcc;
    }

    public Record(int fromAcc, int toAcc) {
        this.fromAcc = fromAcc;
        this.toAcc = toAcc;
    }

    public Record() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFromAcc() {
        return fromAcc;
    }

    public void setFromAcc(int fromAcc) {
        this.fromAcc = fromAcc;
    }

    public int getToAcc() {
        return toAcc;
    }

    public void setToAcc(int toAcc) {
        this.toAcc = toAcc;
    }
}
