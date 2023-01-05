package com.bankapp.dao.record;

import java.util.List;

public interface RecordDao {
    public List<Record> getAll();
    public void addRecord(Record record);
}
