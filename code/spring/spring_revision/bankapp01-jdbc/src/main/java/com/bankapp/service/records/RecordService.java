package com.bankapp.service.records;

import com.bankapp.dao.record.Record;

import java.util.List;

public interface RecordService {
    public List<Record> getAllRecords();
    public void addRecord(Record record);
}
