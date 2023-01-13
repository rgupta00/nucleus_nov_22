package com.productapp.model.service.impl;

import com.productapp.model.dao.UserDao;
import com.productapp.model.dao.entities.UserEntity;
import com.productapp.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

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
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userDao.addUser(user);
    }

    @Override
    public UserEntity getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }
}
