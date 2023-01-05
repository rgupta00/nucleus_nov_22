package com.bankapp.dao.record;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RecordRowMapper implements RowMapper<Record> {
    @Override
    public Record mapRow(ResultSet rs, int rowNum) throws SQLException {
        Record record=new Record();
        record.setId(rs.getInt(1));
        record.setFromAcc(rs.getInt(2));
        record.setToAcc(rs.getInt(3));
        return record;
    }
}
