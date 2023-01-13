package com.productapp.model.service;

import com.productapp.model.dao.UserDao;
import com.productapp.model.dao.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{

    private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void addUser(UserEntity user) {
        userDao.addUser(user);
    }

    @Override
    public UserEntity getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }
}
