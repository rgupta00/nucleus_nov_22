package com.productapp.model.service;

import com.productapp.model.dao.entities.UserEntity;

import java.util.List;

public interface UserService {
    public List<UserEntity> getAllUsers();
    public void addUser(UserEntity user);
    public UserEntity getUserByEmail(String email);

}
