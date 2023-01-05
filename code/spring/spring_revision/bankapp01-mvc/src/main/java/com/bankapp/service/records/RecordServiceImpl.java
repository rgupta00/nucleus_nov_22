package com.bankapp.service.records;

import com.bankapp.dao.record.Record;
import com.bankapp.dao.record.RecordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service(value = "recordService")
@Transactional
public class RecordServiceImpl implements RecordService{
    private RecordDao recordDao;

    @Autowired
    public RecordServiceImpl(RecordDao recordDao) {
        this.recordDao = recordDao;
    }
    @Override
    public List<Record> getAllRecords() {
        return recordDao.getAll();
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void addRecord(Record record) {
        recordDao.addRecord(record);
    }
}
