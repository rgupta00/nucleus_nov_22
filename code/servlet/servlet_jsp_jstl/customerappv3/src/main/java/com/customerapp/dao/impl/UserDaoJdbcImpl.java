package com.customerapp.dao.impl;

import com.customerapp.dao.exceptions.UserNotFoundException;
import com.customerapp.dao.factory.ConnectionFactory;
import com.customerapp.dao.user.User;
import com.customerapp.dao.user.UserDao;

import java.sql.*;

public class UserDaoJdbcImpl implements UserDao {
    private Connection connection;

    public UserDaoJdbcImpl(){
        connection= ConnectionFactory.getConnection();
    }


    @Override
    public void addUser(User user) {
    //
    }

    @Override
    public User getUser(String username, String password) {

        User user=null;
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement
                            ("select * from users where name=? and password=?");
            pstmt.setString(1,username);
            pstmt.setString(2, password);

            // id | name    | address | mobile   | email
            ResultSet rs= pstmt.executeQuery();
            if (rs.next()){
                user=new User(
                        rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)
                );
            }
            if(user==null)
                throw new UserNotFoundException("user not found");
            connection.commit();
        }catch (SQLException ex){
            ex.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException e){}
        }
        return  user;

    }
}





