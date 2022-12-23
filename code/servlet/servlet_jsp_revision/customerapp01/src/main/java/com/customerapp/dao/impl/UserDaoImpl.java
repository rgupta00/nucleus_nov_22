package com.customerapp.dao.impl;

import com.customerapp.dao.customer.Customer;
import com.customerapp.dao.factory.ConnectionFactory;
import com.customerapp.dao.user.User;
import com.customerapp.dao.user.UserDao;
import com.customerapp.exceptions.CustomerNotFoundException;
import com.customerapp.exceptions.UserNotFoundException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    private Connection connection;

    public UserDaoImpl(){
        connection= ConnectionFactory.getConnection();
    }
    @Override
    public void addUser(User user) {
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection
                    .prepareStatement("insert into users(name, password, profile) values(?,?,?)");
            pstmt.setString(1,user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3,user.getProfile());
            pstmt.executeUpdate();
            connection.commit();
        }catch (SQLException ex){
            try{
                connection.rollback();
            }catch (SQLException e){
                e.printStackTrace();
            }
            ex.printStackTrace();
        }
    }

    @Override
    public User validateUser(String username, String password, String profile) {
        User user=null;
        try {
            PreparedStatement pstmt = connection.prepareStatement("select * from users where name=? and password=? and profile=?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, profile);
            ResultSet rs=pstmt.executeQuery();
            //|id | name  | password | profile
            if (rs.next()){
               user=new User(rs.getInt(1),
                       rs.getString(2),
                       rs.getString(3),
                       rs.getString(4));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        if (user==null)
            throw  new UserNotFoundException("customer with is not found");
        return user;
    }
}





