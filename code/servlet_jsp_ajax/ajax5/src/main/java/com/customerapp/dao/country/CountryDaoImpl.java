package com.customerapp.dao.country;

import com.customerapp.dao.factory.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CountryDaoImpl implements CountryDao{
    private Connection connection;

    public CountryDaoImpl(){
        connection= ConnectionFactory.getConnection();
    }

    @Override
    public List<Country> getAllCounties() {
        List<Country> countries=new ArrayList<>();
        Country country=null;
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement
                            ("select * from country");

            // cid | cname
            ResultSet rs= pstmt.executeQuery();
            while (rs.next()){
                country=new Country(rs.getInt(1), rs.getString(2));
                countries.add(country);
            }
            connection.commit();
        }catch (SQLException ex){
            ex.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException e){}
        }

        return  countries;
    }

    @Override
    public List<State> getStateByCountryId(int cid) {
        List<State> states=new ArrayList<>();
        State state=null;
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement
                            ("select * from state where cid_fk=?");
            pstmt.setInt(1, cid);
            // sid | sname
            ResultSet rs= pstmt.executeQuery();
            while (rs.next()){
                state=new State(rs.getInt("sid"), rs.getString("sname"));
                states.add(state);
            }
            connection.commit();
        }catch (SQLException ex){
            ex.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException e){}
        }

        return  states;
    }
}
