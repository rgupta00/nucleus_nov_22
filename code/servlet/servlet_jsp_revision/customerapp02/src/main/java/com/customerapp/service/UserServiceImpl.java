package com.customerapp.service;

import com.customerapp.dao.impl.UserDaoImpl;
import com.customerapp.dao.user.User;
import com.customerapp.dao.user.UserDao;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserServiceImpl(){
        userDao=new UserDaoImpl();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User validateUser(String username, String password, String profile) {
        return userDao.validateUser(username, password, profile);
    }
}
