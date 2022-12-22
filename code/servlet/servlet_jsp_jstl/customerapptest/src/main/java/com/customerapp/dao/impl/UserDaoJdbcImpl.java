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
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement("insert into users(name, password,profile) values(?,?,?)");
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getProfile());

            pstmt.executeUpdate();
            connection.commit();
        }catch (SQLException ex){
            ex.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException e){}
        }
    }

    @Override
    public User getUser(String username, String password, String profile) {

        User user=null;
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement
                            ("select * from users where name=? and password=? and profile=?");
            pstmt.setString(1,username);
            pstmt.setString(2, password);
            pstmt.setString(3, profile);

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





