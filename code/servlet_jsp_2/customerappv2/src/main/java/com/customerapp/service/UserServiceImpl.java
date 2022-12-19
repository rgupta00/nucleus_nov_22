package com.customerapp.service;

import com.customerapp.dao.impl.UserDaoJdbcImpl;
import com.customerapp.dao.user.User;
import com.customerapp.dao.user.UserDao;

public class UserServiceImpl  implements UserService{

    private UserDao userDao;

    public UserServiceImpl(){
        userDao=new UserDaoJdbcImpl();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getUser(String username, String password) {
        return userDao.getUser(username, password);
    }
}
