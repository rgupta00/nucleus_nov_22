package com.bankapp.dao.record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RecordDaoImpl implements RecordDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public RecordDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Record> getAll() {

        return jdbcTemplate.query("select * from Record", new RecordRowMapper());
    }

//    private static RowMapper<Record> convertToRow() {
//      return ( rs,  rowNum) ->{
//                Record record=new Record();
//                record.setId(rs.getInt(1));
//                record.setFromAcc(rs.getInt(2));
//                record.setToAcc(rs.getInt(3));
//                return record;
//            };
//    }

    @Override
    public void addRecord(Record record) {
        jdbcTemplate.update("insert into Record(from_acc, to_acc) values(?,?)",new Object[]{record.getFromAcc(), record.getToAcc()});
    }
}
